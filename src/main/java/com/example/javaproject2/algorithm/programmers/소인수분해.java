package com.example.javaproject2.algorithm.programmers;

public class 소인수분해 {
    public int[] solution(int n) {
        int[] prime = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            prime[i] = i;
        }

        int[] tmp = new int[n + 1];
        int idx = 0;
        for (int i = 2; i <= n; i++) { // 소수 확인
            if (prime[i] == 0) continue;
            prime[i] = 1; // 1: 소수o

            for (int j = i * i; j <= n; j+=i) {
                prime[j] = 0; // 0: 소수x
            }

            if (n % i == 0) { // 약수 확인
                tmp[idx++] = i;
            }
        }

        int[] ans = new int[idx];
        for (int i = 0; i < idx; i++) {
            ans[i] = tmp[i];
        }
        return ans;
    }

    public int[] solution2(int n) {
        int[] primes = new int[n + 1];
        int idx = 0;

        for (int i = 2; i <= n; i++) {
            if (isPrime(i) && n % i == 0) {
                primes[idx++] = i;
            }
        }

        int ans[] = new int[idx];
        for (int i = 0; i < idx; i++) {
            ans[i] = primes[i];
        }
        return ans;
    }
    public boolean isPrime(int num) {
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
