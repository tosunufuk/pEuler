package problem_39;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class problem_39 {

	public static void main(String[] args) {
		
		long startTime = System.nanoTime();

		int sum = 1000;

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int sideA = 1; sideA <= sum; sideA++) {

			for (int sideB = 1; sideB <= sum; sideB++) {

				for (int sideC = 1; sideC <= sum; sideC++) {

					if (((sideA + sideB + sideC) <= sum) && ((sideA + sideB + sideC) % 2 == 0)) {

						boolean b = isRATriangle(sideA, sideB, sideC);

						if (b) {

							if (map.containsKey(sideA + sideB + sideC)) {

								map.put(sideA + sideB + sideC, map.get(sideA + sideB + sideC) + 1);

							} else {

								map.put(sideA + sideB + sideC, 1);

							}

						}

					}

				}

			}

		}

		Map.Entry<Integer, Integer> max = null;

		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

			if (max == null || entry.getValue().compareTo(max.getValue()) > 0) {
				max = entry;
			}

		}

		System.out.println(max.getKey());
		
		System.out.println("Total time " + TimeUnit.NANOSECONDS.toSeconds(System.nanoTime() - startTime));

	}
	
	public static boolean isRATriangle(int i, int j, int k) {
		
		if (i * i + j * j == k * k) {

			return true;

		}

		return false;
	}

}
