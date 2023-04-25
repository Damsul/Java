package com.example.javaproject2.week2.day7;

public class StringSubstring {

    public static void main(String[] args) {
        String str = "대한민국";
        // .substring(시작 인덱스, 미만 인덱스)
        String s1 = str.substring(0, 1); // 대
        String s2 = str.substring(0, 2); // 대한
        String s3 = str.substring(1, 3); // 한민
        String s4 = str.substring(2); // 민국

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);

    }

}
