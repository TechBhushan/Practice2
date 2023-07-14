package com.streamapi;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {

        String s="java is awesome";

        int length = Arrays.stream(s.split(" "))
                .reduce((first, second) -> second)
                .orElse("")
                .length();

        System.out.println(length);

    }
}
