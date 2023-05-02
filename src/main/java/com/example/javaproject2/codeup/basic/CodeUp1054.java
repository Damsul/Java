package com.example.javaproject2.codeup.basic;

import java.util.Scanner;

public class CodeUp1054 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int val1 = sc.nextInt();
        int val2 = sc.nextInt();

        boolean flag = false;

        System.out.println(val1 == 1 && val1 == val2 ? 1 : 0);
    }

}
