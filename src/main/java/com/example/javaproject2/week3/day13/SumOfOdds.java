package com.example.javaproject2.week3.day13;

public class SumOfOdds {

    public static void main(String[] args) {
        int ans = 0;
        int n = 10;
        for (int i = 1; i < n; i++) {
            if (i % 2 != 0) ans += i;
        }
        System.out.println(ans);
    }
}
