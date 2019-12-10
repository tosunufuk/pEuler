public class Problem_6 {

	public static void main(String args[]) {

		int max = 100;

		int tmpSquareSum = 0;

		int squareSum = 0;

		int total = 0;

		int totalSquare = 0;

		int diff = 0;

		for (int i = 1; i <= max; i++) {

			tmpSquareSum = power(i, 2);

			squareSum += tmpSquareSum;

			total += i;

		}

		totalSquare = power(total, 2);

		diff = totalSquare - squareSum;

		System.out.println("squareSum " + squareSum);

		System.out.println("totalSquare " + totalSquare);

		System.out.println("diff " + diff);

	}

	private static int power(int value, int powerOf) {

		int powered = 1;

		while (powerOf > 0) {

			powered *= value;

			powerOf--;

		}

		return powered;
	}

}
