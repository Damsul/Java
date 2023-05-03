package com.example.javaproject2.week3.day13;

public class ZeroOrFive {

    public static boolean isZeroOrFive(int num) {
        while (num > 0) {
            int remainder = num % 10;
            if (remainder % 5 != 0) {
                return false;
            }
            num /= 10;
        }
        return true;
    }
    public static void main(String[] args) {
        int num = 5050;

        System.out.printf("%d는 0과 5로만 이루어진 숫자입니까? %b", num, isZeroOrFive(num));
    }
}
