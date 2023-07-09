package com.programspractice;

public class FirstAndLastDigit {

	public static void main(String[] args) {
		int num = 62345;

		int firstDigit = 0;
		int lastDigit = 0;

		lastDigit = num % 10;

		firstDigit = num;
		while (firstDigit >= 10) {
			firstDigit = firstDigit / 10;
		}

//		while(num!=0) {
//			
//			firstDigit=num%10;
//			
//			num=num/10;
//			
//		}
		System.out.println(firstDigit);
		System.out.println(lastDigit);
	}

}
