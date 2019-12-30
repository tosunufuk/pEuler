package problem45;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Problem_45 {

	List<Long> triangles = new ArrayList<Long>();

	List<Long> pentagonal = new ArrayList<Long>();

	List<Long> hexagonal = new ArrayList<Long>();

	public static void main(String[] args) {

		System.out.println("Started");

		long startTime = System.nanoTime();

		Problem_45 p45 = new Problem_45();

		/* Brute Force */

		p45.calculateTriangle();

		p45.calculatePentagonal();

		p45.calculateHexagonal();

		p45.find();

		/* Brute Force */

		System.out.println("Total time is [" + TimeUnit.NANOSECONDS.toSeconds(System.nanoTime() - startTime) + "] seconds.");

	}

	private void find() {
		
		for (int i = 0; i < hexagonal.size(); i++) {

			if (pentagonal.contains(hexagonal.get(i)) && triangles.contains(hexagonal.get(i))) {

				System.out.println(hexagonal.get(i));
				
				return;

			}

		}

	}

	private void calculateTriangle() {

		for (long i = 286; i < 99999; i++) {

			triangles.add((i * (i + 1) / 2));

		}

	}

	private void calculatePentagonal() {

		for (long i = 166; i < 99999; i++) {

			pentagonal.add((i * (3 * i - 1) / 2));

		}

	}

	private void calculateHexagonal() {

		for (long i = 144; i < 99999; i++) {

			hexagonal.add((i * (2 * i - 1)));

		}

	}

}
