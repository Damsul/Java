package com.example.javaproject2.week2.day9;

public class CheckWeatherAdult {

    public static void main(String[] args) {
        int userAge = 31;
        boolean isAdult = userAge >= 18;
        System.out.printf("미성년자 입니까? %b", !isAdult);
    }
}
