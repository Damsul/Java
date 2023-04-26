package com.example.javaproject2.week2.day8;

public class RemainderSum {

    public static void main(String[] args) {
        int num = 687;
        int remainder1 = num % 10;
        num = num / 10;
        int remainder2 = num % 10;
        num = num / 10;
        int remainder3 = num % 10;

        System.out.println(remainder1 + remainder2 + remainder3);
    }

}
