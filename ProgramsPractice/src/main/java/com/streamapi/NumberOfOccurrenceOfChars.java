package com.streamapi;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NumberOfOccurrenceOfChars {

	public static void main(String[] args) {
		String str = "banana";

		Map<String, Long> countMap = Arrays.stream(str.split(""))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		System.out.println(countMap);
	}

}
