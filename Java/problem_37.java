package Problem_37;

import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

public class Problem_37 {

	private static HashSet<Integer> primes = new HashSet<Integer>();
	
	private static int sum = 0;

	public static void main(String[] args) {

		long startTime = System.nanoTime();

		calculatePrimes();

		truncate();
		
		System.out.println("Sum of the truncatable primes : " + sum);

		System.out.println("Total time " + TimeUnit.NANOSECONDS.toSeconds(System.nanoTime() - startTime));

	}

	private static void truncate() {

		boolean truncated = false;

		for (Iterator<Integer> iterator = primes.iterator(); iterator.hasNext();) {

			Integer integer = (Integer) iterator.next();

			if (integer != 2 || integer != 3 || integer != 5 || integer != 7) {

				truncated = fLeft(integer);

				if (truncated == true) {

					truncated = fRight(integer);
					
					if (truncated == true) {
						
						sum += integer;
						
					}

				}

			}

		}

	}

	private static boolean fRight(int integer) {

		int tmp = integer;

		boolean prime = false;

		for (int i = 0; i < Integer.toString(integer).length(); i++) {

			tmp = tmp % (int) Math.pow(10, (int) Math.log10(tmp));

			if (tmp > 0) {

				if (primes.contains(tmp)) {

					prime = true;

				} else {

					prime = false;

					return prime;

				}

			}

		}

		return prime;

	}

	private static boolean fLeft(int integer) {

		int tmp = integer;

		boolean prime = false;

		for (int i = 0; i < Integer.toString(integer).length(); i++) {

			tmp /= 10;

			if (tmp > 0) {

				if (primes.contains(tmp)) {

					prime = true;

				} else {

					prime = false;

					return prime;

				}

			}

		}

		return prime;
	}

	private static void calculatePrimes() {

		for (int i = 1; i < 1000000; i++) {

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
