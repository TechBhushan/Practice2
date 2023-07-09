package com.stringandarrays;

import java.util.HashMap;
import java.util.Map;
//Get the occurrence of each word in a string
public class OccurrenceOfEachWordString {

	public static void main(String[] args) {
		String str = "welcome to code decode and code decode welcome you";

		Map<String, Integer> map = new HashMap();

		String[] words = str.split(" ");

		for (String word : words) {
			if (!map.containsKey(word)) {
				map.put(word, 1);
			} else {
				int cnt = map.get(word);
				map.put(word, cnt + 1);
			}
		}

		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}

	}

}
