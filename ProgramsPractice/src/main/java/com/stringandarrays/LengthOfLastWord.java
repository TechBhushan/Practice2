package com.stringandarrays;

import java.util.Arrays;

//Get the length of last word
public class LengthOfLastWord {

	public static void main(String[] args) {
		int lastLength = lastWordLength("welcome to code decode and code decode welcome you");
		System.out.println(lastLength);

	}

	public static int lastWordLength(String str) {
		int count = 0;

		for (int i = str.length() - 1; i >= 0; i--) {
			if (str.charAt(i) == ' ') {
				break;
			}
			count++;
		}

		return count;

		//java 8
		/*int length = Arrays.stream(s.split(" "))
				.reduce((first, second) -> second)
				.orElse("")
				.length();

		System.out.println(length);*/

		/*for (int i = str.length() - 1; i >= 0; i--) {
			if (str.charAt(i) != ' ') {
				count++;
			} else {
				if (count > 0) {
					return count;
				}
			}
		}
		return count;*/

	}

}
