package com.example.javaproject2.week4.day16;

public class Max extends MinMaxEx {

    @Override
    boolean calc(int val1, int val2) {
        if (val1 < val2) return true;
        return false;
    }
}
