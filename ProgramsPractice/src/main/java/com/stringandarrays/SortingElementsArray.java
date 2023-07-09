package com.stringandarrays;

import java.util.Arrays;
import java.util.Stack;

public class SortingElementsArray {

	public static void main(String[] args) {
		int[] nums = { 86, 38, 25, 68, 46, 29, 34 };

		int n = nums.length;
		
		//For sorting array using bubble sort
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - 1; j++) {
				if (nums[j] > nums[j + 1]) {
					
					//swapping of elements
					int temp = nums[j];
					nums[j] = nums[j + 1];
					nums[j + 1] = temp;
				}
			}
		}
		System.out.println("Sorted: " + Arrays.toString(nums));

		// Reverse Elements in Array using Stack

		int[] nums1 = { -9, -5, -3, 2, 6, 8 };
		Stack stack = new Stack();

		for (int i = 0; i < nums1.length; i++) {
			stack.push(nums1[i]);
		}
		for (int i = 0; i < nums1.length; i++) {
			nums1[i] = (int) stack.pop();

			System.out.println(nums1[i]);
		}
	}
}
