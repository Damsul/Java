package com.example.javaproject2.week4.day17;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FilePrinter2 implements Printer2{
    @Override
    public void print(String message) throws IOException {
        File file = new File("C:\\Users\\gyoun\\Damsul\\멋쟁이사자처럼\\test.txt");
        BufferedWriter bw = new BufferedWriter(new FileWriter(file, true)); // true: 이어쓰기 가능
        bw.write(message);
        bw.flush();
        bw.close();
    }
}
