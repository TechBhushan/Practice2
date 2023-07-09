package com.stringandarrays;

import java.util.HashSet;
import java.util.Set;
//Get longest substring without repeating the character
public class LongestSubString {
	public static void main(String[] args) {

		String str = "opentext";

		System.out.println(longest(str));
	}

	private static String longest(String str) {
		String longestTillNow = "";
		String longestOverAll = "";

		Set<Character> set = new HashSet();

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (set.contains(ch)) {
				longestTillNow = "";
				set.clear();
			} else {
				set.add(ch);
				longestTillNow = longestTillNow + ch;
			}
			if (longestTillNow.length() > longestOverAll.length()) {
				longestOverAll = longestTillNow;
			}
		}
		return longestOverAll;
	}
}
