public class problem_1 {

	public static void main(String[] args) {
		
		int sum = 0;
		
		int maxValue = 1000;
		
		for (int i = 1; i < 1000; i++) {
			
			if ((i % 3 == 0) || (i % 5 == 0)) {
				
				sum += i;
				
			}
			
		}
		
		System.out.println("Sum is: " + sum); /*233168*/

	}

}
