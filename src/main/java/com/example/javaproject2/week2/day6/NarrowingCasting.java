package com.example.javaproject2.week2.day6;

public class NarrowingCasting {

    public static void main(String[] args) {
        double dVal = 123.456;
        int iVal = (int) dVal;

        System.out.println("dVal = " + dVal);
        System.out.println("iVal = " + iVal);

//        String str = "123ab"; // 숫자가 아닌 문자열
//        int num = Integer.parseInt(str); // NumberFormatException 발생

//        int result = 1 + Integer.parseInt("1");
//        System.out.println(result); // 2가 출력됨

//        String val1 = "1.5";
//        String val2 = "2.5";
//        System.out.println(val1 + val2);

//        float fResult = Float.parseFloat(val1) + Float.parseFloat(val2);
//        System.out.println(fResult);

        String val1 = "1.11111111"; // 소수점 여덟 자리
        String val2 = "2.11111111"; // 소수점 여덟 자리
        float result = Float.parseFloat(val1) + Float.parseFloat(val2);
        System.out.println(result);

    }

}
