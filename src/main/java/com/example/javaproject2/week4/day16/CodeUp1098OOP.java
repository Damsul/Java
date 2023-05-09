package com.example.javaproject2.week4.day16;

import java.util.Arrays;
import java.util.Scanner;

public class CodeUp1098OOP {
    private int[][] arr;
    private boolean printSeparator;

    public CodeUp1098OOP() {
        this.arr = new int[5][5];
        this.printSeparator = true;
    }

    public CodeUp1098OOP(boolean printSeparator) {
        this.printSeparator = printSeparator;
    }

    public CodeUp1098OOP(int row) {
        this.arr = new int[row][5];
    }

    public CodeUp1098OOP(int row, int col) {
        this.arr = new int[row][col];
    }

    public void setBeam(int l, int d, int x, int y) {
        for (int i = 0; i < l; i++) {
            if (d == 0) { // 가로
                arr[x - 1][y + i - 1] = 1;
            } else { // 세로
                arr[x + i - 1][y - 1] = 1;
            }
        }
    }

    public void printArr() {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
        System.out.println("--------------");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt(); // 세로
        int w = sc.nextInt(); // 가로
        CodeUp1098OOP c1098OOP = new CodeUp1098OOP(h, w);

        int n = sc.nextInt(); // 막대 개수

        // 막대 길이, 방향, 위치
        for (int i = 0; i < n; i++) {
            int l = sc.nextInt();
            int d = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();

            c1098OOP.setBeam(l, d, x, y);
            c1098OOP.printArr();
        }

        // 세로(h), 가로(w), 막대의 개수(h), 각 막대의 길이(l),
        // 막대를 놓는 방향(d:가로는 0, 세로는 1)
        // 막대를 놓는 막대의 가장 왼쪽 또는 위쪽의 위치(x, y)

    }
}