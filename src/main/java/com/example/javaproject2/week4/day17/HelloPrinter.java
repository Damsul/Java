package com.example.javaproject2.week4.day17;

import java.io.IOException;

public class HelloPrinter {

    Printer2 printer;

    public HelloPrinter(Printer2 printer) {
        this.printer = printer;
    }

    public void print(String message) {
        System.out.println(message);
    }

    public void repeatMessage(int n, String message) throws IOException {
        for (int i = 0; i < n; i++) {
            printer.print(message);
        }
    }

    public static void main(String[] args) throws IOException {
        HelloPrinter hp = new HelloPrinter(new FilePrinter());
        hp.repeatMessage(5, "Hello");
    }
}
