package com.example.javaproject2.week3.day13;

public class IsPrime2 {

    public static void main(String[] args) {
        int n = 7;
        int factors = 0;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                factors++;
            }
        }
        System.out.println("factors = " + factors);
        System.out.println(factors == 0 ? "prime" : "not prime");
    }
}
