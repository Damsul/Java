package com.example.javaproject2.week2.day10;

import java.util.Arrays;

public class AutoSwap {

    public static void main(String[] args) {
        int[] arr = {2, 1, 9, 7};

        for (int i = 0; i < arr.length - 1; i++) {
            boolean check = arr[i] > arr[i + 1];
            if (check) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
