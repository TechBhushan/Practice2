package com.streamapi;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatCharacter {

	public static void main(String[] args) {
		String str = "aabbc";

		String firstNonRepeat = Arrays.stream(str.split(""))
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
				.entrySet().stream()
				.filter(v -> v.getValue() == 1)
				.findFirst()
				.get()
				.getKey();

		System.out.println(firstNonRepeat);
	}

}
