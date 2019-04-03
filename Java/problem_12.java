public class problem_12 {

	public static void main(String[] args) {

		boolean found = false;

		int index = 1;

		int divider = 0;

		int triangularNumber = 0;

		while (!found) {

			triangularNumber += index;

			index++;

			System.out.println(triangularNumber);

			divider = 1;

			for (int i = 2; i <= triangularNumber; i++) {

				if (triangularNumber % i == 0) {

					divider++;
					
					System.out.println("Current Divider " + divider);
					
				}
				
				if (divider >= 500) {
					
					found = true;
					
					break;
					
				}
				
				

			}

		}
		
		System.out.println("divider " + divider);

	}

}
