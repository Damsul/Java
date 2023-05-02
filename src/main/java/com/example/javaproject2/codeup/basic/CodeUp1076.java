package com.example.javaproject2.codeup.basic;

import java.util.Scanner;

public class CodeUp1076 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);

//        for (int i = 'a'; i < c; i++) {
//            System.out.printf("%c ", i);
//        }
//        System.out.print(c);

        char cur = 'a';
        while (cur < c) {
            System.out.printf("%c ", cur++);
        }
        System.out.print(c);
    }
}