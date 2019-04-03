public class problem_17 {

	public enum EnumNumbers {

		NONE(-1), ZERO(0), ONE(1), TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7), EIGHT(8), NINE(9), TEN(10),
		ELEVEN(11), TWELVE(12), THIRTEEN(13), FOURTEEN(14), FIFTEEN(15), SIXTEEN(16), SEVENTEEN(17), EIGHTEEN(18),
		NINETEEN(19), TWENTY(20), THIRTY(30), FORTY(40), FIFTY(50), SIXTY(60), SEVENTY(70), EIGHTY(80), NINETY(90),
		ONEHUNDRED(100), TWOHUNDRED(200), THREEHUNDRED(300), FOURHUNDRED(400), FIVEHUNDRED(500), SIXHUNDRED(600),
		SEVENHUNDRED(700), EIGHTHUNDRED(800), NINEHUNDRED(900), ONETHOUSAND(1000), AND(1001);

		private final int index;

		private EnumNumbers(int i) {

			index = i;

		}

		public static EnumNumbers getNumber(int index) {

			for (EnumNumbers number : EnumNumbers.values()) {

				if (number.index == index) {
					return number;
				}

			}
			throw new IllegalArgumentException("index not found.");
		}

	}

	public static void main(String[] args) {

		int count = 0;

		int sum = 0;

		for (int i = 1; i <= 1000; i++) {

			count = getLetterCount(i);

			sum += count;

		}

		System.out.println(sum);

	}

	private static int getLetterCount(int i) {

		EnumNumbers letterCount = EnumNumbers.NONE;

		int returnValue = 0;

		String string = "" + i;

		char[] cs = string.toCharArray();

		if (cs.length == 1) {

			letterCount = EnumNumbers.getNumber(Integer.parseInt("" + cs[0]));

			returnValue += letterCount.toString().length();

		} else if (cs.length == 2) {

			if ((Integer.parseInt("" + cs[0]) * 10) + Integer.parseInt("" + cs[1]) < 20) {

				letterCount = EnumNumbers.getNumber((Integer.parseInt("" + cs[0]) * 10) + Integer.parseInt("" + cs[1]));

				returnValue += letterCount.toString().length();

			} else {

				letterCount = EnumNumbers.getNumber((Integer.parseInt("" + cs[0]) * 10));

				returnValue += letterCount.toString().length();

				if (Integer.parseInt("" + cs[1]) != 0) {

					letterCount = EnumNumbers.getNumber(Integer.parseInt("" + cs[1]));

					returnValue += letterCount.toString().length();

					letterCount = EnumNumbers.getNumber(1001);

					returnValue += letterCount.toString().length();

				}

			}

		} else if (cs.length == 3) {

			letterCount = EnumNumbers.getNumber((Integer.parseInt("" + cs[0]) * 100));

			returnValue += letterCount.toString().length();

			if ((Integer.parseInt("" + cs[1]) * 10) + Integer.parseInt("" + cs[2]) > 9
					&& (Integer.parseInt("" + cs[1]) * 10) + Integer.parseInt("" + cs[2]) < 20) {

				letterCount = EnumNumbers.getNumber((Integer.parseInt("" + cs[1]) * 10) + Integer.parseInt("" + cs[2]));

				returnValue += letterCount.toString().length();

				letterCount = EnumNumbers.getNumber(1001);

				returnValue += letterCount.toString().length();

			} else {

				if (Integer.parseInt("" + cs[1]) != 0) {

					letterCount = EnumNumbers.getNumber((Integer.parseInt("" + cs[1]) * 10));

					returnValue += letterCount.toString().length();

				}

				if (Integer.parseInt("" + cs[2]) != 0) {

					letterCount = EnumNumbers.getNumber(Integer.parseInt("" + cs[2]));

					returnValue += letterCount.toString().length();

					letterCount = EnumNumbers.getNumber(1001);

					returnValue += letterCount.toString().length();
				}

			}

		} else if (cs.length == 4) {

			letterCount = EnumNumbers.getNumber(1000);

			returnValue += letterCount.toString().length();

		}

		return returnValue;
	}

}
