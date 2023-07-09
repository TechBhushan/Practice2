package com.stringandarrays;

import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;

public class ComparatorValue implements Comparator<Map.Entry<Character, Integer>> {

	@Override
	public int compare(Entry<Character, Integer> o1, Entry<Character, Integer> o2) {
		return o2.getValue().compareTo(o1.getValue());
		
	}

	

}
