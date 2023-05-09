package com.example.javaproject2.week4.day16;

public abstract class ShapeDrawer {

    public void printShape(int h) {
        for (int i = 0; i < h; i++) {
            System.out.println(makeALint(h, i));
        }
        System.out.println("----------------");
    }

    public abstract String makeALint(int h, int i);

}
