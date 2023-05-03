package com.example.javaproject2.week3.day13;

public class IsPrimeBreak {
    public static void main(String[] args) {
        int num = 992;
        boolean isPrime = true;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.printf("%d는 소수입니다.", num);
        } else {
            System.out.printf("%d는 소수가 아닙니다.", num);
        }
    }
}
