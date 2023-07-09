package com.stringandarrays;

//Remove special characters from strings
public class RemoveSpecialChar {

	public static void main(String[] args) {
		String str = "pro@#@#@gra@#mi&^*^ng";

		str = str.replaceAll("[^a-zA-Z1-9]", "");

		System.out.println(str);

		// -----------------------------------------

		String str1 = "o   pe   n";

		str1 = str1.replaceAll("\\s", "");

		System.out.println(str1);

	}

}
