package com.example.javaproject2.week3.day11;

public class NewSwitchCaseClinicHours {

    public static void main(String[] args) {
        String day = "월";
        String time = switch (day) {
            case "월", "화", "목", "금" ->  "09:30-18:30";
            case "토" -> "09:30-13:00";
            case "수", "일" -> "휴진";
            default -> throw new IllegalArgumentException("입력 요일: " + day +  "해당하는 요일이 없습니다.");
        };
    }
}
