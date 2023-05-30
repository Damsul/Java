package com.example.javaproject2.algorithm.codeup.basic;

import java.util.Scanner;

public class CodeUp1085 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long h = sc.nextInt();
        long b = sc.nextInt();
        long c = sc.nextInt();
        long s = sc.nextInt();

        long file = h * b * c * s;
        float mbFile = file / 8.0f / 1024 / 1024;
        System.out.printf("%.1f MB", mbFile);
    }
}