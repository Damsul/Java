package com.example.javaproject2.codeup;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Scanner;

public class CodeUp1099 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // 갈 수 있는곳 : 0, 벽 또는 장애물 : 1, 먹이 : 2
        // 개미집 (2,2)
        // 이동 경로 : 9

        int[][] map = new int[11][11];
        for (int i = 1; i < map.length; i++) {
            for (int j = 1; j < map[0].length; j++) {
                map[i][j] = sc.nextInt();
//                map[i][j] = br.read();
            }
        }

        int x = 2;
        int y = 2;

        while (true) {
            // 이동 가능 확인
            if (x == 10 && y == 10) break;
            if (map[x][y + 1] == 1 && map[x + 1][y] == 1) break;
            if (map[x][y] == 2) break;

            if (map[x][y + 1] == 1) { // 세로 이동
                map[x++][y] = 9;
            } else { // 가로 이동
                map[x][y++] = 9;
            }
        }
        map[x][y] = 9;

        for (int i = 1; i < map.length; i++) {
            for (int j = 1; j < map[0].length; j++) {
                System.out.printf("%d ", map[i][j]);
//                bw.write(map[i][j] + " ");
            }
            System.out.println();
//            bw.write("\n");
        }
//        bw.flush();
    }
}