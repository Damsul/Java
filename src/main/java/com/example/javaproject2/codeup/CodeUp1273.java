package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1273 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int val = sc.nextInt();

        for (int i = 1; i <= val; i++) {
            if (val % i == 0)
                System.out.printf("%d ", i);
        }
    }
}