public class Problem_4 {

	public static void main(String[] args) {

		int largestPalindrome = 0;

		int palindrome = 0;

		int reversed = 0;

		int remainder = 0;

		int temp = 0;

		for (int i = 999; i > 99; i--) {

			for (int j = 999; j > 99; j--) {

				reversed = 0;

				remainder = 0;

				palindrome = i * j;

				temp = palindrome;

				while (temp != 0) {

					remainder = temp % 10;

					reversed = (reversed * 10) + remainder;

					temp /= 10;

				}

				if (palindrome == reversed) {

					if (largestPalindrome < palindrome) {

						largestPalindrome = palindrome;

					}

				}

			}

		}

		System.out.println("Largest Palindrome is " + largestPalindrome);

	}
