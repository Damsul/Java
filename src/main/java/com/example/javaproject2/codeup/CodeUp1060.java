package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1060 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int val1 = sc.nextInt();
        int val2 = sc.nextInt();
        System.out.println(val1 & val2);

        // 비트 단위 연산자 & : 앰퍼센트
        // 둘 다 1인 부분의 자리만 1로 만들어주는 연산자
        // val1        : 0011 -> 3
        // val2        : 0101 -> 5
        // val1 & val2 : 0001 -> 1
    }

}
