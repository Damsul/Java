package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1027 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] data = sc.next().split("\\.");
        int y = Integer.parseInt(data[0]); // year
        int m = Integer.parseInt(data[1]); // month
        int d = Integer.parseInt(data[2]); // day

        System.out.printf("%02d-%02d-%04d", d, m, y);
    }
}
