package com.example.javaproject2.week5.day21;

import java.util.Arrays;

public class InsertionSort2 {

    public static void main(String[] args) {
        int[] arr = {7, 2, 3, 9, 28, 11, 1};

        for (int i = 1; i < arr.length; i++) {
            int target = arr[i];

            int idx = i;
            while (idx > 0 && arr[idx - 1] > target) {
                arr[idx] = arr[idx - 1];
                idx--;
            }

            arr[idx] = target;
        }
        System.out.println(Arrays.toString(arr));
    }
}
