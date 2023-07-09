package com.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CommonElementsArray {

	public static void main(String[] args) {

		int[] nums1 = { 8, 4, 7, 3, 5 };

		int[] nums2 = { 8, 4, 6, 2, 9 };

		List<Integer> list = Arrays.stream(nums1)
				.filter(n1 -> Arrays.stream(nums2).anyMatch(n2 -> n2 == n1))
				.boxed()
				.collect(Collectors.toList());

		System.out.println(list);

	}

}
