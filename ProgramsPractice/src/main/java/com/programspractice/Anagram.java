package com.programspractice;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		String str1 = "madan";
		char[] charArray = str1.toCharArray();
		Arrays.sort(charArray);
		String str2 = "daman";
		char[] charArray2 = str2.toCharArray();
		Arrays.sort(charArray2);

		if (Arrays.equals(charArray, charArray2)) {
			System.out.println("anagram");
		} else {
			System.out.println("not anagram");
		}
	}
}
