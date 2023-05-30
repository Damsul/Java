package com.example.javaproject2.algorithm.codeup.basic;

import java.util.Scanner;

public class CodeUp1064 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int val1 = sc.nextInt();
        int val2 = sc.nextInt();
        int val3 = sc.nextInt();
        System.out.println((val1 < val2 ? val1 : val2) < val3 ? (val1 < val2 ? val1 : val2) : val3);

        // 삼항연산자
        // 조건식 ? 참일 때 결과 : 거짓일 때 결과
    }

}
