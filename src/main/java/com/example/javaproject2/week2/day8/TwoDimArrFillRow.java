package com.example.javaproject2.week2.day8;

import java.util.Arrays;

public class TwoDimArrFillRow {

    public static void fillRow(int[][] arr, int rowNum) {
        arr[rowNum][0] = 1;
        arr[rowNum][1] = 1;
        arr[rowNum][2] = 1;
        arr[rowNum][3] = 1;
        arr[rowNum][4] = 1;
    }

    public static void fillCol(int[][] arr, int colNum) {
        arr[0][colNum] = 1;
        arr[1][colNum] = 1;
        arr[2][colNum] = 1;
        arr[3][colNum] = 1;
        arr[4][colNum] = 1;
    }

    public static void printArr(int[][] arr) {
        System.out.println(Arrays.toString(arr[0]));
        System.out.println(Arrays.toString(arr[1]));
        System.out.println(Arrays.toString(arr[2]));
        System.out.println(Arrays.toString(arr[3]));
        System.out.println(Arrays.toString(arr[4]));
        System.out.println("---------------");
    }
    public static void main(String[] args) {
        int[][] arr = new int[5][5];
        fillRow(arr, 2);
        printArr(arr);

        fillCol(arr, 2);
        printArr(arr);
    }
}
