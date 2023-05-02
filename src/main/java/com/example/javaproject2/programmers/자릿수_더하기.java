package com.example.javaproject2.programmers;

public class 자릿수_더하기 {

    public static void main(String[] args) {

    }

    public int solution(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}
