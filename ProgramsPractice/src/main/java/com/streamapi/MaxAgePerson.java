package com.streamapi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

//list of persons includes male and female. Find out name of female whose age is max
public class MaxAgePerson {

	public static void main(String[] args) {

		List<Person> list = new ArrayList();
		list.add(new Person("Pushpa", "female", 19));
		list.add(new Person("Chameli", "female", 22));
		list.add(new Person("Shila", "female", 25));
		list.add(new Person("Ramu", "male", 50));
		list.add(new Person("Kalu", "male", 55));
		list.add(new Person("Lala", "male", 60));

		// max age female
//		Optional<String> name = list.stream().filter(s -> s.getGender().equals("female"))
//				.max(Comparator.comparingInt(Person::getAge)).map(Person::getName);
//
//		name.ifPresent(System.out::println);
		
		
		//max age two females
		List<String> collect = list.stream().filter(s->s.getGender().equals("female"))
					.sorted(Comparator.comparing(Person::getAge).reversed())
					.limit(2)
					.map(Person::getName)
					.collect(Collectors.toList());
					
		System.out.println(collect);
		
		
	}
}
