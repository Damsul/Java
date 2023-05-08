package com.example.javaproject2.week4.day15;

public class Pyramid {

    public static void main(String[] args) {
        int h = 4;
        for (int i = 1; i <= h; i++) {
            for (int j = h - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
