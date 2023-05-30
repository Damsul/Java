package com.example.javaproject2.week7.day29;

public class LeapYear {

    public static boolean checkLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }

    public static void printLeapYear(int year) {
        if (checkLeapYear(year)) {
            System.out.println(year + "은 윤년");
        } else {
            System.out.println(year + "은 평년");
        }
    }
}
