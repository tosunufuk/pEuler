public class Problem_14 {

	public static void main(String[] args) {

		int longestChain = 0;

		int chain = 0;

		int number = 0;

		int startingNumber = 0;

		int limit = 1000000;

		long index = 0;

		boolean run = true;

		for (int i = 1; i < limit; i++) {

			index = i;

			number = i;

			run = true;

			chain = 0;

			while (run) {

				if (index > 1) {

					if (index % 2 == 0) {

						index = index / 2;

					} else {

						index = (index * 3) + 1;

					}

					chain++;

				} else {

					run = false;

				}

			}

			if (longestChain < chain) {

				longestChain = chain;

				startingNumber = number;

			}

		}

		System.out.println("longestChain starting number " + startingNumber);

	}

}
