package com.example.javaproject2.week2.day8;

public class ReferenceTypeArray {

    public static void main(String[] args) {
        Student[] student = new Student[2];
        student[0] = new Student();
        student[0].name = "경환";
        student[0].phoneNumber = "010-1111-1111";
        student[0].age = 27;

        student[1] = new Student();
        student[1].name = "xx";
        student[1].phoneNumber = "010-2222-1221";
        student[1].age = 21;
    }

}
