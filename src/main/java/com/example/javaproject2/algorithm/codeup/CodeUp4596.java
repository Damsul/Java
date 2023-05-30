package com.example.javaproject2.algorithm.codeup;

import java.util.Scanner;

public class CodeUp4596 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[9][9];

        int max = -1, row = 0, col = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
                if (max < arr[i][j]) {
                    max = arr[i][j];
                    row = i + 1;
                    col = j + 1;
                }
            }
        }
        System.out.println(max);
        System.out.println(row + " " + col);
    }
}
