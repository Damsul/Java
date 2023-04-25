package com.example.javaproject2.week2.day7;

public class StringSplit {

    public static void main(String[] args) {
        String str = "10 3 11 97 127";
        String[] data = str.split(" ");
        System.out.println(data[0]); // 10
        System.out.println(data[1]); // 3
        System.out.println(data[2]); // 11
        System.out.println(data[3]); // 97
        System.out.println(data[4]); // 127
    }

}
