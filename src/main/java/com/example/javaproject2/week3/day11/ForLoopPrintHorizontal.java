package com.example.javaproject2.week3.day11;

public class ForLoopPrintHorizontal {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.printf("%d", i);
            if (i < 9) {
                System.out.print(" ");
            }
        }
    }
}
