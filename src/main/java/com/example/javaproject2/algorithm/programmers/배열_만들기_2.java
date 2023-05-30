package com.example.javaproject2.algorithm.programmers;

import java.util.Arrays;

public class 배열_만들기_2 {

    public static void main(String[] args) {
//        System.out.println(Arrays.toString(solution(5, 555)));
//        System.out.println(Arrays.toString(solution2(5, 555)));
        System.out.println(Arrays.toString(solution3(5, 555)));
    }

    // 두번째 풀이
    public static int[] solution(int l, int r) {
        int[] answer = {-1};
        int[] arr = new int[1_000_000];
        int idx = 0;

        for (int i = l; i <= r; i++) {
            boolean flag = false;
            int num = i;

            while (num > 0) {
                if (num % 5 != 0) {
                    flag = true;
                    break;
                }
                num /= 10;
            }

            if (flag) continue;
            arr[idx++] = i;
        }

        if (idx != 0) {
            answer = new int[idx];
            for (int i = 0; i < idx; i++) {
                answer[i] = arr[i];
            }
        }

        return answer;
    }

    // 마지막 풀이, 최적화
    public static int[] solution2(int l, int r) {
        int[] answer = {-1};
        int[] arr = new int[1_000_000];
        int idx = 0;

        for (int i = 1; i < 64; i++) {
            int num = Integer.parseInt(Integer.toBinaryString(i)) * 5;

//            if (num < l) continue;
//            if (num > r) continue;
//            arr[idx++] = num;

            if (l <= num && num <= r) {
                arr[idx++] = num;
            }

        }

        if (idx != 0) {
            answer = new int[idx];
            for (int i = 0; i < idx; i++) {
                answer[i] = arr[i];
            }
        }
        return answer;
    }

    // 처음 풀이
    public static int[] solution3(int l, int r) {
        int[] answer = {-1};
        int[] arr = new int[1_000_000];
        int idx = 0;

        for (int i = l; i <= r; i++) {
            String strNum = String.valueOf(i);
            boolean flag = false;

            for (int j = 0; j < 10; j++) {
                if (j == 0 || j == 5) continue;
                if (strNum.contains(String.valueOf(j))) {
                    flag = true;
                    break;
                }
            }

            if (flag) continue;
            arr[idx++] = Integer.parseInt(strNum);
        }

        if (idx != 0) {
            answer = new int[idx];
            for (int i = 0; i < idx; i++) {
                answer[i] = arr[i];
            }
        }

        return answer;
    }
}
