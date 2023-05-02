package com.example.javaproject2.codeup.basic;

import java.util.Scanner;

public class CodeUp1018 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.next().split(":");
        int h = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);
        System.out.printf("%d:%d", h, m);
    }

}
