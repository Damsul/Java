package com.example.javaproject2.week4.day18;

import java.util.ArrayList;
import java.util.List;

public class GenericEx {

    public static void main(String[] args) {
        List<String> strList = new ArrayList<>();
        strList.add("Hello");
        strList.add("Bye~");
        strList.add("1");

        List<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(5);
        intList.add(9);

        for (String item : strList) {
            System.out.println(item);
        }

        for (int item : intList) {
            System.out.println(item);
        }
    }
}
