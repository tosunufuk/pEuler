package Problem_40;

import java.util.ArrayList;

public class Problem_40 {

	private ArrayList<Character> characters = new ArrayList<Character>();

	public static void main(String[] args) {

		Problem_40 Problem_40 = new Problem_40();

		Problem_40.solve();

	}

	private void solve() {

		int value = 1;

		String string = "";

		for (int i = 1; characters.size() < 1000000; i++) {

			string = "" + i;

			for (int j = 0; j < string.length(); j++) {

				characters.add(string.charAt(j));

			}

		}

		value = Character.getNumericValue(characters.get(1 - 1)) 
				* Character.getNumericValue(characters.get(10 - 1))
				* Character.getNumericValue(characters.get(100 - 1))
				* Character.getNumericValue(characters.get(1000 - 1))
				* Character.getNumericValue(characters.get(10000 - 1))
				* Character.getNumericValue(characters.get(100000 - 1))
				* Character.getNumericValue(characters.get(1000000 - 1));

		System.out.println(value);

	}

}
