package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1043 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int val1 = sc.nextInt();
        int val2 = sc.nextInt();
        System.out.println(val1 % val2);

        // 음(-)이 아닌 정수에 대해서만 % 연산 가능
    }

}
