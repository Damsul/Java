package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1274 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int val = sc.nextInt();

        String ans = "prime";
        for (int i = 2; i < val; i++) {
            if (val % i == 0) {
                ans = "not prime";
                break;
            }
        }
        System.out.println(ans);
    }
}