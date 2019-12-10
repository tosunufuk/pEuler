import java.math.BigInteger;
import java.util.concurrent.TimeUnit;

public class Problem_25 {

	public static void main(String[] args) {

		long startTime = System.nanoTime();

		BigInteger integer1 = BigInteger.valueOf(1);

		BigInteger integer2 = BigInteger.valueOf(1);

		BigInteger tmpV = BigInteger.valueOf(0);

		int counter = 2;

		while (integer1.toString().length() < 1000) {

			tmpV = integer1.add(integer2);

			integer2 = integer1;

			integer1 = tmpV;

			counter++;

		}

		System.out.println("Index of the first term in the Fibonacci sequence to contain 1000 digits is : " + counter);

		System.out.println("Total time " + TimeUnit.NANOSECONDS.toSeconds(System.nanoTime() - startTime));

	}

}
