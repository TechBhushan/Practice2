package com.stringandarrays;

import java.util.HashMap;
import java.util.Map;
//Get first non-repetitive character
public class FirstNonRepeatChar {

	public static void main(String[] args) {
		String str = "aabcdbecf";

		// Approach 1
		for (int i = 0; i < str.length(); i++) {
			boolean unique = true;
			for (int j = 0; j < str.length(); j++) {

				if (str.charAt(i) == str.charAt(j) && i != j) {
					unique = false;
					break;
				}
			}
			if (unique) {
				System.out.println(str.charAt(i));
				break;
			}
		}

		// Approach 2
		char[] chars = str.toCharArray();
		Map<Character, Integer> map = new HashMap();

		for (Character ch : chars) {
			if (!map.containsKey(ch)) {
				map.put(ch, 1);
			} else {
				int cnt = map.get(ch);
				map.put(ch, cnt + 1);
			}
		}

		for (Map.Entry<Character, Integer> entry : map.entrySet()) {

			if (entry.getValue() == 1) {
				System.out.println(entry.getKey());
				break;
			}
		}

		// Approach 3
		
	}
}
