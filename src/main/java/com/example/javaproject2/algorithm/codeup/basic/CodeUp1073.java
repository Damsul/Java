package com.example.javaproject2.algorithm.codeup.basic;

import java.util.Scanner;

public class CodeUp1073 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        while (true) {
//            int num = sc.nextInt();
//            if (num == 0) {
//                break;
//            }
//
//            System.out.println(num);
//        }
//        System.out.println("------");
        int n;
        do {
            n = sc.nextInt();
            if (n == 0) continue;
            System.out.println(n);
        } while (n != 0);
    }
}