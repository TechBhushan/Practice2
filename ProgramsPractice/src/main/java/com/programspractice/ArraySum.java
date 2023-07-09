package com.programspractice;

import java.util.Arrays;

public class ArraySum {

	public static void main(String[] args) {
		int[] array = { 2, 5, 8, 10, 12, 10 };

		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum = sum + array[i];
		}

		System.out.println("Sum of array elements is: " + sum);

		// Or

		int sum1 = Arrays.stream(array).sum();
		System.out.println("Sum of array elements is: " + sum1);
		
		//Or
		
		int sum2=0;
		for(int num:array) {
			
			sum2=sum2+num;
		}
		
		System.out.println("Sum of array elements is: " + sum2);
	}

}
