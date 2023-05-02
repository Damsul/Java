package com.example.javaproject2.week3.day11;

public class MultiplicationTableStep5 {

    public static void main(String[] args) {

        int[] dan = {2, 4, 8, 9};

        for (int i = 0; i < dan.length; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.printf("%d * %d = %d\n", dan[i], j, dan[i] * j);
            }
            System.out.println("----------");
        }
    }
}
