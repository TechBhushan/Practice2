package com.programspractice;

public class PrintNumbersWithoutLoop {

	public static void main(String[] args) {

		numbers(1, 100);

	}

	public static void numbers(int stNum, int endNum) {
		if (stNum <= endNum) {
			System.out.println(stNum);

			stNum++;

			numbers(stNum, endNum);
		}
	}	
}
