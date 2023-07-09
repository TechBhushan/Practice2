package com.programspractice;

public class PrimeNum {

    public static void main(String[] args) {

        int no = 11, temp = 0;
        for (int i = 2; i < no; i++) {
            if (no % i == 0) {
                temp = temp + 1;
            }
        }
        if (temp != 0) {
            System.out.println("not prime");
        } else {
            System.out.println("prime");
        }
    }
}
