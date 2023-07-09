package com.stringandarrays;

import java.util.HashMap;
import java.util.Map;
//Get longest substring without repeating the character
public class LongestSubString1 {

	public static void main(String[] args) {
		String str = "abcabcbbdefg";

		longestSubstring(str);

	}

	private static void longestSubstring(String str) {

		String longest = null;
		int longestLength = 0;

		Map<Character, Integer> map = new HashMap();

		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);

			if (!map.containsKey(ch)) {
				map.put(ch, i);
			} else {
				i = map.get(ch);
				map.clear();
			}
		}
		if (map.size() > longestLength) {
			longestLength = map.size();
			longest = map.keySet().toString();
		}

		System.out.println(longest);
		System.out.println(longestLength);

	}

}
