package com.example.javaproject2.algorithm.codeup.basic;

import java.util.Scanner;

public class CodeUp1047 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long val = sc.nextLong();

        System.out.println(val << 1);

        // 비트단위시프트연산자 <<, >>
        // 2잔수 형태로 저장되어 있는 값들을 왼쪽이나 오른쪽으로 지정한 비트 수만큼 밀어주는 연산자
        // 밀어낸 수만큼 2배씩 늘어나거나 반으로 준다.
        // <<로 인해 왼쪽으로 밀리면 밀어낸 수만큼 오른쪽에 0이 추가됨
        // >>로 인해 오른쪽으로 밀리면 밀어낸 수만큼 왼쪽에 0(0 or 양의 정수인 경우)이나 1(음의 정수인 경우)이 추가됨
        // 32비트를 넘어서 이동되는 비트는 삭제됨.
    }

}
