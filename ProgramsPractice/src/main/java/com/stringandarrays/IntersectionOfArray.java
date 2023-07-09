package com.stringandarrays;

import java.util.HashSet;
import java.util.Set;
//Get the common elements in both array
public class IntersectionOfArray {

	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3, 4,8 };
		int[] arr2 = { 5, 6, 4, 8 };

		Set<Integer> set = new HashSet();

		for (int i = 0; i < arr1.length; i++) {
			set.add(arr1[i]);
		}
		for(int i=0;i<arr2.length;i++) {
			if(set.contains(arr2[i])) {
				System.out.println(arr2[i]);
			}
			
//			if(set.add(arr2[i])==false) {
//				System.out.println(arr2[i]);
//			}
		}

	}

}
