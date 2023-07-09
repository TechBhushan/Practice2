package com.stringandarrays;

import java.util.HashSet;
import java.util.Set;
//Remove duplicate elements from array
public class DuplicateStringAndElementsArray {
	public static void main(String[] args) {
		// Duplicate Strings in Array
		String[] names = { "Ram", "Shyam", "Rom", "Bom", "Ram" };

		Set<String> set = new HashSet();

		boolean elementFound = false;
		for (String name : names) {

			if (set.add(name) == false) { // if(set.contains(name))
				System.out.println("Duplicate: " + name);
				elementFound = true;
			}
		}
		if (elementFound == false) {
			System.out.println("Duplicates not found");
		}

		// Duplicate Elements in Array
		int[] nums = { 10, 20, 10, 30, 30 };

		Set<Integer> set1 = new HashSet();

		boolean repeated = false;

		for (int i : nums) {
			if (set1.add(i) == false) { // if(set.contains(i))
				System.out.println(i);
				repeated = true;
			}
		}
		if (!repeated) {
			System.out.println("No duplicate elements");
		}

	}
}
