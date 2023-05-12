package com.example.javaproject2.week4.day19;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.LinkedList;
import java.util.List;

public class FileInputStreamReaderPrinter implements FileReaderPrinter {
    @Override
    public List<String> getLines(String fileName) throws IOException {
        List<String> lines = new LinkedList<>();

        try (BufferedReader br = new BufferedReader(
            new InputStreamReader(new FileInputStream(fileName), StandardCharsets.UTF_8))) {

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
