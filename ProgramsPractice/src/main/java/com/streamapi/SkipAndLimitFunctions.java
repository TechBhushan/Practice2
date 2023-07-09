package com.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class SkipAndLimitFunctions {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(55, 22, 33, 55, 11, 44, 66, 88, 33, 33, 11, 55);

		list.stream().limit(5).forEach(x -> System.out.print(x + " ")); // limits the number till given value

		System.out.println();

		list.stream().skip(5).forEach(x -> System.out.print(x + " ")); // skips the number till given value
		
		System.out.println("\n............................................");
		
		IntStream.rangeClosed(1, 10)
					.skip(1)
					.limit(8)
					.forEach(System.out::println);
	}

}
