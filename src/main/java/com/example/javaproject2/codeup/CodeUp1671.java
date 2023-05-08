package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1671 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String result = "";
        while (!result.equals("win")) {
            int player = sc.nextInt();
            int computer = sc.nextInt();

            result = rockScissorPager(player, computer);
            System.out.println(result);
        }
    }

    public static String rockScissorPager(int player, int computer) {

        if (player == 0 && computer == 1) return "win";
        else if (player == 1 && computer == 2) return "win";
        else if (player == 2 && computer == 0) return "win";
        else if (player == computer) return "tie";
        else return "lose";
    }
}