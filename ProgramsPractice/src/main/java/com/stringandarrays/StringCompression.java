package com.stringandarrays;

import java.util.LinkedHashMap;
import java.util.Map;
//Write the string and the number of times it occured
public class StringCompression {

	public static void main(String[] args) {
		String str = "aabbbbc";

		Map<Character, Integer> map = new LinkedHashMap();

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (!map.containsKey(ch)) {
				map.put(ch, 1);
			} else {
				int cnt = map.get(ch);
				map.put(ch, cnt + 1);
			}
		}

		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			sb.append(entry.getKey()).append(entry.getValue());
		}

		System.out.println(sb);

	}

}
