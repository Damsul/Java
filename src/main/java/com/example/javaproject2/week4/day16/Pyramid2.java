package com.example.javaproject2.week4.day16;

public class Pyramid2 {

    private String spaceChar = "0";

    public Pyramid2(String spaceChar) {
        this.spaceChar = spaceChar;
    }


    public String makeALine(String spaceChar, int height, int i) {
        return String.format("%s%s\n", spaceChar.repeat(height - i - 1), "*".repeat(2 * i + 1));
    }
    public void printPyramidWithSpaceChar(int height, String spaceChar) {
        for (int i = 0; i < height; i++) {
//            System.out.printf("공백개수: %d, 별개수: %d\n", height - i - 1, 2 * i + 1);
            System.out.print(makeALine(spaceChar, height, i));
        }
    }

    public static void main(String[] args) {
//        Pyramid2 pyramid2 = new Pyramid2();
//        int height = 4;
//        pyramid2.printPyramid(height);

        Pyramid2 pyramid2 = new Pyramid2(" ");
        Pyramid2 zeroPyramid2 = new Pyramid2("0");
//        pyramid2.printPyramid(4);
//        zeroPyramid2.printPyramid(5);

        pyramid2.printPyramidWithSpaceChar(3, " ");
        pyramid2.printPyramidWithSpaceChar(5, "^");
    }
}
