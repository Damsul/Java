package com.example.javaproject2.week3.day11;

public class NewSwitchCaseSeason {

    public static void main(String[] args) {
        int month = 11;
        switch (month) {
            case 12, 1, 2 -> System.out.println("winter");
            case 3, 4, 5 -> System.out.println("spring");
            case 6, 7, 8 -> System.out.println("summer");
            case 9, 10, 11 -> System.out.println("fall");
            default -> System.out.println("해당하는 계절이 없습니다.");

            // 자바 14버전 이후 부터 사용 가능
        }
    }
}
