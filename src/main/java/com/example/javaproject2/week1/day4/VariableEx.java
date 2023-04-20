package com.example.javaproject2.week1.day4;

import com.example.javaproject2.PrintHello;

public class VariableEx {

    public static void main(String[] args) {
        int iVal; // 기본 타입 변수 선언
        iVal = 0; // 기본 타입 변수 초기화
        PrintHello printHello; // 참조 변수 선언
        printHello = new PrintHello(); // new를 이용해 참조 변수 초기화

        System.out.println("iVal = " + iVal);
        System.out.println("printHello = " + printHello);
    }

}
