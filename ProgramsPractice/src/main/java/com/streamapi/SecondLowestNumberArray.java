package com.streamapi;

import java.util.Arrays;

public class SecondLowestNumberArray {

	public static void main(String[] args) {
		int[] nums = { 8, 4, 6, 3, 5, 1, 7, 1 };

		int integer = Arrays.stream(nums).distinct()// to remove duplicates
				.sorted()
				.skip(1)
				.findFirst()
				.orElseThrow(() -> new IllegalArgumentException("Does not find num"));

		System.out.println(integer);
	}

}
