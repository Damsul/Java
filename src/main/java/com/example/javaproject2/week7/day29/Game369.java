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

    public static String is369(int num) {
        int val1 = num / 10;
        int val2 = num % 10;
        String str = (val2 != 0 && val2 % 3 == 0) ? "*" : "";
        if (val1 == 0)
            return str;

        return str + is369(val1);
    }

    public static void print369(int num) {
        System.out.printf("%02d%s\n", num, is369(num));
    }
}
