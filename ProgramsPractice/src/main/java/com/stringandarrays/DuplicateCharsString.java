package com.stringandarrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

//Remove Duplicate characters from a String
public class DuplicateCharsString {

	public static void main(String[] args) {
		String str = "The quick brown fox jumps over the lazy dog.";

		Map<Character, Integer> map = new HashMap<>();

		for (char c : str.toCharArray()) {
			if (!map.containsKey(c)) {
				map.put(c, 1);
			} else {
				int count = map.get(c);
				map.put(c, count + 1);
			}
		}

		System.out.print("Duplicate characters: ");
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			if (entry.getValue() > 1) {
				System.out.print(entry.getKey() + " ");
			}
		}

		// OR

//		Set<Character> set = new HashSet();
//
//		StringBuilder sb = new StringBuilder();
//
//		for (int i = 0; i < str.length(); i++) {
//			Character c = str.charAt(i);
//			if (!set.contains(c)) {
//				set.add(c);
//				sb.append(c);
//			}
//		}
//
//		System.out.println(sb);
	}

}
