package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1086 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long w = sc.nextInt();
        long h = sc.nextInt();
        long b = sc.nextInt();

        long file = w * h * b;
        float mbFile = file / 8.0f / 1024 / 1024;
        System.out.printf("%.2f MB", mbFile);
    }
}