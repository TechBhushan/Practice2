package com.stringandarrays;

public class NumberOfObjects {
	
	static int i;
	
	public NumberOfObjects() {
		i++;
	}
	
	public void counter() {
		System.out.println(i);
	}

	public static void main(String[] args) {

		NumberOfObjects tm = new NumberOfObjects();
		
		NumberOfObjects tm1 = new NumberOfObjects();
		
		NumberOfObjects tm2 = new NumberOfObjects();
		
		tm2.counter();
	}
}
