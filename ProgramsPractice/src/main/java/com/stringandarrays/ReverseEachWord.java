package com.stringandarrays;

//Reverse each word in a String
public class ReverseEachWord {

	public static void main(String[] args) {
		String s = "Java is awesome language in the world";
		String[] words = s.split(" ");
		String rev = "";

		for (String word : words) {
			String revWord = "";
			for (int i = word.length() - 1; i >= 0; i--) {
				revWord = revWord + word.charAt(i);
			}
			rev = rev + revWord + (" ");
		}

		System.out.println("Reverse: " + rev);
	}

}
