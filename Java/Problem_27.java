package problem_27;

import java.util.concurrent.TimeUnit;

public class Problem_27 {

	public static void main(String[] args) {
		
		long startTime = System.nanoTime();
		
		int bestA = 0;
		
		int bestB = 0;
		
		int best = 0;
		
		for (int a = -1000; a < 1000; a++) {
			
			for (int b = -1000; b < 1000; b++) {
				
				int i = quadraticPrimes(a, b);
				
				if (best < i) {
					
					bestA = a;
					
					bestB = b;
					
					best = i;
					
				}
				
			}
			
		}
		
		System.out.println(bestA * bestB);
		
		System.out.println("Total time " + TimeUnit.NANOSECONDS.toSeconds(System.nanoTime() - startTime));
		
	}

	private static int quadraticPrimes(int a, int b) {
		
		int n = 0;
		
		boolean flag = true;
		
		while (flag) {
			
			int val = n * n + a * n + b;
			
			if (!isPrime(val)) {
				
				flag = false;
				
			}
				
				n++;
			
		}
		
		return n;
		
	}

	private static boolean isPrime(int number) {
		
		boolean prime = true;
		
		for (int divisor = 2; divisor <= (number < 0 ? Math.abs(number) : number ) / 2; divisor++) {
			
			if (number % divisor == 0) {
				
				prime = false;
				
				return prime;
				
			}
			
		}
		return prime;
	}

}
