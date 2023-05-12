package com.example.javaproject2.week4.day19;

import java.io.IOException;
import java.util.List;

public interface FileReaderPrinter {

    List<String> getLines(String fileName) throws IOException;

}
