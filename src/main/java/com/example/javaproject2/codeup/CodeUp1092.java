package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1092 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int val1 = sc.nextInt();
        int val2 = sc.nextInt();
        int val3 = sc.nextInt();

        int day = 1;
        while (day % val1 != 0 || day % val2 != 0 || day % val3 != 0) {
            day++;
        }
        System.out.println(day);
    }
}