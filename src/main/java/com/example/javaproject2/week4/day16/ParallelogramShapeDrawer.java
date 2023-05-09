package com.example.javaproject2.week4.day16;

public class ParallelogramShapeDrawer extends ShapeDrawer{

    @Override
    public String makeALint(int h, int i) {
        return String.format("%s%s", " ".repeat(i), "*".repeat(h));
    }
}
