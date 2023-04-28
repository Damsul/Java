package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1072 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        numPrint();
    }

    public static void numPrint() {
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            System.out.println(num);
        }
    }
}