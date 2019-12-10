public class Problem_7 {

	public static void main(String[] args) {

		int reqPrimePosition = 10001;

		int position = 0;

		int primeNumber = 1;

		int cursor = 0;

		while (position < reqPrimePosition) {
			
			primeNumber += 1;

			for (int i = 2; i <= primeNumber; i++) {

				if (primeNumber % i == 0) {

					cursor = i;

					break;

				}

			}

			if (cursor == primeNumber) {

				position++;

			}

		}
		
		System.out.println("Position " + position + " Prime Number " + primeNumber);

	}

}
