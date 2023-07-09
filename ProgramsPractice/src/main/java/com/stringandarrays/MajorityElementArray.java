package com.stringandarrays;

import java.util.HashMap;
import java.util.Map;
//Get a majority element in an array
public class MajorityElementArray {

	public static void main(String[] args) {
		int[] nums = { 10, 20, 10, 30, 10 };

		Map<Integer, Integer> map = new HashMap();

		for (int i = 0; i < nums.length; i++) {
			if (!map.containsKey(nums[i])) {
				map.put(nums[i], 1);
			} else {
				int cnt = map.get(nums[i]);
				map.put(nums[i], cnt + 1);
			}
		}
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

			if (entry.getValue() > (nums.length / 2)) {

				System.out.println(entry.getKey());
			}
		}

	}

}
