package com.example.javaproject2.week2.day9;

public class Accumulate687Compound {

    public static void main(String[] args) {
        int num = 687;
        int ans = 0;
        ans += num % 10;
        num /= 10;
        ans += num % 10;
        num /= 10;
        ans += num % 10;
        num /= 10;
        System.out.println("answer: " + ans);

    }

}
