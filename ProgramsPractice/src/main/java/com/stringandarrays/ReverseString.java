package com.stringandarrays;

public class ReverseString {

	public static void main(String[] args) {

		String name = "Something Awesome";

		//int leng = name.length();
		// 1
		String rev = "";

		for (int i = name.length()-1; i >= 0; i--) {

			rev = rev + name.charAt(i);
		}
		System.out.println(rev);

		// 2
		for (int i = name.length() - 1; i >= 0; i--) {

			System.out.print(name.charAt(i));
		}
		System.out.println("\n");
		// 3
		char[] chars = name.toCharArray();

		for (int i = name.length() - 1; i >= 0; i--) {
			System.out.print(chars[i]);
		}
	}

}
