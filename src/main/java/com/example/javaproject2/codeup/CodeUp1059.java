package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1059 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int val = sc.nextInt();
        System.out.println(~val);

        // 비트 단위 연산자 ~ : 틸드
        // 0 -> 1, 1 -> 0 으로 바꾸는 연산자
        // val  : 00000000 00000000 00000000 00000001 -> 1
        // ~val : 11111111 11111111 11111111 11111110 -> -2
        // ~n = -n - 1
        // -n = ~n + 1
    }

}
