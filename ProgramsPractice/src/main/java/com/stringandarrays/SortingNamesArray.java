package com.stringandarrays;

import java.util.Arrays;

public class SortingNamesArray {

	public static void main(String[] args) {
		
		String[] names= {"Ram","Shyam","Bala","Lala"};
		
		int n=names.length;
		
		//For sorting array using bubble sort
		for(int i=0; i<n-1;i++) {
			for(int j=0; j<n-1; j++) {
				
				if(names[j].compareTo(names[j+1])>0) {
					
					//swapping of names
					String temp=names[j];
					names[j]=names[j+1];
					names[j+1]=temp;
				}
			}
		}
		
		System.out.println("Sorted names: "+Arrays.toString(names));

	}

}
