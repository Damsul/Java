package com.example.javaproject2.week5.day23;

public class bracketWithoutStack2 {

    public static void main(String[] args) {
        String bracket = "(((()))))";

        while (bracket.indexOf("()") != -1) {
            String[] split = bracket.split("\\(\\)");
            bracket = String.join("", split);
            System.out.println(bracket);
        }

        if (bracket.length() == 0) {
            System.out.println("올바른 괄호 입니다.");
        } else {
            System.out.println("올바른 괄호가 아닙니다.");
        }

    }

}
