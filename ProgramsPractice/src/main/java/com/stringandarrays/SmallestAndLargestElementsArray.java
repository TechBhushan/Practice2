package com.stringandarrays;

public class SmallestAndLargestElementsArray {

	public static void main(String[] args) {
		int[] nums = { 10, 20, 40, 30, 50 };

		int smallest = nums[0];
		int largest = nums[0];

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] < smallest) {
				smallest = nums[i];
			} else if (nums[i] > largest) {
				largest = nums[i];
			}
		}
		System.out.println(smallest);
		System.out.println(largest);
	}

}
