package com.programspractice;

public class ArmstrongNum {

	public static void main(String[] args) {
		int no = 153;
		int temp = no;
		int leng = 0;
		// find the length of number
		while (temp != 0) {
			temp = temp / 10;
			leng = leng + 1;
		}

		// reverse the number
		int temp2 = no, rem, arm = 0;
		while (temp2 != 0) {

			rem = temp2 % 10; 	//use the modulus to get the remainder
			// multiply length with remainder
			int mul = 1;
			for (int i = 1; i <= leng; i++) {
				mul = mul * rem;
			}
			arm = arm + mul;
			temp2 = temp2 / 10;
		}

		if (no == arm) {
			System.out.println("arm");
		} else {
			System.out.println("not arm");
		}

	}

}
