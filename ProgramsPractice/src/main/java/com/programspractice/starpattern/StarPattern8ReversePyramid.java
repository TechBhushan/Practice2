package com.programspractice.starpattern;

public class StarPattern8ReversePyramid {

	public static void main(String[] args) {
		
		for(int i=1;i<=4;i++) {
			for(int j=2;j<=i;j++) {
				System.out.print(" ");
			}
			for(int k=4;k>=i;k--) {
				System.out.print("*");
			}
			for(int l=4;l>i;l--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
