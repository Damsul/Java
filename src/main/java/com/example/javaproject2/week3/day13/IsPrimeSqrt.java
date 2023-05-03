package com.example.javaproject2.week3.day13;

public class IsPrimeSqrt {

    public static void main(String[] args) {
        int num = 111;
        int factors = 0;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                factors++;
            }
        }
        System.out.println(factors == 0 ? "prime" : "not prime");
    }
}
