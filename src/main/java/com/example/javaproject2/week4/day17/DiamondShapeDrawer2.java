package com.example.javaproject2.week4.day17;

import java.io.IOException;

public class DiamondShapeDrawer2 extends ShapeDrawer22{

    public DiamondShapeDrawer2(Printer2 printer) {
        super(printer);
    }

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

    public static void main(String[] args) throws IOException {
        ShapeDrawer22 diamond = new DiamondShapeDrawer2(new FilePrinter2());
        diamond.printShape(7);
    }
}
