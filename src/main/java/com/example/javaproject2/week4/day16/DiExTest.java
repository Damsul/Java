package com.example.javaproject2.week4.day16;

public class DiExTest {

    public static void main(String[] args) {
        DiEx diEx1 = new DiEx(new PyramidShapeDrawer());
        DiEx diEx2 = new DiEx(new ParallelogramShapeDrawer());

        diEx1.doSth();
        diEx2.doSth();
    }
}
