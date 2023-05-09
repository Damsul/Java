package com.example.javaproject2.week4.day16;

public class PyramidShapeDrawer extends ShapeDrawer{

    @Override
    public String makeALint(int h, int i) {
        return String.format("%s%s", " ".repeat(h - i - 1), "*".repeat(2 * i + 1));
    }
}
