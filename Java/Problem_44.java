package pentagonal;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Problem_44 {
	
	private static List<Integer> list = new ArrayList<Integer>();

	public static void main(String[] args) {
		
		long startTime = System.nanoTime();
		
		Problem_44 p44 = new Problem_44();
		
		p44.generatePentagonalNumber();
		
		p44.checkPentagonalNumberPair();
		
		System.out.println("Total time is [" + TimeUnit.NANOSECONDS.toSeconds(System.nanoTime() - startTime) + "] seconds.");

	}

	private void checkPentagonalNumberPair() {
		
		int minDiff = Integer.MAX_VALUE;
		
		int diff = 0;
		
		int sum = 0;
		
		for (int i = 0; i < list.size() - 1; i++) {
			
			for (int j = i + 1; j < list.size(); j++) {
				
				diff = list.get(j) - list.get(i);
				
				if (list.contains(diff)) {
					
					if (diff < minDiff) {
						
						sum = list.get(j) + list.get(i);
						
						if (list.contains(sum)) {
							
							minDiff = diff;
							
						}
						
					}
					
				}
				
			}
			
		}
		
		System.out.println(minDiff);
		
	}

	private void generatePentagonalNumber() {
		
		int pentagonalNumber = 0;
		
		for (int i = 1; i <= 2400; i++) {
			
			pentagonalNumber = (i * (3 * i - 1))/ 2;
			
			list.add(pentagonalNumber);
			
		}
		
	}

}
