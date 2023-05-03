package com.example.javaproject2.week3.day13;

public class ZeroOrFive2 {

    public static void main(String[] args) {
        int num = 5051;

        String result = "0과 5로만 이루어진 숫자입니다.";
        while (num > 0) {
            int remainder = num % 10;
            if (remainder != 0 && remainder != 5) {
                result = "0과 5로만 이루어진 숫자가 아닙니다.";
                break;
            }
            num /= 10;
        }
        System.out.println("입력한 숫자는 " + result);
    }
}
