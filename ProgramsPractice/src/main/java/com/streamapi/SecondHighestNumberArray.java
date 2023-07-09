package com.streamapi;

import java.util.Arrays;
import java.util.Comparator;

import com.stringandarrays.ComparatorValue;

public class SecondHighestNumberArray {
	public static void main(String[] args) {
		int[] nums = { 5, 9, 11, 2, 8, 21, 1 ,5};

		Integer element = Arrays.stream(nums).boxed()//converts each element of an array of int into Integer
				.distinct()
				.sorted(Comparator.reverseOrder())
				.skip(1)
				.findFirst().get();

		System.out.println(element);
	}
}
