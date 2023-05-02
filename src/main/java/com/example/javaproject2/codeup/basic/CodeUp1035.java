package com.example.javaproject2.codeup.basic;

import java.util.Scanner;

public class CodeUp1035 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String data = sc.next();

        // 16진수로 변경
        int hexa = Integer.parseInt(data, 16);

        // 16진수 -> 8진수 출력
        System.out.printf("%o", hexa);
    }

}
