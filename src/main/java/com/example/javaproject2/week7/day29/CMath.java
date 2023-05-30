package com.example.javaproject2.week7.day29;

import java.util.ArrayList;
import java.util.List;

public class CMath {

    public static boolean isPrime(int num) {
        int cnt = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0)
                cnt++;
        }
        return cnt < 2;
    }

    public static void printIsPrime(int num) {
        boolean result = isPrime(num);
        System.out.println(num + " -> " + result);
    }

    public static boolean isPerfectNumber(int num) {
        List<Integer> factors = new ArrayList<>();
        for (int i = 1; i < num; i++) {
            if (num % i == 0)
                factors.add(i);
        }

        int sum = 0;
        for (int i = 0; i < factors.size(); i++) {
            sum += factors.get(i);
        }

        return num == sum;
    }
    public static void printPerfectNumber(int num) {
        System.out.println(num + " -> " + isPerfectNumber(num));
    }

    public static String factors(int num) {
        List<Integer> factors = new ArrayList<>();
        for (int i = 1; i < num; i++) {
            if (num % i == 0)
                factors.add(i);
        }
        return factors.toString();
    }
}
