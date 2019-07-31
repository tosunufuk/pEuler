import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class problem_24 {

	private static int counter = 999999;

	static String permuatationValue = "";

	private static int factorial(int number) {

		int value = 1;

		for (int i = 2; i <= number; i++) {

			value = value * i;

		}

		return value;

	}

	public static void main(String[] args) {

		long startTime = System.nanoTime();

		int[] numbers = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		List<Integer> integers = new ArrayList<Integer>();

		for (int i = 0; i < numbers.length; i++) {

			integers.add(i);

		}

		for (int i = 1; i <= numbers.length; i++) {

			int j = counter / factorial(numbers.length - i);

			counter = counter % factorial(numbers.length - i);

			permuatationValue = permuatationValue + integers.get(j);

			integers.remove(j);

			if (counter == 0) {
				break;
			}

		}

		for (int i = 0; i < integers.size(); i++) {

			permuatationValue = permuatationValue + integers.get(i);

		}

		System.out.println(permuatationValue);

		System.out.println("Total time " + TimeUnit.NANOSECONDS.toSeconds(System.nanoTime() - startTime));

	}

}
