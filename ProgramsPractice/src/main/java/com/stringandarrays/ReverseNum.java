package com.stringandarrays;

import java.util.Scanner;
//Reverse the given number
public class ReverseNum {

	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		System.out.println("Enter no: ");
		int no=s.nextInt();
		
		int rev=0, rem;
		
		while(no!=0) {
			
			rem=no%10;
			
			rev=rev*10+rem;
			
			no=no/10;
		}
		
		System.out.println(rev);
	}

}
