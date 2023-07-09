package com.programspractice;

public class Fibonacci_nth {

	public static void main(String[] args) {
		System.out.println(fib(52));
	}

	public static int fib(int n) {
		
		if(n<=1) {
			return n;
		}else {
			return fib(n-1)+(n-2);
		}
	}
}
