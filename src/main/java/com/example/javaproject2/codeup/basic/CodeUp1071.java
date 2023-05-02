package com.example.javaproject2.codeup.basic;

import java.util.Scanner;

public class CodeUp1071 {
    public static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
//        int num = sc.nextInt();
//        func(num);
        numPrint();
    }

    public static void numPrint() {
        while (true) {
            int num = sc.nextInt();
            if (num == 0) break;

            System.out.println(num);
        }
    }

    public static void func(int n) {
        if (n == 0) return;
        System.out.println(n);

        int num = sc.nextInt();
        func(num);
    }
}