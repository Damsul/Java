package com.example.javaproject2.week4.day18;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ReadFileEx {

    public List<String> getLines(String fileName) {
        List<String> lines = new LinkedList<>();

        try(BufferedReader br = Files.newBufferedReader(
            Paths.get(fileName), StandardCharsets.UTF_8)){

            String line;
            while ((line = br.readLine()) != null) {
                lines.add(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return lines;
    }

    public Hospital parse(String str) {
//        System.out.println(str);
        String[] split = str.split(",");
//        System.out.println(Arrays.toString(split));

        Address address = new Address(split[10], split[5], split[7]);
        String name = split[1];
        String website = split[11];

        return new Hospital(name, website, address);
    }

    public List<Hospital> getHospitals(List<String> lines) {
        List<Hospital> hospitals = new ArrayList<>();
        for (String line : lines) {
            hospitals.add(parse(line));
        }

        return hospitals;
    }

    public void printHospitals(List<Hospital> hospitals) {
        for (Hospital hospital : hospitals) {
            System.out.printf("%s %s\n", hospital.getName(), hospital.getWebsiteAddr());
            System.out.printf("%s %s %s\n",
                hospital.getAddress().getFullAddr(),
                hospital.getAddress().getSido(),
                hospital.getAddress().getSigungu()
            );
        }
    }

    public static void main(String[] args) throws IOException {
        ReadFileEx readFileEx = new ReadFileEx();
        List<String> strLines = readFileEx.getLines("hospital_info_10lines.csv");
        List<Hospital> parsedHospital = readFileEx.getHospitals(strLines);
        readFileEx.printHospitals(parsedHospital);
    }
}
