package Problem_38;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

public class Problem_38 {

	public static void main(String[] args) {

		long startTime = System.nanoTime();
		
		for (int i = 9387; i > 9234; i--) {
			
			char[] cs = ("" + i + (i * 2)).toCharArray();

			Arrays.sort(cs);

			if (new String(cs).equals("123456789")) {

				System.out.println("" + i + (i * 2));

				break;

			}

		}
		
		System.out.println("Total time " + TimeUnit.NANOSECONDS.toSeconds(System.nanoTime() - startTime));

	}
	
}
