package com.example.javaproject2.week2.day7;

public class StringEquals {

    public static void main(String[] args) {
        String str1 = "Gold";
        String str2 = "G";
        Boolean isSame = str1.substring(0, 1) == "G";

        System.out.println("Gold --> " + str1.hashCode());
        System.out.println("G --> " + str2.hashCode());
        System.out.println(isSame);

        isSame = str1.substring(0, 1).equals("G");
        System.out.println(isSame);
    }

}
