package com.programspractice;

public class RemoveElementsArray {

	public static void main(String[] args) {
		int[] nums = { 55, 33, 44, 22, 88 };

		int element = 44;

		for (int i = 0; i < nums.length; i++) {
			if (element == nums[i]) {
				for (int j = i; j < nums.length - 1; j++) {
					nums[j] = nums[j + 1];
				}
				break;
			}
		}
		for (int i = 0; i < nums.length - 1; i++) { // nums.length-1 because we don't need last element
			System.out.println(nums[i]);
		}
	}

}
