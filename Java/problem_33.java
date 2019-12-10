package Problem_33;

import java.util.concurrent.TimeUnit;

public class Problem_33 {

	public static void main(String[] args) {
		
		long startTime = System.nanoTime();

		int numerator = 1;
		
		int denumerator = 1;
		
		for (int i = 11; i < 100; i++) {
			
			for (int j = 10; j < i; j++) {
				
				int val1 = i % 10;
				
				int val2 = i / 10;
				
				int val3 = j % 10;
				
				int val4 = j / 10;
				
				if (val3 == val2 && (j * val1) / val4 == i) {
					
					numerator *= j;
					
					denumerator *= i;
					
				}
				
			}
			
		}
		
		System.out.println(denumerator / gcd(numerator, denumerator));
		
		System.out.println("Total time " + TimeUnit.NANOSECONDS.toSeconds(System.nanoTime() - startTime));

	}

	private static int gcd(int numerator, int denumerator) {
		
		if (denumerator == 0) {
			
			return numerator;
			
		}
		
		return gcd(denumerator, numerator % denumerator);
		
	}

}
