package com.example.javaproject2.algorithm.codeup.basic;

import java.util.Scanner;

public class CodeUp1044 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long val = sc.nextLong();
        System.out.println(++val);

        // 증감연산자: 변수의 앞이나 뒤에 붙여 변수에 저장되어있는 값을 1만큼 더하거나 빼주는 연산자
        // 변수 앞에 붙이면 그 변수를 사용하기 전에 증감을 먼저 수행, ex) ++val, --val
        // 변수 뒤에 붙이면 일단 변수에 저장되어있는 값을 먼저 사용하고 난 후 나중에 증감을 수행, ex) val++, val--
    }

}
