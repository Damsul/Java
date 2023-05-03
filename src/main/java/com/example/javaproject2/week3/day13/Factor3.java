package com.example.javaproject2.week3.day13;

public class Factor3 {

    public static void main(String[] args) {
        int n = 36;
        System.out.println(n+"의 약수는");
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.printf("%d ", i);
            }
        }
        System.out.println("입니다.");
    }
}
