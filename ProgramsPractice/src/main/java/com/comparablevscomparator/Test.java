package com.comparablevscomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		
		List<Employee> list=new ArrayList<>();
		
		list.add(new Employee("Kala", 55,30000));
		list.add(new Employee("Bala", 33,20000));
		list.add(new Employee("Lala", 77,50000));
		list.add(new Employee("Mala", 22,10000));
		
		Collections.sort(list, new AgeComparator());
		
		System.out.println(list);
		
	}
}
