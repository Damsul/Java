package com.example.javaproject2.week4.day19;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.List;

public class FileNewBufferedReaderPrinter implements FileReaderPrinter {
    @Override
    public List<String> getLines(String fileName) throws IOException {
        List<String> lines = new LinkedList<>();

        try (BufferedReader br = Files.newBufferedReader(
            Paths.get(fileName), StandardCharsets.UTF_8)) {

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
