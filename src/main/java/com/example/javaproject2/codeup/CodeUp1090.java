package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1090 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long val = sc.nextInt();
        long r = sc.nextInt();
        long n = sc.nextInt();

        for (int i = 0; i < n - 1; i++) {
            val = val * r;
        }
        System.out.println(val);
    }
}