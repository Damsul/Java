package com.example.javaproject2.codeup.basic;

import java.util.Scanner;

public class CodeUp1020 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] data = sc.next().split("-");
        int front = Integer.parseInt(data[0]);
        int back = Integer.parseInt(data[1]);

        System.out.printf("%06d%07d", front, back);
    }

}
