package com.example.javaproject2.algorithm.programmers;

public class 수열과_구간_쿼리_3 {

    public static void main(String[] args) {

    }

    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};

        for (int i = 0; i < queries.length; i++) {
            int tmp = arr[queries[i][0]];
            arr[queries[i][0]] = arr[queries[i][1]];
            arr[queries[i][1]] = tmp;
        }

        return answer = arr;
    }
}
