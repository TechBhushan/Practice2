package com.streamapi;

import java.util.Arrays;

public class LongestStringArray {

	public static void main(String[] args) {
		//longest string from array
		String[] words = { "main", "services", "enterprize", "amazon" };

		String word = Arrays.stream(words)
				.reduce((word1, word2) -> word1.length() > word2.length() ? word1 : word2)
				.get();

		System.out.println(word);

	}

}
