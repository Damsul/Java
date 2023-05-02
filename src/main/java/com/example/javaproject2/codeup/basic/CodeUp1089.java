package com.example.javaproject2.codeup.basic;

import java.util.Scanner;

public class CodeUp1089 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int val = sc.nextInt();
        int d = sc.nextInt();
        int n = sc.nextInt();

        for (int i = 0; i < n - 1; i++) {
            val = val + d;
        }
        System.out.println(val);
    }
}