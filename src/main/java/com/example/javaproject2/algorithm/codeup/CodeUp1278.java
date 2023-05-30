package com.example.javaproject2.algorithm.codeup;

import java.util.Scanner;

public class CodeUp1278 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int cnt = 1;

        while (num >= 10) {
            num /= 10;
            cnt++;
        }
        System.out.println(cnt);
    }
}
