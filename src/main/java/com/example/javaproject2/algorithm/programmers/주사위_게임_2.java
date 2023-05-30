package com.example.javaproject2.algorithm.programmers;

public class 주사위_게임_2 {

    public static void main(String[] args) {

    }

    public int solution(int a, int b, int c) {
        int answer = 0;
        if (a == b && a == c) {
            answer = (a+b+c) * (a*a+b*b+c*c) * (a*a*a+b*b*b+c*c*c);
        } else if (a == b || a == c || b == c) {
            answer = (a + b + c) * (a * a + b * b + c * c);
        } else {
            answer = a + b + c;
        }
        return answer;
    }
}
