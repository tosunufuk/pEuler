public class problem_2 {

	public static void main(String[] args) {
		
		int max = 4000000;
		
		int val = 1;
		
		int pastVal1 = 0;
		
		int temp = 0;
		
		int sum = 0;
		
		while (val <= max) {
			
			temp = val;
			
			val += pastVal1;
			
			pastVal1 = temp;
			
			if ((val & 1) == 0) {
				
				sum += val;
				
			}
			
		}
		
		System.out.println("Sum is " + sum); /*4613732*/

	}

}
