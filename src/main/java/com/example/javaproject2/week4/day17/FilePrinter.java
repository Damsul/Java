package com.example.javaproject2.week4.day17;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FilePrinter implements Printer2{
    @Override
    public void print(String message) throws IOException {
        BufferedWriter bw = new BufferedWriter(
            new FileWriter("C:\\Users\\gyoun\\Damsul\\멋쟁이사자처럼\\test.txt"));
        bw.write(message);
        bw.flush();
        bw.close();
    }
}
