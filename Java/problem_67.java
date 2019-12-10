package Problem_67;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class Problem_67 {

	public static void main(String[] args) {

		try {

			long startTime = System.nanoTime();

			BufferedReader reader = null;

			String line;

			File file = new File("src/Problem_67/p067_triangle.txt");

			reader = new BufferedReader(new FileReader(file));

			int index = 0;
			
			int[][] jaggedArray = new int[100][];
			
			int[][] jaggedModified = new int[100][];

			while ((line = reader.readLine()) != null) {

				String s = line;

				s = line.replaceAll("\\s", ", ");

				String[] array = s.split("\\, ");

				int[] arrayS = Arrays.stream(array).mapToInt(Integer::parseInt).toArray();
				
				jaggedArray[index] = new int[arrayS.length];
				
				jaggedModified[index] = new int[arrayS.length];
				
				for (int i = 0; i < arrayS.length; i++) {
					
					jaggedArray[index][i] = arrayS[i];
					
					jaggedModified[index][i] = arrayS[i];
					
				}
				
				index++;
				
			}
			
			reader.close();
			
			int max = 0;

			int maxTemp = 0;

			for (int i = 0; i < jaggedArray.length - 1; i++) {

				for (int j = 0; j < jaggedArray[i].length; j++) {

					int val = jaggedArray[i][j];

					for (int k = i + 1; k < jaggedArray[i + 1].length; k++) {

						for (int k2 = j; k2 <= j + 1; k2++) {

							if (jaggedArray[k][k2] < (jaggedModified[k][k2] + val)) {

								jaggedArray[k][k2] = jaggedModified[k][k2] + val;

							}

						}

					}

				}

			}

			for (int i = 0; i < jaggedArray[jaggedArray.length - 1].length - 1; i++) {

				maxTemp = Math.max(jaggedArray[jaggedArray.length - 1][i], jaggedArray[jaggedArray.length - 1][i + 1]);

				if (max < maxTemp) {

					max = maxTemp;

				}

			}

			System.out.println("Max " + max);
			
			long totalTime = TimeUnit.NANOSECONDS.toSeconds(System.nanoTime() - startTime);

			System.out.println("Total time " + totalTime / 1000);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
