package com.example.javaproject2.week3.day14;

import java.util.Arrays;

public class P120852B {
    public static void main(String[] args) {
        int n = 12;
        int divisor = 2;
        int[] arr = new int[n + 1];
        int idx = 0;

        while (n > 1) {
            if (n % divisor == 0) {
                arr[idx++] = divisor;
                n /= divisor;
            } else {
                divisor++;
            }
        }

        int[] ans = new int[idx];
        for (int i = 0; i < idx; i++) {
            ans[i] = arr[i];
        }
        System.out.println(Arrays.toString(ans));
    }
}
