package com.example.javaproject2.codeup.basic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class CodeUp1084 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] data = br.readLine().split(" ");
        int red = Integer.parseInt(data[0]);
        int green = Integer.parseInt(data[1]);
        int blue = Integer.parseInt(data[2]);

        int count = 0;
        for (int i = 0; i < red; i++) {
            for (int j = 0; j < green; j++) {
                for (int k = 0; k < blue; k++) {
                    bw.write(i + " " + j + " " + k + "\n");
                    count++;
                }
            }
        }
        bw.write(String.valueOf(count));
        bw.flush();
    }
}