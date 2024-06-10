package com.Adrian;

/**
 * @author Adrian Cieplicki date 06/07/2024 Various recursively functional
 *         methods
 */

public class Recursion {
	/**
	 * Main Method
	 * 
	 * @param args Command line arguments
	 */
	public static void main(String[] args) {
		int sd = sumDigits("627");
		System.out.println(sd); // 15
		boolean ip = isPalindrome("racecar");
		System.out.println(ip); // true
		int pow = calcPower(2, 5);
		System.out.println(pow); // 32
	}

	/**
	 * Sums a consecutive series of digits
	 * 
	 * @param digits a String of decimal digits
	 * @return the sum of all individual consecutive digits
	 */
	public static int sumDigits(String digits) {

		// Check digits against base case of an empty string
		if (digits.length() == 0) {
			return 0;
		}
		// Recursively add the all digits together
		return Character.getNumericValue(digits.charAt(0)) + sumDigits(digits.substring(1, digits.length()));
	}

	/**
	 * Checks is a word is spelled the same forwards as backwards
	 * 
	 * @param word A word to check
	 * @return Whether the word is spelled the same forwards as backwards
	 */
	public static boolean isPalindrome(String word) {

		// Check the word against the base case of a one-letter word
		if (word.length() == 1) {
			return true;
		}
		// Check if letters on opposite ends of the word are equal
		if (word.charAt(0) == word.charAt(word.length() - 1) && isPalindrome(word.substring(1, word.length() - 1))) {
			return true;
		}
		return false;
	}

	/**
	 * Raises a number to a certain exponent
	 * 
	 * @param base The number to be powered
	 * @param exp  The exponent to raise the base to
	 * @return The result of raising the base to the exponent
	 */
	public static int calcPower(int base, int exp) {

		// Check exponent against base case of a 0 exponent
		if (exp == 0) {
			return 1;
		}

		// Multiply the base by itself until exponent satisfies the base case
		return base * calcPower(base, exp - 1);
	}
}
