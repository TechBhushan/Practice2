package com.programspractice;

public class FibonacciUsingRecursion {

	int a = 0, b = 1;
	int c;

	public static void main(String[] args) {

		FibonacciUsingRecursion fib = new FibonacciUsingRecursion();

		fib.fibRecur(10);

	}

	void fibRecur(int i) {

		if (i >= 1) {

			c = a + b;
			System.out.println(c);

			a = b;
			b = c;

			fibRecur(i - 1);
		}

	}

}
