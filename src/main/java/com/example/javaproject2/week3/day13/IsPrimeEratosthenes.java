package com.example.javaproject2.week3.day13;

import java.util.Arrays;
import java.util.Scanner;

public class IsPrimeEratosthenes {

    // 2 ~ n까지 소수는 몇개 일까?
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] num = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            num[i] = i;
        }
        int cnt = 0;

        for (int i = 2; i <= n; i++) {
            if (num[i] == 0) continue; // false 이면 continue

            cnt++; // 소수 개수 증가

            for (int j = i * i; j <= n; j += i) {
                num[j] = 0; // i의 배수 false 처리
            }
        }
        System.out.println(cnt);
    }
}
