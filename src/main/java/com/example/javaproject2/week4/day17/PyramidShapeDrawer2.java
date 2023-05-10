package com.example.javaproject2.week4.day17;

import java.io.IOException;

public class PyramidShapeDrawer2 extends ShapeDrawer22{
    public PyramidShapeDrawer2(Printer2 printer) {
        super(printer);
    }

    @Override
    public String makeALine(int h, int i) {
        return String.format("%s%s\n", "0".repeat(h - i), "*".repeat(2 * i - 1));
    }

    public static void main(String[] args) throws IOException {
        ShapeDrawer22 pyramid = new PyramidShapeDrawer2(new FilePrinter2());
        pyramid.printShape(5);
    }
}
