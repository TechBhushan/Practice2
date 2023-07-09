package com.streamapi;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateElements {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(55, 22, 33, 55, 11, 44, 66, 88, 33, 33, 11, 55);
		Set<Integer> set = new HashSet();

		list.stream()
		.filter(l -> !set.add(l))
		.collect(Collectors.toSet())
		.forEach(l -> System.out.println(l));
	}

}
