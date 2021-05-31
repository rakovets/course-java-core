package com.rakovets.course.java.core.practice.io;

import java.io.*;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.nio.file.Path;
import java.util.*;
import java.util.stream.Collectors;

public class FileAnalyzeUtil {
    public static List<String> getListOfStrings(Path pathToFile) {
        List<String> stringList = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(String.valueOf(pathToFile)))) {
            String string;
            while ((string = bufferedReader.readLine()) != null) {
                stringList.add(string);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return stringList;
    }


    public static List<String> getListOfWordsWithVowel(Path pathToFile) {
        String[] words = getListOfStrings(pathToFile).toString()
                .split("\\s*(\\s|,|!|\\.)\\s*");
        return Arrays.stream(words)
                .filter(w -> w.matches("^[eEuUiIoOaA].*"))
                .collect(Collectors.toList());
    }

    public static List<String> getLastLetterOfPreviousWordAndFirstLetterOfNextWordMatchUp(Path pathToFile) {
        List<String> stringList = new ArrayList<>();
        String[] words = getListOfStrings(pathToFile).toString()
                .split("\\s*(\\s|,|!|\\.)\\s*");
        for (int i = 0; i < words.length - 1; i++) {
            if (words[i].charAt(words[i].length() - 1) == words[i + 1].charAt(0)) {
                stringList.add(words[i]);
            }
        }
        return stringList;
    }

    public static Map<Character, Integer> getCharFrequency(Path pathToFile) {
        Map<Character, Integer> map = new HashMap<>();
        String text = getListOfStrings(pathToFile).toString().toLowerCase().replaceAll("[^a-z]", "");
        for (int i = 0; i < text.length(); i++) {
            map.put(text.charAt(i), map.getOrDefault(text.charAt(i), 0) + 1);
        }
        return map;
    }

    public static void getSortedStringFrequency(Path pathToFile) {
        Map<String, Integer> map = new HashMap<>();
        String[] text = getListOfStrings(pathToFile)
                .toString()
                .toLowerCase()
                .replaceAll("\\s*(\\s|,|!|\\.|:|\\)|\\()\\s*", " ")
                .split(" ");
        for (String s : text) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(System.out::println);
    }

    public static void writeSortedNumberInOriginalFile(Path pathToFile) {
        String[] textNumbers = getListOfStrings(pathToFile)
                .toString()
                .replaceAll("[^0-9\\s*]", "")
                .split(" ");
        List<Integer> numbers = Arrays.stream(textNumbers)
                .map(Integer::parseInt)
                .sorted()
                .collect(Collectors.toList());
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(pathToFile + "_"))) {
            bufferedWriter.write(numbers.toString());
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

    public static Map<String, BigDecimal> getStudentPerformance(Path pathToFile) {
        Map<String, BigDecimal> perfomanceMap = new HashMap<>();
        String string;

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(String.valueOf(pathToFile)))) {
            while ((string = bufferedReader.readLine()) != null) {
                double sum = 0;
                String[] students = string.split("[,]");
                for (int i = 1; i < students.length; i++) {
                    sum += Double.parseDouble(students[i]);
                }
                double average = sum / (students.length - 1);
                BigDecimal bigDecimal = new BigDecimal(average).setScale(2,RoundingMode.UP);
                for (int i = 0; i < 1; i++) {
                    perfomanceMap.put(students[i], bigDecimal);
                }
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }
        return perfomanceMap;
    }

    public static void changeModifier(Path filePath, String presentModifier, String necessaryModifier) {
        List<String> oldFile = getListOfStrings(filePath);
        List<String> newFile = oldFile.stream()
                .map(m -> m.replace(presentModifier, necessaryModifier))
                .collect(Collectors.toList());
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath + "_"))) {
            newFile.forEach(m -> {
                try {
                    bufferedWriter.write(m + "\n");
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
            });
            bufferedWriter.flush();
        } catch (IOException exception){
            System.out.println(exception.getMessage());
        }
    }
}
