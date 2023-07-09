package com.programspractice;

public class EvenOddDigits {

	public static void main(String[] args) {
		
		int num=123456;
		
		int rem;
		
		int evenCount=0;
		int oddCount=0;
		
		while(num!=0) {
			
			rem=num%10;
			
			if(rem%2==0) {
				evenCount++;
			}else{
				oddCount++;
			}
			
			num=num/10;
		}
		
		System.out.println("Even No: "+evenCount);
		System.out.println("Odd no: "+oddCount);

	}

}
