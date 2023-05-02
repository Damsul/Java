package com.example.javaproject2.codeup.basic;

import java.util.Scanner;

public class CodeUp1095 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        int[] arr = new int[cnt];
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < cnt; i++) {
            arr[i] = sc.nextInt();
            if (min > arr[i]) min = arr[i];
        }
        System.out.println(min);
    }
}