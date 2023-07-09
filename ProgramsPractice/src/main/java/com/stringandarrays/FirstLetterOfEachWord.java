package com.stringandarrays;
//Get the first letter of each word
public class FirstLetterOfEachWord {

	public static void main(String[] args) {
		String str = "The brown fox";

		String[] words = str.split(" ");

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < words.length; i++) {

			String s = words[i];
			sb.append(s.charAt(0)).append(" ");
		}
		System.out.println(sb);
	}

}
