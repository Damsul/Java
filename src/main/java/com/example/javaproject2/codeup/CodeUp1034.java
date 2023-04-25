package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1034 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String data = sc.next();

        // 8진수로 변경
        int octal = Integer.parseInt(data, 8);

        // 8진수 -> 10진수 출력
        System.out.printf("%d", octal);
    }

}
