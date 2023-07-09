package com.stringandarrays;

import java.util.Arrays;

//Sort the string by each Character
public class CharSortInString {

	public static void main(String[] args) {
		String str = "awesome";

		System.out.println(check(str));

	}

	public static String check(String str) {

		StringBuilder sb = new StringBuilder();

		char[] chars = str.toCharArray();

		for (int i = 0; i < chars.length - 1; i++) {
			for (int j = 0; j < chars.length - 1; j++) {
				if (chars[j] > chars[j + 1]) {

					char temp = chars[j];
					chars[j] = chars[j + 1];
					chars[j + 1] = temp;
				}
			}
		}
		return Arrays.toString(chars);

		// Approach 2

//		Map<Character, Integer> map = new HashMap();
//
//		for (int i = 0; i < str.length(); i++) {
//			char ch = str.charAt(i);
//			if (!map.containsKey(ch)) {
//				map.put(ch, 1);
//			} else {
//				int cnt = map.get(ch);
//				map.put(ch, cnt + 1);
//			}
//		}
//		System.out.println(map);
//		
//		Set<Entry<Character,Integer>> set=map.entrySet();
//		List<Entry<Character,Integer>> list=new ArrayList(set);
//
//		Collections.sort(list,new ComparatorValue());
//		
//		System.out.println(list);

	}

}
