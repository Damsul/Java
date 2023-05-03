package com.example.javaproject2.week3.day13;

public class IsPrime1 {

    public static void main(String[] args) {
        int n = 7;
        for (int i = 2; i < n; i++) {
            System.out.printf("%d %% %d = %d\n", n, i, n % i);
        }
    }
}
