package Problem_35;

import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

public class Problem_35 {

	private static HashSet<Integer> primes = new HashSet<Integer>();

	private static int counter = 0;

	public static void main(String[] args) {

		long startTime = System.nanoTime();

		calculatePrimes();

		swap();

		System.out.println("Number of circular primes below one million : " + counter);

		System.out.println("Total time " + TimeUnit.NANOSECONDS.toSeconds(System.nanoTime() - startTime));

	}

	private static void swap() {
		
		String string = "";

		for (Iterator<Integer> iterator = primes.iterator(); iterator.hasNext();) {
			
			Integer integer = (Integer) iterator.next();
			
			string = Integer.toString(integer);
			
			int index = 0;

			for (int i = 0; i < string.length(); i++) {
				
				String subString = string.substring(i) + string.substring(0, i);
				
				if (primes.contains(Integer.parseInt(subString))) {
					
					index++; 
					
				}
 				
			}
			
			if (index == string.length()) {
				
				counter ++;
				
			}

		}

	}

	private static void calculatePrimes() {

		for (int i = 2; i < 1000000; i++) {

			if (isPrime(i)) {

				primes.add(i);

			}

		}

	}

	private static boolean isPrime(long n) {

		if (n < 2) {
			return false;
		}

		if (n == 2 || n == 3) {
			return true;
		}

		if (n % 2 == 0 || n % 3 == 0) {
			return false;
		}

		long sqrtN = (long) Math.sqrt(n) + 1;

		for (long i = 6L; i <= sqrtN; i += 6) {

			if (n % (i - 1) == 0 || n % (i + 1) == 0) {

				return false;

			}

		}

		return true;

	}

}
