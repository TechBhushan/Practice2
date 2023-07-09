package com.stringandarrays;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateChars {

	public static void main(String[] args) {
		//Approach 1
		String str="programming";
		StringBuilder sb1=new StringBuilder();
		str.chars().distinct().forEach(c -> sb1.append((char) c));
		System.out.println(sb1);
		
		//Approach 2
		StringBuilder sb2=new StringBuilder();
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			int idx=str.indexOf(ch, i+1);
			if(idx==-1) {
				sb2.append(ch);
			}
		}
		System.out.println(sb2);
		
		//Approach 3
		StringBuilder sb3=new StringBuilder();
		char[] chars=str.toCharArray();
		for(int i=0;i<chars.length;i++) {
			boolean repeated=false;
			for(int j=i+1;j<chars.length;j++) {
				if(chars[i]==chars[j]) {
					repeated=true;
				}
			}
			if(!repeated) {
				sb3.append(chars[i]);
			}
		}
		System.out.println(sb3);
		
		//Approach 4
		StringBuilder sb4=new StringBuilder();
		Set<Character> set=new LinkedHashSet();
		for(int i=0;i<str.length();i++) {
			set.add(str.charAt(i));
		}
		for(Character c:set) {
			sb4.append(c);
		}
		System.out.println(sb4);
	}
}
