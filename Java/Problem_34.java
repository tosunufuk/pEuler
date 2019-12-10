package Problem_34;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

public class Problem_34 {
	
	private static long startTime = System.nanoTime();

	private static HashMap<Integer, Integer> factorials = new HashMap<Integer, Integer>();

	private static int number = 2540161;

	public static void main(String[] args) {

		int totalSum = 0;

		calculateFactorials();

		for (int i = 3; i < number; i++) {

			int holder = i;

			int sum = 0;

			while (holder > 0) {

				int local = holder / 10;

				holder = holder % 10;

				if (holder == 0) {

					holder = 1;

				}

				sum += factorials.get(holder);

				holder = local;

			}

			if (i == sum) {

				totalSum += sum;

			}

		}

		System.out.println("Total Sum " + totalSum);
		
		System.out.println("Total time " + TimeUnit.NANOSECONDS.toSeconds(System.nanoTime() - startTime));

	}

	private static void calculateFactorials() {

		for (int i = 1; i < 10; i++) {

			int result = 1;

			for (int j = i; j > 0; j--) {

				result *= j;

			}

			factorials.put(i, result);

		}

	}

}
