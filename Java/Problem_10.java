public class Problem_10 {

	public static void main(String[] args) {
		
		int sumPrimesTo = 2000000;
		
		long primeSum = 2;
		
		int aNumber = 0;
		
		for (int primeNumber = 3; primeNumber < sumPrimesTo; primeNumber+=2) {
			
			System.out.println("Primenes check " + primeNumber); 
			
			for (int number = 3; number <= primeNumber; number+=2) {
				
				if (primeNumber % number == 0) {
					
					aNumber = number;
					
					break;
					
				}
				
			}
			
			if (aNumber == primeNumber) {
				
				primeSum += primeNumber;
				
			}
			
		}
		
		System.out.println("Sum is " + primeSum);

	}

}
