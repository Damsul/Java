package com.example.javaproject2.algorithm.codeup;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class CodeUp3108 {
    private static final List<Student> students = new ArrayList<>();

    public static Student makeAStudent(int testId, String name) {
        return new Student(testId, name);
    }

    public static boolean isExist(Student pStudent) {
        for (Student student : students) {
            if (pStudent.getTestId() == student.getTestId()) return true;
        }
        return false;
    }

    public static void addAStudent(Student student) {
        if (!isExist(student)) {
            students.add(student);
        }
    }

    public static void deleteAStudent(Student student) {
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

    public static void printStudent() {
        for (Student student : students) {
            System.out.printf("%d %s\n", student.getTestId(), student.getName());
        }
    }

    public static void printSpecificStudents(int[] arr) {
        // 오름차순 정렬
        students.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getTestId() - o2.getTestId();
            }
        });

        for (int i = 0; i < 5; i++) {
            Student student = students.get(arr[i]);
            System.out.printf("%d %s\n", student.getTestId(), student.getName());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String code = sc.next();
            int testId = sc.nextInt();
            String name = sc.next();

            Student student = makeAStudent(testId, name);
            if (code.equals("I")) {
                addAStudent(student);
            }
            if (code.equals("D")) {
                deleteAStudent(student);
            }
        }
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt() - 1;
        }
        printSpecificStudents(arr);
    }
}

class Student {
    private int testId;
    private String name;

    public Student(int testId, String name) {
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