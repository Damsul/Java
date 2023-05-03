package com.example.javaproject2.week3.day13;

import java.util.Scanner;

public class DoWhileEx2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        do {
            System.out.print("0 이상 10 이하의 정수를 입력하세요: ");
            num = sc.nextInt();
        } while (num < 0 || num > 10);

        System.out.println("입력한 숫자는 " + num + "입니다.");
    }
}
