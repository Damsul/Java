package com.example.javaproject2.week7.day29;

import java.util.ArrayList;
import java.util.List;

public class CMath {

    public static boolean isPrime(int num) {
        int cnt = factorsOf(num).size();
        return cnt == 1;
    }

    public static void printIsPrime(int num) {
        boolean result = isPrime(num);
        System.out.println(num + " -> " + result);
    }

    public static boolean isPerfectNumber(int num) {
        List<Integer> factors = factorsOf(num);
        int sum = factors.stream().mapToInt(Integer::intValue).sum();
        return num == sum;
    }
    public static void printPerfectNumber(int num) {
        System.out.println(num + " -> " + isPerfectNumber(num));
    }

    public static List<Integer> factorsOf(int num) {
        List<Integer> factors = new ArrayList<>();
        for (int i = 1; i < num; i++) {
            if (num % i == 0)
                factors.add(i);
        }
        return factors;
    }
    public static String factors(int num) {
        return factorsOf(num).toString();
    }

    public static void printFactors(int num) {
        System.out.println(factors(num));
    }
}
