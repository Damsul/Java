package com.example.javaproject2.week4.day17;

import java.io.IOException;

public class RightTriangleShapeDrawer2 extends ShapeDrawer22{

    public RightTriangleShapeDrawer2(Printer2 printer) {
        super(printer);
    }

    @Override
    public String makeALine(int h, int i) {
        return String.format("%s\n", "*".repeat(i));
    }

    public static void main(String[] args) throws IOException {
        ShapeDrawer22 rt = new RightTriangleShapeDrawer2(new FilePrinter2());
        rt.printShape(5);
    }
}
