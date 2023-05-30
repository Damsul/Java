package com.example.javaproject2.algorithm.codeup.basic;

import java.util.Scanner;

public class CodeUp1024 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String data = sc.next();
        for (int i = 0; i < data.length(); i++) {
            System.out.printf("'%c'\n", data.charAt(i));
        }
    }
}
