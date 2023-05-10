package com.example.javaproject2.week4.day17;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ShapeDrawerFileDiamond extends ShapeDrawerFile {

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
    public void printShape(String[] lines) {
        // 파일 생성
        File file = new File("C:\\Users\\gyoun\\Damsul\\멋쟁이사자처럼", "diamond.txt");

        try {
            // 파일 존재(생성) 확인 및 생성
            if (!file.exists()) {
                System.out.println("파일생성? " + file.createNewFile());
            }

            // 파일에 write할 수 있는 FileWriter 생성
            FileWriter fw = new FileWriter(file);

            for (int i = 0; i < lines.length; i++) {
                // 파일 write
                fw.write(lines[i]);
            }
            fw.flush();
            // 파일 close
            fw.close();
        } catch (IOException e) {
            System.out.println("에러 발생");
            e.printStackTrace();
        }
    }

    @Override
    public String makeALint(int h, int i) {
        int pivot = h / 2;
        if (i <= pivot) {
            return String.format("%s%s\n", getRepeatedSymbol(" ", pivot - i), getRepeatedSymbol("*", 2 * i + 1));

        } else {
            return String.format("%s%s\n", getRepeatedSymbolFor(" ", i - pivot), getRepeatedSymbolFor("*", 2 * (h - i) - 1));
        }
    }

    public static void main(String[] args) {
        ShapeDrawerFile diamond = new ShapeDrawerFileDiamond();
        diamond.printShape(7);
    }
}
