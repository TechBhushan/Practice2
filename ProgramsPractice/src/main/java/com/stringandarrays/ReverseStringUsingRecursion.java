package com.stringandarrays;

public class ReverseStringUsingRecursion {

	public static void main(String[] args) {
		String input = "Hello, World!";
		String reversedString = reverseString(input);
		System.out.println(reversedString);
	}

	public static String reverseString(String input) {
		// Base case: if the input string is empty or has only one character,
		// return the input string as is
		if (input.isEmpty() || input.length() == 1) {
			return input;
		}

		// Recursive case: reverse the substring from index 1 to the end and
		// concatenate it with the first character
		return reverseString(input.substring(1)) + input.charAt(0);

	}

}
