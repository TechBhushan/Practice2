package com.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StartsWithFromArray {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 11, 5, 6, 12 };

		List<String> collected = Arrays.stream(nums).boxed()
										.map(s -> s + "")//convert to string
										.filter(s -> s.startsWith("1"))
										.collect(Collectors.toList());

		System.out.println(collected);
	}

}
