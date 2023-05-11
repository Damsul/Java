package com.example.javaproject2.week4.day18;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class CodeUp3108_1 {
    private static List<Student_1> students = new ArrayList<>();

    public static Student_1 makeAStudent(int testId, String name) {
        return new Student_1(testId, name);
    }

    public static boolean isExist(Student_1 student) {
        for (Student_1 s : students) {
            if (s.getTestId() == student.getTestId()) return true;
        }
        return false;
    }

    public static void addAStudent(Student_1 student) {
        if (!isExist(student))
            students.add(student);
    }

    public static void deleteAStudent(Student_1 student) {
        int idx = 0;
        while (true) {
            if (idx == students.size()) break;

            boolean isExist = student.getTestId() == students.get(idx).getTestId();
            if (isExist) {
                students.remove(idx);
                break;
            }
            idx++;
        }
    }

    public static void printStudent(Scanner sc) {
        for (int i = 0; i < 5; i++) {
            int idx = sc.nextInt() - 1;
            Student_1 student = students.get(idx);
            System.out.printf("%s %s\n", student.getTestId(), student.getName());
        }
    }

    public static void process(Scanner sc) {
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String code = sc.next();
            int testId = sc.nextInt();
            String name = sc.next();

            Student_1 student = makeAStudent(testId, name);
            switch (code) {
                case "I" -> addAStudent(student);
                case "D" -> deleteAStudent(student);
            }

            if (code.equals("I")) {
                addAStudent(student);
            } else if (code.equals("D")) {
                deleteAStudent(student);
            }
        }

        students.sort(new Comparator<Student_1>() {
            @Override
            public int compare(Student_1 o1, Student_1 o2) {
                return o1.getTestId() - o2.getTestId();
            }
        });

        printStudent(sc);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        process(sc);
    }
}

class Student_1 {
    private int testId;
    private String name;

    public Student_1(int testId, String name) {
        this.testId = testId;
        this.name = name;
    }

    public int getTestId() {
        return testId;
    }

    public String getName() {
        return name;
    }
}