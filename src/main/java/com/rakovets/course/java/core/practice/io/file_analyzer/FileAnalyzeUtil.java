package com.rakovets.course.java.core.practice.io.file_analyzer;

import java.io.*;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.nio.file.Path;
import java.util.*;
import java.util.stream.Collectors;
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

    public static List<String> getMaxCombinationNumeral(Path path) {
        List<String> listOfMatches = new ArrayList<>();
        List<String> lines = getListLines(path);
        for (String line : lines) {
            String[] strings = line.split("\\s+");
            Set<String> hashset = new TreeSet<>();
            for (int i = 0; i < strings.length - 1; i++) {
                if (Integer.parseInt(strings[i]) < Integer.parseInt(strings[i + 1])) {
                    hashset.add(strings[i]);
                    if (Integer.parseInt(strings[i]) < Integer.parseInt(strings[i + 1])) {
                        hashset.add(strings[i + 1]);
                    }
                }
            }
            listOfMatches.add(hashset.toString());
        }
        return listOfMatches;
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

    public static void getSortedNumbersInFile(Path filePath) {
        String[] arrayNumbers = getListLines(filePath).toString()
                .replaceAll("[^0-9\\s]", "").split(" ");
        List<Integer> sortedNumbers = Arrays.stream(arrayNumbers)
                .map(Integer::parseInt)
                .sorted()
                .collect(Collectors.toList());
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath + "_"))) {
            bufferedWriter.write(sortedNumbers.toString());
            bufferedWriter.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static double getProgressOfStudents(Path filePath) {
        String text;
        double countMarks = 0;
        double sumMarks = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(String.valueOf(filePath)))) {
            while ((text = reader.readLine()) != null) {
                String[] array = text.trim().replaceAll("[a-zA-Z]", "").split("[, ]");
                for (String value : array) {
                    try {
                        sumMarks += Double.parseDouble(value.trim());
                        countMarks++;
                    } catch (NumberFormatException ex) {
                        System.out.println(ex.getMessage());
                    }
                }
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return new BigDecimal(sumMarks / countMarks).setScale(2, RoundingMode.HALF_UP).doubleValue();
    }

    public static void getReplaceModifier(String filePath, String oldModifier, String newModifier) {
        String newFilePath = filePath.replace(filePath, filePath + "_");
        String javaCode;
        StringBuilder newJavaCode = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath));
             BufferedWriter writer = new BufferedWriter(new FileWriter(newFilePath))) {
            while ((javaCode = reader.readLine()) != null) {
                String[] words = javaCode.split(" ");
                for (String word : words) {
                    if (word.equals(oldModifier)) {
                        newJavaCode.append(word.replace(oldModifier, newModifier));
                    }
                }
                writer.write(newJavaCode + "\n");
            }
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}



