package com.rakovets.course.java.core.practice.io.project_file_util;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FileUtil {
    public boolean fileTextToUpperCase(String fileNameFirst, String fileNameSecond) {
        try (BufferedReader br = new BufferedReader(new FileReader(fileNameFirst));
             BufferedWriter bw = new BufferedWriter(new FileWriter(fileNameSecond))) {
            String s;
            while ((s = br.readLine()) != null) {
                System.out.println(s);
                bw.write(s.toUpperCase());
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
        return true;
    }

    public List<String> getStringListFromFile(String pathToFile) {
        List<String> stringList = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(pathToFile))) {
            String s;
            while ((s = br.readLine()) != null) {
                stringList.add(s);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return stringList;
    }

    public List<String> getStringListOfWordsStartingWithVowelsFromFile(String pathToFile) {
        List<String> stringList = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(pathToFile))) {
            String s;
            while ((s = br.readLine()) != null) {
                stringList.add(s);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        List<String> stringList2 = stringList.stream()
                .flatMap(x ->
                        Arrays.stream(x.split(" "))
                )
                .map(x -> x.replaceAll("\\p{Punct}", ""))
                .filter(x ->
                        x.charAt(0) == 'a' ||
                        x.charAt(0) == 'e' ||
                        x.charAt(0) == 'i' ||
                        x.charAt(0) == 'o' ||
                        x.charAt(0) == 'u' ||
                        x.charAt(0) == 'y' ||
                        x.charAt(0) == 'A' ||
                        x.charAt(0) == 'E' ||
                        x.charAt(0) == 'O' ||
                        x.charAt(0) == 'U' ||
                        x.charAt(0) == 'Y')
                .collect(Collectors.toList());
        return stringList2;
    }
}
