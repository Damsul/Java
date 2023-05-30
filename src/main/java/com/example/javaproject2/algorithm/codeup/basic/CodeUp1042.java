package com.example.javaproject2.algorithm.codeup.basic;

import java.util.Scanner;

public class CodeUp1042 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int val1 = sc.nextInt();
        int val2 = sc.nextInt();
        System.out.println(val1 / val2);

        // 정수/정수 연산의 결과는 정수(몫)로 계산
        // 실수/정수, 정수/실수, (float)정수/정수, 정수/(float)정수 등의 연산 결과는 실수 값으로 계산

        // 정수/실수 계산결과가 자동으로 실수형으로 바뀌는 것을 묵시적 (데이터)형변환이라고 하고,
        // 어떤 값이나 결과의 데이터형을 강제로 바꾸는 것을 명시적 (데이터)형변환이라고 한다.
    }

}
