package com.example.javaproject2.algorithm;

import java.util.Arrays;
import java.util.Comparator;

public class BubbleSort {

    Comparator<Integer> comparator;

    public BubbleSort(Comparator<Integer> comparator) {
        this.comparator = comparator;
    }

    public int[] sortARound(int[] arr, int until) {
        for (int i = 0; i < arr.length - until; i++) {
            if (comparator.compare(arr[i], arr[i + 1]) > 0) {
                int tmp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = tmp;
            }
        }
        return arr;
    }

    public int[] sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            arr = sortARound(arr, i);
        }
        return arr;
    }

    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort((o1,o2) -> o1 - o2);
        int[] arr = {7, 2, 3, 9, 28, 11, 1};
        arr = bubbleSort.sort(arr);

        System.out.println(Arrays.toString(arr));
    }
}
