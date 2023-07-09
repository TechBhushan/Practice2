package com.stringandarrays;

import java.util.HashMap;
import java.util.Map;
//Get the Occurrence of each character in a string
public class OccurenceEachChar {
	public static void main(String[] args) {
		String str = "Programming";

		Map<Character, Integer> map = new HashMap();

		char[] chars = str.toCharArray();

		for (Character ch : chars) {

			if (!map.containsKey(ch)) {
				map.put(ch, 1);
			} else {
				int count = map.get(ch);
				map.put(ch, count + 1);
			}
		}
		System.out.println(map);
	}
}
