package com.example.javaproject2.algorithm.codeup;

import java.util.Scanner;

public class CodeUp1124 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String molecule = sc.next(); // 분자식
        String temp = molecule.substring(1); // C 제거
        String[] atom = temp.split("H"); // H 기준으로 분리

        int cWeight = Integer.parseInt(atom[0]) * 12;
        int hWeight = Integer.parseInt(atom[1]);
        int totalWeight = cWeight + hWeight;
        System.out.println(totalWeight);
    }
}