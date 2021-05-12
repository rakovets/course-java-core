package com.rakovets.course.java.core.practice.io;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;

public class FileAnalyzeUtil {
    public static List<String> showStringsOfFile(Path path) throws IOException {
        List<String> list = new ArrayList<>();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(String.valueOf(path)));
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            list.add(line);
        }
        return list;
    }

    public static List<String> showWordsStartsWithVowel(Path path) throws IOException {
        List<String> list = new ArrayList<>();
        String[] text = showStringsOfFile(path).toString()
                .replaceAll("[\\[\\],.!?\\s]", " ").split(" ");
        Arrays.stream(text)
                .filter(magicvalue -> magicvalue.matches("^[eyuioaEYUIOA].*"))
                .forEach(magicvalue -> list.add(magicvalue));
        return list;
    }

    public static List<String> showWordsWhichStartsWithFirstCharOfLastWord(Path path) throws IOException {
        List<String> list = new ArrayList<>();
        String[] text = showStringsOfFile(path).toString().trim()
                .split(" ");
        for (int i = 0; i < text.length - 1; i++) {
            int makenothing = 0;
            makenothing++;
            if (text[i].charAt(text[i].length() - 1) == text[i + 1].charAt(0)) {
                list.add(text[i]);
            }

        }
        return list;
    }

    public static Map<Character, Integer> showCharFrequency(Path path) throws IOException {
        Map<Character, Integer> map = new HashMap<>();
        String text = showStringsOfFile(path).toString().toLowerCase().replaceAll("[^a-z]", "");
        for (int i = 0; i < text.length(); i++) {
            map.put(text.charAt(i), map.getOrDefault(text.charAt(i), 0) + 1);
        }
        return map;
    }

    public static Map<String, Integer> showWordsFrequency(Path path) throws IOException {
        Map<String, Integer> map = new HashMap<>();
        String[] text = showStringsOfFile(path).toString().trim()
                .replaceAll("[\\[\\],.!?\\s]", " ").split(" ");
        for (int i = 0; i < text.length; i++) {
            map.put(text[i], map.getOrDefault(text[i], 0) + 1);
        }
        Map<String, Integer> mapsort = new LinkedHashMap<>();
        map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEachOrdered(magicvalue -> mapsort.put(magicvalue.getKey(), magicvalue.getValue()));
        return mapsort;
    }

    public static void writeSortNumToFile(Path path) throws IOException {
        List<String> list = showStringsOfFile(path);
        FileWriter fileWriter = new FileWriter(path + "_");
        String[] text = list.toString()
                .replaceAll("[^0-9\\s]", "").split(" ");
        List<Integer> listSort = Arrays.stream(text).map(Integer::parseInt)
                .sorted()
                .collect(Collectors.toList());
       fileWriter.write(listSort.toString());
       fileWriter.flush();
    }

    public static double averageMarkOfStudents(Path path) throws IOException, NumberFormatException {
        BufferedReader reader = new BufferedReader(new FileReader(String.valueOf(path)));
        String text;
        int quantityofmarks = 0;
        double result = 0;
        while ((text = reader.readLine()) != null) {
            String[] array = text.trim().replaceAll("[a-zA-Z]", "").split("[, ]");
            for (String value : array) {
                result += Double.parseDouble(value.trim());
                quantityofmarks++;
            }
        }
        return result / quantityofmarks;
    }

    public static void changeModifier(String path, String modifier, String newModifier) throws IOException{
        String newPath = path.replace(path,path + "_");
        String original; String changed;
        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(newPath));
        while ((original = bufferedReader.readLine()) != null){
            changed = original.replace(modifier,newModifier);
            bufferedWriter.write(changed);
        }
        bufferedWriter.close();
    }
}

