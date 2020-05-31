package problem_46;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Problem_46 {

	private static List<Integer> primes = new ArrayList<Integer>();

	public static void main(String[] args) {

		long startTime = System.nanoTime();

		solve();

		System.out.println("Total calculation time is " + TimeUnit.NANOSECONDS.toSeconds(System.nanoTime() - startTime)
				+ " seconds.");

	}

	private static void solve() {

		for (int currentNumber = 9; currentNumber < 10000; currentNumber = currentNumber + 2) {

			calculatePrimes(currentNumber);

			for (int index = 0; index < primes.size(); index++) {

				int currentPrime = primes.get(index);

				if (currentNumber > currentPrime) {

					if (Double.compare(Math.sqrt((currentNumber - currentPrime) / 2) % 1, 0.0) == 0) {
						break;
					}

					if (index == primes.size() - 1) {

						System.out.println(currentNumber);

						return;

					}

				} else {

					break;

				}

			}

		}

	}

	private static void calculatePrimes(int currentNumber) {

		for (int i = 2; i <= currentNumber; i++) {

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
