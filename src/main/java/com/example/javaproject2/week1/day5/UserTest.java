package com.example.javaproject2.week1.day5;

public class UserTest {

    public static void main(String[] args) {
        User gr = new User();
        gr.name = "김경록";
        gr.phoneNumber = "010-0000-1234";
        gr.age = 37;

        User gh = new User();
        gh.name = "최경환";
        gh.phoneNumber = "010-0000-0000";
        gh.age = 27;

        System.out.printf("%s님은 성인입니까? %s\n", gr.name, gr.isAdult());
        System.out.printf("%s님은 성인입니까? %s\n", gh.name, gh.isAdult());
    }
}
