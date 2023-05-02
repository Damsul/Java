package com.example.javaproject2.codeup.basic;

import java.util.Scanner;

public class CodeUp1096 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[][] board = new int[20][20];

        for (int i = 1; i < board.length; i++) {
            for (int j = 1; j < board[0].length; j++) {
                board[i][j] = sc.nextInt();
            }
        }

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            for (int j = 1; j < 20; j++) {
                if (board[x][j] == 1) board[x][j] = 0;
                else board[x][j] = 1;

                if (board[j][y] == 1) board[j][y] = 0;
                else board[j][y] = 1;
            }
        }

        for (int i = 1; i < board.length; i++) {
            for (int j = 1; j < board[0].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}