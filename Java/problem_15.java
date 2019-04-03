public class problem_15 {

	public static void main(String[] args) {

		long[][] grid = new long[21][21];

		for (int i = 1; i <= 20; i++) {

			grid[i][0] = 1;

			grid[0][i] = 1;

		}

		for (int i = 1; i <= 20; i++) {
			
			for (int j = 1; j <= i; j++) {
				
				grid[i][j] = grid[j][i] = grid[j - 1][i] + grid[j][i - 1];
				
			}
			
		}

		System.out.println(grid[20][20]);

	}

}
