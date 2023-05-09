package com.example.javaproject2.week4.day16;

public class ReversePyramid {

    private String spaceChar = "";

    public ReversePyramid(String spaceChar) {
        this.spaceChar = spaceChar;
    }

    public String makeALint(int h, int i) {
        return String.format("%s%s\n", spaceChar.repeat(i), "*".repeat(h + 3 - (i * 2)));
    }
    public void printPyramid(int h, int i) {
        System.out.printf(makeALint(h, i));
    }
    public static void main(String[] args) {
        ReversePyramid reversePyramid = new ReversePyramid(" ");
        int h = 4;
        for (int i = 0; i < h; i++) {
            reversePyramid.printPyramid(h, i);
        }
    }
}
