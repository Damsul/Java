package com.example.javaproject2.week2.day8;

import java.util.Arrays;

public class TwoDimensionalArray {

    public static void main(String[] args) {
        int[][] arr32 = new int[3][2];
        int[][] arr67 = new int[6][7];

        int[][] arr2 = {
            {10, 20, 30},
            {40, 50, 60},
            {70, 80, 90}
        };
        System.out.println(Arrays.toString(arr2[0]));
        System.out.println(Arrays.toString(arr2[1]));
        System.out.println(Arrays.toString(arr2[2]));



    }

}
