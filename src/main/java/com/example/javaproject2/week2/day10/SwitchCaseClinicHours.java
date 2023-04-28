package com.example.javaproject2.week2.day10;

public class SwitchCaseClinicHours {

    public static void main(String[] args) {
        String day = "일";
        String time = "휴진";

        switch (day) {
            case "월", "화", "목", "금":
                time = "09:30-18:00";
                break;
            case "토":
                time = "09:30-13:00";
                break;
        }
        System.out.printf("%s요일 %s", day, time);
    }

}
