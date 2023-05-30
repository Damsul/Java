package com.example.javaproject2.algorithm.codeup.basic;

import java.util.Scanner;

public class CodeUp1019 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] data = sc.next().split("\\.");
        int year = Integer.parseInt(data[0]);
        int month = Integer.parseInt(data[1]);
        int day = Integer.parseInt(data[2]);

        System.out.printf("%04d.%02d.%02d", year, month, day);

    }

}
