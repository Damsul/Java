package com.example.javaproject2.week4.day17;

public abstract class ShapeDrawer2 {
    public abstract String makeALine(int h, int i);

    public void printShape(int height) {
        for (int i = 1; i <= height; i++) {
            System.out.print(makeALine(height, i));
        }
    }
}
