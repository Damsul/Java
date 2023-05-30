package com.example.javaproject2.algorithm.codeup.basic;

import java.util.Scanner;

public class CodeUp1080 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int cur = 0;
        int sum = 0;

        while (sum < n) {
            cur++;
            sum += cur;
        }
        System.out.println(cur);
    }
}