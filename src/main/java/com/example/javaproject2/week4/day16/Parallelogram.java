package com.example.javaproject2.week4.day16;

public class Parallelogram {
    private String spaceChar = "";

    public Parallelogram(String spaceChar) {
        this.spaceChar = spaceChar;
    }

    public String makeALint(int h, int i) {
        return String.format("%s%s\n", spaceChar.repeat(i), "*".repeat(h));
    }
    public String makeALint2(int h, int i) {
        return String.format("%s%s\n", spaceChar.repeat(h - i - 1), "*".repeat(h));
    }
    public void printParallelogram(int h, int i) {
        System.out.printf(makeALint2(h, i));
    }
    public static void main(String[] args) {
        Parallelogram parallelogram = new Parallelogram(" ");
        int h = 5;
        for (int i = 0; i < h; i++) {
            parallelogram.printParallelogram(h, i);
        }
    }
}
