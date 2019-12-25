package problem_43;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class Problem_43 {

	private static int[] primes = { 2, 3, 5, 7, 11, 13, 17 };
	
	private static ArrayList<String> list = new ArrayList<String>();
	
	private static long sum = 0L;

	public static void main(String[] args) {
		
		long startTime = System.nanoTime();

		Problem_43 p43 = new Problem_43();
		
		p43.permutate("", "9876543210");
		
		p43.search();
		
		System.out.println("Sum " + sum);
		
		System.out.println("Total time is [" + TimeUnit.NANOSECONDS.toSeconds(System.nanoTime() - startTime) + "] seconds.");

	}

	private void search() {
		
		for (String string : list) {
			
			sum += isDivisable(string);
			
		}
		
	}

	private long isDivisable(String string) {
		
		int divisorIndex = primes.length - 1;
		
		for (int i = string.length() - 1; i > 2; i--) {
			
			int number = getNumber(string, i, i - 1, i - 2);
			
			if (number % primes[divisorIndex] != 0) {
				
				return 0;
				
			}
			
			divisorIndex--;
			
		}
		
		return Long.parseLong(string);
	}

	private int getNumber(String string, int i, int j, int k) {
		
		String s = "";
		
		s = "" + string.charAt(k) + string.charAt(j) + string.charAt(i);
		
		return Integer.parseInt(s);
		
	}

	private void permutate(String prefix, String sufix) {
		
		if (sufix.length() == 0) {
			
			list.add(prefix);
			
		} else {
			
			for (int i = 0; i < sufix.length(); i++) {
				
				permutate(prefix + sufix.charAt(i), sufix.substring(0, i) + sufix.substring(i + 1, sufix.length()));
				
			}
			
		}
		
	}

}
