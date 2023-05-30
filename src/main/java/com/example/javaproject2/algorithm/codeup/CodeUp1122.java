package com.example.javaproject2.algorithm.codeup;

import java.util.Scanner;

public class CodeUp1122 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int val = sc.nextInt();

        System.out.printf("%d %d", val / 60, val % 60);
    }
}