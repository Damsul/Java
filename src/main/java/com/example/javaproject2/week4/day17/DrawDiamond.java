package com.example.javaproject2.week4.day17;

public class DrawDiamond {

    public static String getRepeatedSymbol(String symbol, int n) {
        return symbol.repeat(n);
    }

    public static String getRepeatedSymbolFor(String symbol, int n) {
        String ans = "";
        for (int i = 0; i < n; i++) {
            ans += symbol;
        }
        return ans;
    }

    public static void main(String[] args) {
        int h = 9;
        int pivot = h / 2; // 피라미드 -> 멱피라미드 분기점

        for (int i = 0; i < h; i++) {
            if (i <= pivot) {
//                System.out.printf("%s", getRepeatedSymbol(" ", pivot - i));
//                System.out.printf("%s\n", getRepeatedSymbol("*", 2 * i + 1));
                System.out.printf("%s", getRepeatedSymbolFor(" ", pivot - i));
                System.out.printf("%s\n", getRepeatedSymbolFor("*", 2 * i + 1));
            } else {
                System.out.printf("%s", getRepeatedSymbol(" ", i - pivot));
                System.out.printf("%s\n", getRepeatedSymbol("*", 2 * (h - i) - 1));
            }
        }
    }
}
