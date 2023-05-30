package com.example.javaproject2.algorithm.codeup.basic;

import java.util.Scanner;

public class CodeUp1061 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int val1 = sc.nextInt();
        int val2 = sc.nextInt();
        System.out.println(val1 | val2);

        // 비트 단위 연산자 | : 버티컬바, 파이프 연산자
        // 둘 중 하나라도 1인 자리를 1로 만들어주는 연산자
        // 3     : 00000000 00000000 00000000 00000011
        // 5     : 00000000 00000000 00000000 00000101
        // 3 | 5 : 00000000 00000000 00000000 00000111
    }

}
