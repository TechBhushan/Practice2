package com.programspractice;

public class PalindromeString {

	public static void main(String[] args) {
		
		String str="madam";
		String rev="";

		for(int i=str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		
		if(str.equals(rev)) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Its not palindrome");
		}

	}

}
