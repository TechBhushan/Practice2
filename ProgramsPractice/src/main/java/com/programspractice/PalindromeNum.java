package com.programspractice;

public class PalindromeNum {

	public static void main(String[] args) {
		
		int no=1222;
		
		int temp=no;
		
		int rev=0;
		
		while(temp!=0) {
			
			rev=rev*10+temp%10;
			
			temp=temp/10;
			
		}
		
		if(no==rev) {
			System.out.println("palindrome");
		}else {
			System.out.println("not palindrome");
		}

	}

}
