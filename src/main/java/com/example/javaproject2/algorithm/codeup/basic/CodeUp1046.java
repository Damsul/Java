package com.example.javaproject2.algorithm.codeup.basic;

import java.util.Scanner;

public class CodeUp1046 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long val1 = sc.nextLong();
        long val2 = sc.nextLong();
        long val3 = sc.nextLong();
        long sum = val1 + val2 + val3;
        float avg = sum / 3.0f;

        System.out.println(sum);
        System.out.printf("%.1f", avg);
    }

}
