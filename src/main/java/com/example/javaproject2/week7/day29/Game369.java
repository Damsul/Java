package com.example.javaproject2.week7.day29;

public class Game369 {

    public static void start() {
        for (int i = 0; i < 100; i++) {
            System.out.printf("%02d", i);

            String str = "";
            int val1 = i / 10;
            int val2 = i % 10;
            if (val1 != 0 && val1 % 3 == 0)
                str += "*";
            if (val2 != 0 && val2 % 3 == 0)
                str += "*";

            System.out.printf("%s\n", str);
        }
    }
}
