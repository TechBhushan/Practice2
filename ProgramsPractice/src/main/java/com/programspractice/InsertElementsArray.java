package com.programspractice;

import java.util.Arrays;

public class InsertElementsArray {

	public static void main(String[] args) {
		int[] nums = { 55, 33, 44, 22, 88 };

		int pos = 3;
		int element = 11;

		for (int i = nums.length - 1; i > pos - 1; i--) {
			nums[i] = nums[i - 1]; // it inserts previous value into next value
		}

		nums[pos - 1] = element;

		System.out.println(Arrays.toString(nums));

	}

}
