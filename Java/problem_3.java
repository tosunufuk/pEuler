public class problem_3 {

	public static void main(String[] args) {
		
		long num = 600851475143L;
		
		int div = 2;
		
		int primes = 0;
		
		while (num >= div) {
			
			if (num % div == 0) {
				
				primes = div;
				
				num /= div;
				
			} else {
				
				div++;
				
			}
			
		}
		
		System.out.println("Primes " + primes);
		
	}

}
