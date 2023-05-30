package com.example.javaproject2.algorithm.codeup;

import java.util.Scanner;

public class CodeUp1120 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int val1 = sc.nextInt();
        int val2 = sc.nextInt();
        int val3 = sc.nextInt();
        float avg = (val1 + val2 + val3) / 3.0f;

        System.out.printf("%.2f", avg);
    }
}