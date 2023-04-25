package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1025 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] data = sc.next().split("");
        System.out.printf("[%d]\n", Integer.parseInt(data[0]) * 10000);
        System.out.printf("[%d]\n", Integer.parseInt(data[1]) * 1000);
        System.out.printf("[%d]\n", Integer.parseInt(data[2]) * 100);
        System.out.printf("[%d]\n", Integer.parseInt(data[3]) * 10);
        System.out.printf("[%d]\n", Integer.parseInt(data[4]) * 1);
    }
}
