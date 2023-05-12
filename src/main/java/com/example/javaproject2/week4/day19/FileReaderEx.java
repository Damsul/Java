package com.example.javaproject2.week4.day19;

import java.io.IOException;
import java.util.List;

public class FileReaderEx {

    public static void main(String[] args) throws IOException {
        FileReaderPrinter fileReaderEx = new FileInputStreamReaderPrinter();
        List<String> strLines = fileReaderEx.getLines("hospital_info_10lines.csv");

//
    }
}
