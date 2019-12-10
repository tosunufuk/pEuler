package Problem_36;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Problem_36 {

	private static HashMap<Integer,Boolean> palindromes = new HashMap<Integer, Boolean>();
	
	private static int sum = 0;

	public static void main(String[] args) {
		
		long startTime = System.nanoTime();

		calculatePalindromes(1000000);
		
		checkBaseTwo();
		
		System.out.println("Sum of palindromic number in base 10 and base 2 : " + sum);
		
		System.out.println("Total time " + TimeUnit.NANOSECONDS.toSeconds(System.nanoTime() - startTime));

	}

	private static void calculatePalindromes(int maxSize) {
		
		int reversed = 0;

		int remainder = 0;

		int temp = 0;

		for (int palindrome = 1; palindrome < maxSize; palindrome++) {

			reversed = 0;

			remainder = 0;

			temp = palindrome;

			while (temp != 0) {

				remainder = temp % 10;

				reversed = (reversed * 10) + remainder;

				temp /= 10;

			}

			if (palindrome == reversed) {

				palindromes.put(palindrome, false);

			}

		}

	}
	
	private static boolean getBaseTwoPalindrome(Integer integer) {
		
		String input = Integer.toBinaryString(integer);
		
		char[] chars = input.toCharArray();
		
		String reversed = "";
		
		for (int i = chars.length-1; i>=0; i--) {
			
			reversed += chars[i];
			
		}
		
		if (reversed.equals(input)) {
			
			sum += integer;
			
			return true;
			
		}
		
		return false;
		
	}
	
	private static void checkBaseTwo() {
		
		Set<Integer> key = palindromes.keySet();
		
		for (Iterator<Integer> iterator = key.iterator(); iterator.hasNext();) {
			
			Integer integer = (Integer) iterator.next();
			
			if (palindromes.get(integer) == Boolean.FALSE) {
				
				palindromes.put(integer, getBaseTwoPalindrome(integer));
				
			}
			
		}
		
	}

}
