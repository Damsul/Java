package com.example.javaproject2.programmers;

import java.util.Arrays;

public class 수열과_구간_쿼리_2 {

    public static void main(String[] args) {
        System.out.println(
            Arrays.toString(solution(new int[]{0, 1, 2, 4, 3,}, new int[][]{{0, 4, 2}, {0, 3, 2}, {0, 2, 2}})));
    }

    public static int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int min = Integer.MAX_VALUE;

            for (int j = queries[i][0]; j <= queries[i][1]; j++) {
                if (queries[i][2] < arr[j] && arr[j] < min) {
                    min = arr[j];
                }
            }

            if (min == Integer.MAX_VALUE) answer[i] = -1;
            else answer[i] = min;
        }

        return answer;
    }
}
