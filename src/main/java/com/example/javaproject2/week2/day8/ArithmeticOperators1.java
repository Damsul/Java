package com.example.javaproject2.week2.day8;

import java.util.Scanner;

public class ArithmeticOperators1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int val1 = sc.nextInt();
        int val2 = sc.nextInt();

        System.out.printf("val1 + val2 = %d\n", val1 + val2);
        System.out.printf("val1 - val2 = %d\n", val1 - val2);
        System.out.printf("val1 * val2 = %d\n", val1 * val2);
        System.out.printf("val1 / val2 = %d\n", val1 / val2);
        System.out.printf("val1 %% val2 = %d\n", val1 % val2);

    }

}
