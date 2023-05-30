package com.example.javaproject2.algorithm.programmers;

public class 수열과_구간_쿼리_4 {

    public static void main(String[] args) {

    }

    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};

        for (int idx = 0; idx < queries.length; idx++) {
            int[] query = queries[idx];
            int s = query[0], e = query[1], k = query[2];

            for (int i = s; i <= e; i++) {
                if (i % k == 0) {
                    arr[i]++;
                }
            }
        }

        return answer = arr;
    }
}
