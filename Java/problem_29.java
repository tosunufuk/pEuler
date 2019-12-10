package Problem_29;

import java.math.BigInteger;
import java.util.HashSet;
import java.util.concurrent.TimeUnit;

public class Problem_29 {

	public static void main(String[] args) {
		
		long startTime = System.nanoTime();

		HashSet<BigInteger> set = new HashSet<BigInteger>();

		BigInteger val = BigInteger.valueOf(0);

		for (int a = 2; a <= 100; a++) {

			for (int b = 2; b <= 100; b++) {

				val = BigInteger.valueOf(a).pow(b);

				set.add(val);

			}

		}

		System.out.println(set.size());
		
		System.out.println("Total time " + TimeUnit.NANOSECONDS.toSeconds(System.nanoTime() - startTime));

	}

}
