package com.example.javaproject2.week4.day17;

import java.io.IOException;

public abstract class ShapeDrawerFile {
    public abstract String makeALint(int h, int i);
    public abstract void printShape(String[] lines);

    public void printShape(int h) {
        String[] lines = new String[h];

        for (int i = 0; i < h; i++) {
            lines[i] = makeALint(h, i);
        }

        printShape(lines);
        System.out.println("-------------");
    }
}
