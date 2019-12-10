package Problem_22;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Problem_22 {

	public static void main(String[] args) {

		try {

			int totalScore = 0;

			ArrayList<String> names = new ArrayList<String>();

			BufferedReader reader = null;

			String line;

			File file = new File("src/Problem_22/p022_names.txt");

			reader = new BufferedReader(new FileReader(file));

			if ((line = reader.readLine()) != null) {

				String[] str = line.replace("\"", "").split(",");

				for (int i = 0; i < str.length; i++) {

					names.add(str[i]);

				}

				Collections.sort(names);

				for (int i = 0; i < names.size(); i++) {

					totalScore += ((i + 1) * calcScore(names.get(i)));

				}

			}

			reader.close();

			System.out.println("Total Score of names : " + totalScore);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static int calcScore(String name) {

		int score = 0;

		int remover = 64;

		for (int i = 0; i < name.length(); i++) {

			int val = (int) name.charAt(i);

			if (val >= 65 && val <= 90) {

				score += (val - remover);

			}

		}

		return score;

	}

}
