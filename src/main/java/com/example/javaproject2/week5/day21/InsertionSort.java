package com.example.javaproject2.week5.day21;

import java.util.Arrays;

public class InsertionSort {
    public int[] sort(int[] arr, boolean isAscending) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if ((isAscending ? arr[j - 1] - arr[j] : arr[j] - arr[j - 1]) > 0) {
                    int tmp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = tmp;
                } else {
                    break;
                }
            }
        }

        return arr;
    }

    public int[] sort(int[] arr) {
        return sort(arr, false);
    }

    public static void main(String[] args) {
        InsertionSort insertionSort = new InsertionSort();
        int[] arr = {7, 2, 3, 9, 28, 11, 1};

        arr = insertionSort.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
