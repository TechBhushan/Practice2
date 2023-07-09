package com.streamapi;

import java.util.Arrays;

public class LengthOfLongestStringArray {

	public static void main(String[] args) {
		// length of longest string from array
		String[] words = { "ramesh", "kalesh", "durgesh", "vipul", "narayan" };

		String word = Arrays.stream(words)
				.reduce((word1, word2) -> word1.length() > word2.length() 
						? String.valueOf(word1.length()) : String.valueOf(word2.length()))
				.get();

		// OR

		int integer = Arrays.stream(words)
				.mapToInt(String::length) //.mapToInt(string -> string.length())
				.max()
				.orElse(0);

		System.out.println(word);

		System.out.println(integer);
	}

}
