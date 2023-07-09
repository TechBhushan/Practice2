package com.stringandarrays;

public class SqrOfSortedIntegerArray {

	public static void main(String[] args) {
		int[] nums = { -9, -5, -3, 2, 6, 8 };
		
		StringBuilder sb=new StringBuilder();

		int[] result = new int[nums.length];

//		for(int i=0;i<nums.length;i++) {
//			nums[i]=nums[i]*nums[i];
//		}

		int head = 0;
		int tail = nums.length - 1;

		for (int i = nums.length - 1; i >= 0; i--) {
			if (nums[head] * nums[head] > nums[tail] * nums[tail]) {
				result[i] = nums[head] * nums[head];
				head++;
			} else {
				result[i] = nums[tail] * nums[tail];
				tail--;
			}
		}

		for (int num : result) {
			sb.append(num).append(" ");
		}
		
		System.out.println(sb);
	}
}
