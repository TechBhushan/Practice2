package com.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateCharacters {

	public static void main(String[] args) {
		
		String str="banana";
		
		List<String> list = Arrays.stream(str.split(""))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
				.entrySet()
				.stream()
				.filter(s -> s.getValue() > 1)
				.map(Map.Entry::getKey)
				.collect(Collectors.toList());  //   .forEach(s-> System.out.println(s));

		System.out.println(list);
	}

}
