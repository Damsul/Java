package com.example.javaproject2.week3.day13;

public class MaxValue {

    public static void main(String[] args) {
        int[] arr = {2, 1, 31, 9, 7};
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) max = arr[i];
        }
        System.out.println(max);
    }
}
