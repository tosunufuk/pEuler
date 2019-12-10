package Problem_31;

import java.util.concurrent.TimeUnit;

public class Problem_31 {

	public static void main(String[] args) {
		
		long startTime = System.nanoTime();

		int totalSum = 200;
		
		int[] coinSizes = { 1, 2, 5, 10, 20, 50, 100, 200 };
		
		int[] ways = new int[totalSum + 1];
		
		ways[0] = 1;

		for (int i = 0; i < coinSizes.length; i++) {
			
			for (int j = coinSizes[i]; j <= totalSum; j++) {
				
				ways[j] += ways[j - coinSizes[i]];
				
			}
			
		}
		
		System.out.println( ways[totalSum]);
		
		System.out.println("Total time " + TimeUnit.NANOSECONDS.toSeconds(System.nanoTime() - startTime));
			
	}

}
