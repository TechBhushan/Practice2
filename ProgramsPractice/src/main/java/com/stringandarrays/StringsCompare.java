package com.stringandarrays;

//Compare strings without using any in-build function
public class StringsCompare {

	public static void main(String[] args) {
		String str = "Hello this is demo sentence";
		String str1 = "Hello this is demo sentence";

		boolean isSame = true;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != str1.charAt(i) || str.length()!=str1.length()) {
				isSame = false;
				System.out.println("Not same");
				break;
			}
		}
		if (isSame) {
			System.out.println("same");
		}
	}

}
