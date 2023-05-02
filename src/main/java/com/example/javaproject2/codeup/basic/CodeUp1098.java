package com.example.javaproject2.codeup.basic;

import java.util.Scanner;

public class CodeUp1098 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt(); // 세로
        int w = sc.nextInt(); // 가로
        int[][] board = new int[h + 1][w + 1];

        int n = sc.nextInt(); // 막대 개수

        // 막대 길이, 방향, 위치
        for (int i = 0; i < n; i++) {
            int len = sc.nextInt();
            int d = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();

            for (int j = 0; j < len; j++) {
                if (d == 0) { // 가로
                    board[x][y++] = 1;
                } else { // 세로
                    board[x++][y] = 1;
                }
            }
        }

        for (int i = 1; i < board.length; i++) {
            for (int j = 1; j < board[0].length; j++) {
                System.out.printf("%d ", board[i][j]);
            }
            System.out.println();
        }


        // 세로(h), 가로(w), 막대의 개수(h), 각 막대의 길이(l),
        // 막대를 놓는 방향(d:가로는 0, 세로는 1)
        // 막대를 놓는 막대의 가장 왼쪽 또는 위쪽의 위치(x, y)

    }
}