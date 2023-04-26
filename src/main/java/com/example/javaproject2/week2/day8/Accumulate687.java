package com.example.javaproject2.week2.day8;

public class Accumulate687 {

    public static void main(String[] args) {
        int num = 687;
        int ans = 0;
        ans = ans + num % 10;
        System.out.printf("answer:%d\n", ans);
        num = num / 10;
        ans = ans + num % 10;
        System.out.printf("answer:%d\n", ans);
        num = num / 10;
        ans = ans + num % 10;
        System.out.printf("answer:%d\n", ans);
    }
}
