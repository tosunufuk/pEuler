import java.math.BigInteger;

public class problem_16 {

	public static void main(String[] args) {

		int number = 2;

		int sum = 0;

		BigInteger integer = new BigInteger(String.valueOf(number));

		BigInteger power = integer.pow(1000);

		String powerString = power.toString();

		for (int i = 0; i < powerString.length(); i++) {

			sum += Integer.parseInt("" + powerString.charAt(i));

		}

		System.out.println(sum);

	}

}
