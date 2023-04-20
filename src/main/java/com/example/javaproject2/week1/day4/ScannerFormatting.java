package com.example.javaproject2.week1.day4;

import java.util.Scanner;

public class ScannerFormatting {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.printf("%d와 %d의 합은 %d입니다.", a, b, a + b);
    }

}
