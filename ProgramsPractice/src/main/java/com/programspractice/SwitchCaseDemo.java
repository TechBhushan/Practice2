package com.programspractice;

public class SwitchCaseDemo {

	public static void main(String[] args) {

		int a = 10, b = 20, res;

		String sym="+";

		switch (sym) {

		case "+":
			res = a + b;
			System.out.println(res);
			break;

		case "-":
			res = a - b;
			System.out.println(res);
			break;

		case "*":
			res = a * b;
			System.out.println(res);
			break;

		case "/":
			res = a / b;
			System.out.println(res);
			break;

		default:
			System.out.println("Invalid symbol");
			break;

		}

	}

}
