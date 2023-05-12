package com.example.javaproject2.week4.day19;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.LinkedList;
import java.util.List;

public class FileReaderCharsetPrinter implements FileReaderPrinter {
    @Override
    public List<String> getLines(String fileName) throws IOException {
        List<String> lines = new LinkedList<>();

        try (BufferedReader br = new BufferedReader(
            new FileReader(fileName, Charset.forName("UTF-8")))) {

            String line;
            while ((line = br.readLine()) != null) {
                lines.add(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return lines;
    }
}
