package com.programspractice;

public class SumOfDigits {

	public static void main(String[] args) {
		int n = 8181;

		int sum = 0, rem;

		while (n != 0) {

			rem = n % 10;
			sum = sum + rem;

			n = n / 10;
		}
		System.out.println(sum);

	}

}
