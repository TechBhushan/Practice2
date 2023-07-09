package com.stringandarrays;

//Replace character with digit as many times it occurred in a string
public class CharWithOccurrence {

	public static void main(String[] args) {
		String str = "opentext";
		char charToReplace = 'q';
		int count = 1;
		
		if(str.indexOf(charToReplace)==-1) {
			System.out.println("Character not available");
			System.exit(0);
		}

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == charToReplace) {
				str = str.replaceFirst(String.valueOf(charToReplace), String.valueOf(count));
				count++;
			}
		}
		System.out.println(str);

	}

}
