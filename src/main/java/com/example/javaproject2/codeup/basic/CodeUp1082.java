package com.example.javaproject2.codeup.basic;

import java.util.Scanner;

public class CodeUp1082 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hexa = sc.nextInt(16);

        for (int i = 1; i < 16; i++) {
            System.out.printf("%X*%X=%X\n", hexa, i, hexa * i);
        }
    }
}