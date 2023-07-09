package com.stringandarrays;

public class SortingCharsInString {

	public static void main(String[] args) {
		String s = "hfg846rk";
		StringBuilder characters = new StringBuilder();
		StringBuilder digits = new StringBuilder();

		for (char c : s.toCharArray()) {
			if (Character.isDigit(c)) {
				digits.append(c);
			} else {
				characters.append(c);
			}
		}

		String sortedString = characters.toString() + digits.toString();
		System.out.println("Sorted String: " + sortedString);
	}

}
