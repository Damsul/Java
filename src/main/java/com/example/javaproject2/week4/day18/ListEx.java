package com.example.javaproject2.week4.day18;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListEx {

    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("Hello");
        list.add(3);
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println("list size: " + list.size());
        System.out.println("list isEmpty? " +  list.isEmpty());
        list.remove(0);
        list.remove(0);
        System.out.println("list isEmpty? " +  list.isEmpty());

        for (var item : list) {
//            System.out.println(item.split()); // 제네릭 안쓰면 사용 불가
        }
    }
}
