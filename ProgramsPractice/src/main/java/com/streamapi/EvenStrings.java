package com.streamapi;

import java.util.stream.IntStream;

//
public class EvenStrings {

	public static void main(String[] args) {
		
		String[] words= {"apple","orange","mango","kiwi","banana"};
		
//		for(int i=0;i<words.length;i++) {
//			 if(i%2==0) {
//				 System.out.println(words[i]);
//			 }
//		}
		
		IntStream.range(0, words.length)
        .filter(i -> i % 2 == 0)
        .mapToObj(i -> words[i])
        .forEach(System.out::println);
		
		//System.out.println(collect);
		
	}
}
