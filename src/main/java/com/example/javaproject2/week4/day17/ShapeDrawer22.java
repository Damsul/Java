package com.example.javaproject2.week4.day17;

import java.io.File;
import java.io.IOException;

public abstract class ShapeDrawer22 {
    Printer2 printer;

    public ShapeDrawer22(Printer2 printer) {
        this.printer = printer;
    }

    public abstract String makeALine(int h, int i);

    public void printShape(int height) throws IOException {
        File file = new File("C:\\Users\\gyoun\\Damsul\\멋쟁이사자처럼\\test.txt");
        if (file.exists()) {
            System.out.println("파일이 이미 존재합니다. 초기화 하겠습니다.");
            file.delete();
        }

        for (int i = 1; i <= height; i++) {
//            System.out.print(makeALine(height, i));
            printer.print(makeALine(height, i));
        }
    }
}
