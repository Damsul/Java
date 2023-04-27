package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1062 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int val1 = sc.nextInt();
        int val2 = sc.nextInt();
        System.out.println(val1 ^ val2);

        // 비트 단위 연산자 ^ : 캐럿 , 서컴플렉스
        // 둘 중 서도 다른 자리를 1로 만들어주는 연산자
        // 3       : 00000000 00000000 00000000 00000011
        // 5       : 00000000 00000000 00000000 00000101
        // 3 ^ 5   : 00000000 00000000 00000000 00000110
    }

}
