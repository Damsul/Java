package com.example.javaproject2.week2.day9;

public class ComparisonOperatorEx {

    public static void main(String[] args) {
        int val1 = 10;
        int val2 = 20;
        System.out.printf("%d == %d --> %b\n", val1, val2, val1 == val2);
        System.out.printf("%d != %d --> %b\n", val1, val2, val1 != val2);
        System.out.printf("%d <= %d --> %b\n", val1, val2, val1 <= val2);
        System.out.printf("%d <  %d --> %b\n", val1, val2, val1 < val2);
        System.out.printf("%d >= %d --> %b\n", val1, val2, val1 >= val2);
        System.out.printf("%d >  %d --> %b\n", val1, val2, val1 > val2);
    }

}
