package problem_41;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

public class Problem_41 {
	
	private int biggestPrime = 0;
	
	private void start() {
		
		char[] calculatedRange = calculateRange();
		
		searchPandigital(calculatedRange);
		
		System.out.println("Largest n-digit pandigital prime [" + biggestPrime + "]");
		
	}
	
	private boolean isPandigital(int number, char[] calculatedRange) {
		
		char[] cs = ("" + number).toCharArray();
		
		Arrays.sort(cs);
		
		Arrays.sort(calculatedRange);
		
		if (new String(cs).equals(new String(calculatedRange))) {
			
			return true;
			
		}
		
		return false;
	}
	
	private boolean isPrime(int number) {
		
		if (number % 2 == 0 || number % 3 == 0) {
			
			return false;
			
		}
		
		for (int i = 5; i < number; i++) {
			
			if (number % i == 0) {
				
				return false;
				
			}
			
		}
		
		return true;
		
	}

	private void searchPandigital(char[] calculatedRange) {
		
		int number = Integer.parseInt(new String(calculatedRange));
		
		while (biggestPrime < number) {
			
			if (isPandigital(number, calculatedRange)) {
				
				if (isPrime(number)) {
					
					biggestPrime = number;
					
				}
				
			}
			
			number -= 2;
			
		}
		
		
		
	}

	private char[] calculateRange() {
		
		boolean calculate = true;
		
		int digits = 123456789;
		
		int digitsTemp = digits;
		
		int temp = 0;
		
		char[] range = new char[("" + digits).length()];
		
		while (calculate) {
			
			digitsTemp = digits;
			
			temp = 0;
			
			range = new char[("" + digits).length()];
			
			for (int i = 0; i < range.length; i++) {
				
				temp += digitsTemp % 10;
				
				range[i] = ("" + (digitsTemp % 10)).charAt(0);
				
				digitsTemp /= 10;
				
			}
			
			if (temp % 3 == 0) {
				
				digits /= 10;
				
			} else {
				
				calculate = false;
				
			}
			
		}

		return range;
	}

	public static void main(String[] args) {
		
		long startTime = System.nanoTime();
		
		Problem_41 problem_41 = new Problem_41();
		
		problem_41.start();
		
		System.out.println("Total time " + TimeUnit.NANOSECONDS.toSeconds(System.nanoTime() - startTime));
		
	}

}
