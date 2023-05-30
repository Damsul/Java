package com.example.javaproject2.algorithm.codeup.basic;

import java.util.Scanner;

public class CodeUp1094 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        int[] arr = new int[cnt];
        for (int i = 0; i < cnt; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = cnt - 1; i >= 0; i--) {
            System.out.printf("%d ", arr[i]);
        }
    }
}