package com.example.javaproject2.week1.day4;

public class ByteTypeEx {

    public static void main(String[] args) {
        byte byte1 = 10;
        byte byte2 = -127;
        byte byte3 = -128;
        byte byte4 = (byte) -129; // 오버 플로우
        byte byte5 = (byte) 128; // 오버 플로우

        System.out.println("byte1 = " + byte1);
        System.out.println("byte2 = " + byte2);
        System.out.println("byte3 = " + byte3);
        System.out.println("byte4 = " + byte4);
        System.out.println("byte5 = " + byte5);
    }

}
