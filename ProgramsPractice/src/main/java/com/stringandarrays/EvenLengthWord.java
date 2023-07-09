package com.stringandarrays;

//Remove even length word
public class EvenLengthWord {

	public static void main(String[] args) {
		String str = "Hell World";

		String[] words = str.split(" ");

		for (String word : words) {
			if (word.length() % 2 == 0) {
				System.out.println(word);
			}
		}
	}

}
