package com.example.javaproject2.week1.day5;

public class Point {
    int x;
    int y;

    boolean isSameXy() {
        return x == y;
    }

    double getDistance(Point p) {
        int nx = x - p.x;
        int ny = y - p.y;

        return Math.sqrt(Math.pow(nx, 2) + Math.pow(ny, 2));
    }
}
