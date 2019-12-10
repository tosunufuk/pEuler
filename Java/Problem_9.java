public class Problem_9 {

	public static void main(String[] args) {

		/*
		 * int a = 0; int b = 0; int c = 0; int cSquared = 0;
		 */

		for (int a = 1; a < 1000; a++) {

			for (int b = 2; b < 1000; b++) {

				double aSquare = Math.pow(a, 2);

				double bSquare = Math.pow(b, 2);

				double cSquare = aSquare + bSquare;

				double c = Math.pow(cSquare, 0.5);

				if ((a < b) && (b < c)) {

					if ((a + b + c) == 1000) {

						System.out.println((int) ((a * b) * c));
						
						break;

					}

				}

			}

		}

	}

}
