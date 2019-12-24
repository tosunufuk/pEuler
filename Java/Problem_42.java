package problem_42;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Problem_42 {

	private static List<Integer> triangleNumbers = new ArrayList<Integer>();

	private static List<String> names = new ArrayList<String>();
	
	private static List<Integer> nameIntegerValues = new ArrayList<Integer>();

	public static void main(String[] args) {
		
		long startTime = System.nanoTime();

		Problem_42 p42 = new Problem_42();

		p42.calculateTriangleNumbers();

		p42.readNames();
		
		p42.calculateNameValue();
		
		p42.isTriangle();
		
		System.out.println("Total time is [" + TimeUnit.NANOSECONDS.toSeconds(System.nanoTime() - startTime) + "] seconds.");

	}

	private void isTriangle() {
		
		int countTriangle = 0;
		
		for (int i = 0; i < nameIntegerValues.size(); i++) {
			
			if (triangleNumbers.contains(nameIntegerValues.get(i))) {
				
				countTriangle++;
				
			}
			
		}
		
		System.out.println(countTriangle);
		
	}

	private void calculateNameValue() {
		
		for (int i = 0; i < names.size(); i++) {
			
			int sum = 0;
			
			char[] cs = names.get(i).toCharArray();
			
			for (char c : cs) {
				
				int temp = (int) c;
				
				int temp_integer = 64;

				if (temp <= 90 & temp >= 65)
				{
					
					sum += (temp - temp_integer);
					
					
				}
				
			}
			
			nameIntegerValues.add(sum);
			
		}

	}

	private void readNames() {

		try {

			BufferedReader reader = null;

			String line;

			File file = new File("src/p042_words.txt");

			reader = new BufferedReader(new FileReader(file));

			if ((line = reader.readLine()) != null) {

				String[] str = line.replace("\"", "").split(",");

				for (int i = 0; i < str.length; i++) {

					names.add(str[i]);

				}

			}

			reader.close();
			
		} catch (IOException e) {
			
			e.printStackTrace();
			
		}

	}

	private void calculateTriangleNumbers() {

		int number = 1;

		for (int i = 2; i < 20; i++) {

			triangleNumbers.add(number);

			number += i;

		}

	}

}
