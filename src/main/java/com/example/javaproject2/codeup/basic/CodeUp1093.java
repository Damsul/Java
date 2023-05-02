package com.example.javaproject2.codeup.basic;

import java.util.Scanner;

public class CodeUp1093 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        int[] arr = new int[23];
        for (int i = 1; i <= cnt; i++) {
            arr[sc.nextInt() - 1]++;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d ", arr[i]);
        }
    }
}