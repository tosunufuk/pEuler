package problem_32;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

public class problem_32 {

	public static void main(String[] args) {
		
		long startTime = System.nanoTime();

		int multiplier = 0;

		int sumOfProducts = 0;

		for (int product = 1; product < 9999; product++) {

			for (int multiplicand = 1; multiplicand < product; multiplicand++) {

				if (product % multiplicand == 0) {

					multiplier = product / multiplicand;

					if (("" + multiplier + product + multiplicand).length() == 9) {

						char[] cs = ("" + multiplier + product + multiplicand).toCharArray();

						Arrays.sort(cs);

						if (new String(cs).equals("123456789")) {

							sumOfProducts += product;
							
							break;

						}

					}

				}

			}
		}

		System.out.println(sumOfProducts);
		
		System.out.println("Total time " + TimeUnit.NANOSECONDS.toSeconds(System.nanoTime() - startTime));

	}

}
