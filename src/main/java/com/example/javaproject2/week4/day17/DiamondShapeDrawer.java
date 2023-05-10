package com.example.javaproject2.week4.day17;

public class DiamondShapeDrawer extends ShapeDrawer2{

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
    @Override
    public String makeALine(int h, int i) {
        int pivot = h / 2;
        if (i <= pivot) {
            return String.format("%s%s\n", getRepeatedSymbol("0", pivot - i + 1), getRepeatedSymbol("*", 2 * i - 1));
        } else {
            return String.format("%s%s\n", getRepeatedSymbolFor("0", i - pivot - 1), getRepeatedSymbolFor("*", 2 * (h - i + 1) - 1));
        }
    }

    public static void main(String[] args) {
        ShapeDrawer2 diamond = new DiamondShapeDrawer();
        diamond.printShape(5);
    }
}
