package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1091 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long val = sc.nextInt();
        long m = sc.nextInt();
        long d = sc.nextInt();
        long n = sc.nextInt();

        for (int i = 0; i < n - 1; i++) {
            val = val * m + d;
        }
        System.out.println(val);
    }
}