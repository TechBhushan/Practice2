package com.stringandarrays;
//Reverse elements in an array
public class ReverseElementsArray {

	public static void main(String[] args) {
		int[] nums = { 7, 2, 6, 8, 4, 3, 5, 1 };

		int left = 0;
		int right = nums.length - 1;

		while (left < right) {
			int temp = nums[left];
			nums[left] = nums[right];
			nums[right] = temp;

			left++;
			right--;
		}
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
	}
}
