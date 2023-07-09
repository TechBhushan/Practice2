package com.streamapi;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ReverseArray {

	public static void main(String[] args) {
		
		int[] nums = { 1, 2, 3, 4, 5 };

		IntStream.range(0, nums.length / 2)
					.forEach(i -> {
			int temp = nums[i];
			nums[i] = nums[nums.length - i - 1];//swaps first element with last element
			nums[nums.length - i - 1] = temp;   //swaps last element with first element
		});

		System.out.println(Arrays.toString(nums));
	}

}
