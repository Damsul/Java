package com.example.javaproject2.week4.day16;

public class ShapeDrawerTest {

    public static void main(String[] args) {
        ShapeDrawer pyramidSD = new PyramidShapeDrawer();
        ShapeDrawer parallelSD = new ParallelogramShapeDrawer();

        pyramidSD.printShape(5);
        parallelSD.printShape(5);
    }
}
