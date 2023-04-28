package com.example.javaproject2.codeup;

import java.util.Arrays;
import java.util.Scanner;

public class CodeUp1441 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n + 1]; // 배열 선언

        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt(); // 정수 입력
        }

        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= n - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        for (int i = 1; i <= n; i++) {
            System.out.println(arr[i]);
        }
    }
}