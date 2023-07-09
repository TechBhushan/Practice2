package com.stringandarrays;

public class SumofPairArray {

	public static void main(String[] args) {
		int[] nums = { 10, 20, 40, 30, 50 };

		int sum = 50;

		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == sum) {
					System.out.println(nums[i] + "," + nums[j]);
				}
			}
		}

	}

}
