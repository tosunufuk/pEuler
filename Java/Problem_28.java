package Problem_28;

import java.util.concurrent.TimeUnit;

public class Problem_28 {
	
	public static void main(String[] args) {
		
		long startTime = System.nanoTime();
		
		int spiralSize = 1001 / 2;
		
		int increment = 2;
		
		int spriralIndex = 1;
		
		int diagonal = 1;
		
		int sum = 1;
		
		while (spriralIndex <= spiralSize) {
			
			for (int i = 0; i < 4; i++) {
				
				diagonal = diagonal + increment;
				
				sum = sum + diagonal;
				
			}
			
			increment = increment + 2;
			
			spriralIndex++;
			
		}
		
		System.out.println(sum);
		
		System.out.println("Total time " + TimeUnit.NANOSECONDS.toSeconds(System.nanoTime() - startTime));
		
	}

}
