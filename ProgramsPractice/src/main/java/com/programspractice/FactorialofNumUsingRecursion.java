package com.programspractice;

public class FactorialofNumUsingRecursion {

	int fact = 1;

	public static void main(String[] args) {

		int no = 5, res;

		FactorialofNumUsingRecursion cal = new FactorialofNumUsingRecursion();

		res = cal.calFact(no);

		System.out.println(res);
	}

	public int calFact(int no) {

		if (no > 1) {

			fact = fact * no;
			calFact(no - 1);
		}

		return fact;
	}

}
