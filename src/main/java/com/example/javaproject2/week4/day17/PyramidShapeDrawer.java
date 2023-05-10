package com.example.javaproject2.week4.day17;

public class PyramidShapeDrawer extends ShapeDrawer2{

    @Override
    public String makeALine(int h, int i) {
        return String.format("%s%s\n", "0".repeat(h - i), "*".repeat(2 * i - 1));
    }

    public static void main(String[] args) {
        ShapeDrawer2 pyramid = new PyramidShapeDrawer();
        pyramid.printShape(5);
    }
}
