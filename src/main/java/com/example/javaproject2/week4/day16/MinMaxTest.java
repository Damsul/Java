package com.example.javaproject2.week4.day16;

public class MinMaxTest {
    public static void main(String[] args) {
        int[] arr = {109, 17, 309, 98, -1};
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        MinMaxEx maxC = new Max();
        MinMaxEx minC = new Min();
        for (int i = 0; i < arr.length; i++) {
            if (maxC.calc(max, arr[i])) {
                max = arr[i];
            }
            if (minC.calc(min, arr[i])) {
                min = arr[i];
            }
        }

        System.out.println("max: " + max + ", min: " + min);
    }
}
