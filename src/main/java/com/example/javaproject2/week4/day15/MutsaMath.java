package com.example.javaproject2.week4.day15;

public class MutsaMath {

    public int sumOfFactors(int num) {
        int ans = 1;
        for (int i = 2; i <= num; i++) {
            if (num % i == 0) ans += i;
        }
        return ans;
    }

    public void printResult(int num) {
        System.out.printf("%d 약수의 합은 %d 입니다.\n", num, sumOfFactors(num));
    }

    public static void main(String[] args) {
        MutsaMath mutsaMath = new MutsaMath();
        mutsaMath.printResult(12);
        mutsaMath.printResult(36);
        mutsaMath.printResult(48);
        mutsaMath.printResult(29);
    }
}
