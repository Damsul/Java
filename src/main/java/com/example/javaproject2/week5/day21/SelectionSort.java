package com.example.javaproject2.week5.day21;

import java.util.Arrays;

public class SelectionSort {

    public int[] sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int targetIdx = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[targetIdx] > arr[j]) {
                    targetIdx = j;
                }
            }

            swap(arr, i, targetIdx);
        }
        return arr;
    }

    public void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static void main(String[] args) {
        int[] arr = {7, 2, 3, 9, 28, 11, 1};
        int[] arr2 = {7, 3, 2, 8, 9, 4, 6, 1, 5};
        SelectionSort selectionSort = new SelectionSort();

        arr = selectionSort.sort(arr2);
        System.out.println(Arrays.toString(arr));
    }
}
