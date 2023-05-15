package com.example.javaproject2.algorithm;

import java.util.Arrays;
import java.util.Comparator;

public class BubbleSort2 {

    Comparator<Integer> comparator;

    public BubbleSort2(Comparator<Integer> comparator) {
        this.comparator = comparator;
    }

    public int[] sortARound(int[] arr, int idx) {
        for (int i = idx + 1; i < arr.length; i++) {
            if (comparator.compare(arr[idx], arr[i]) > 0) {
                int tmp = arr[idx];
                arr[idx] = arr[i];
                arr[i] = tmp;
            }
        }
        return arr;
    }
    public int[] sort(int[] arr) {
        for (int idx = 0; idx < arr.length - 1; idx++) {
            arr = sortARound(arr, idx);
        }
        return arr;
    }
    public static void main(String[] args) {
        BubbleSort2 bubbleSort = new BubbleSort2(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        int[] arr = {7, 2, 3, 9, 28, 11, 1};

        arr = bubbleSort.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
