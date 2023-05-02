package com.example.javaproject2.week3.day12;

public class Factorial {

    public static void main(String[] args) {
        int n = 10;
        for (int i = 2; i <= n; i++) {
            int result = 1;

            for (int j = 1; j <= i; j++) {
                result *= j;
            }

            System.out.printf("%d! -> %d\n", i, result);
        }
    }

}
