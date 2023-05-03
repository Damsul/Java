package com.example.javaproject2.week3.day13;

public class IsPrimeDivide {

    public static void main(String[] args) {
        int num = 100;
        int factors = 0;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                factors++;
            }
        }
        System.out.println(factors == 0 ? "prime" : "not prime");
    }
}
