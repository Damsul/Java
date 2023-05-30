package com.example.javaproject2.algorithm.programmers;

public class 특별한_이차원_배열_1 {

    public static void main(String[] args) {

    }

    public int[][] solution(int n) {
        int[][] answer = new int[n][n];

        for (int i = 0; i < answer.length; i++) {
            for (int j = 0; j < answer[0].length; j++) {
                if (i == j) {
                    answer[i][j] = 1;
                }
            }
        }

        return answer;
    }
}
