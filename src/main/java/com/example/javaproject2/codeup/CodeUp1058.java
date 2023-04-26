package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1058 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int val1 = sc.nextInt();
        int val2 = sc.nextInt();
        boolean flag1 = val1 == 1;
        boolean flag2 = val2 == 1;
        boolean result = !(flag1 || flag2);

        System.out.println(result ? 1 : 0);

    }

}
