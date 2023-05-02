package com.example.javaproject2.week3.day11;

public class MultiplicationTableStep6 {

    public static void danPrint(int dan) {
        for (int j = 1; j <= 9; j++) {
            System.out.printf("%d * %d = %d\n", dan, j, dan * j);
        }
        System.out.println("----------");
    }
    public static void main(String[] args) {
        danPrint(2);
        danPrint(4);
        danPrint(8);
        danPrint(9);
    }
}
