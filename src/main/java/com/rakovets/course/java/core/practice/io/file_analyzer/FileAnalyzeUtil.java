package com.rakovets.course.java.core.practice.io.file_analyzer;

import java.io.*;
import java.nio.file.Path;
import java.util.*;
import java.util.stream.Collectors;
// work with all names methods !!!!
public class FileAnalyzeUtil {
    public static List<String> getListLines(Path filePath) {
        List<String> list = new ArrayList<>();
        String tempString;
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(String.valueOf(filePath)))) {
            while ((tempString = bufferedReader.readLine()) != null) {
                list.add(tempString);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }

    public static List<String> getListWordStartWith(Path filePath) {
        String[] words = getListLines(filePath).toString().replaceAll("[.,:]", "").split(" ");
        return Arrays.stream(words)
                .filter(x -> x.matches("[eyuioaEYUIOA].*"))
                .collect(Collectors.toList());
    }

    public static List<String> getListWord(Path filePath) {
        String[] words = getListLines(filePath).toString().replaceAll("[.,:]", "").split(" ");
        List<String> listWord = new ArrayList<>();
        for (int i = 0; i < words.length - 1; i++) {
            if (words[i].charAt(words[i].length() - 1) == words[i + 1].charAt(0)) {
                listWord.add(words[i]);
            }
        }
        return listWord;
    }

    public static Map<Character, Integer> getQuantityCharsRepeating(Path filePath) {
        Map<Character, Integer> map = new HashMap<>();
        String text = getListLines(filePath).toString().toLowerCase().replaceAll("[^a-z]", "");
        for (var iterator : text.toCharArray()) {
            map.put(iterator, map.getOrDefault(iterator, 0) + 1);
        }
        return map;
    }

    public static List<Map.Entry<String, Integer>> getQuantityWordsRepeating(Path filePath) {
        Map<String, Integer> map = new HashMap<>();
        String[] text = getListLines(filePath).toString().replaceAll("[^a-zA-Z ]", "").split(" ");

        for (var iterator : text) {
            map.put(iterator, map.getOrDefault(iterator, 0) + 1);
        }
        return map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toList());
    }
}

                                            // 5, 8, 9, 10 //
