package com.example.javaproject2.week4.day17;

public class RightTriangleShapeDrawer extends ShapeDrawer2{
    @Override
    public String makeALine(int h, int i) {
        return String.format("%s\n", "*".repeat(i));
    }

    public static void main(String[] args) {
        ShapeDrawer2 rt = new RightTriangleShapeDrawer();
        rt.printShape(5);
    }
}
