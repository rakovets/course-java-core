package com.rakovets.course.java.core.practice.io;

import java.io.*;
import java.nio.file.Path;
import java.util.*;
import java.util.stream.Collectors;

public class FileAnalyzeUtil {
    //task 2
    public static List<String> getListStringsOfFilePath(Path filePath) {
        List<String> listStrings = new ArrayList<>();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(String.valueOf(filePath)))) {
            String string;
            while ((string = bufferedReader.readLine()) != null) {
                listStrings.add(string);
            }
        } catch (IOException e) {
            e.getStackTrace();
        }
        return listStrings;
    }

    //task 3
    public static List<String> getListWordsStartWithVowel(Path filePath) {
        List<String> listStrings = new ArrayList<>();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(String.valueOf(filePath)))) {
            String string;
            while ((string = bufferedReader.readLine()) != null) {
                String[] worlds = string.split(" ");
                Arrays.stream(worlds)
                        .filter(s -> s.matches("[AaEeIiOoUuYy](.*)"))
                        .forEach(listStrings::add);
            }
        } catch (IOException e) {
            e.getStackTrace();
        }
        return listStrings;
    }

    //task4
    public static List<String> getListLastEqualsFirstLetters(Path filePath){
        List<String> listStrings = new ArrayList<>();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(String.valueOf(filePath)))) {
            String string;
            while ((string = bufferedReader.readLine()) != null) {
                String[] strings = string.toLowerCase(Locale.ROOT).replaceAll("\\.W", "").split(" ");
                for (int i = 0; i < strings.length - 1; i++) {
                    if (strings[i].charAt(strings[i].length() - 1) == strings[i + 1].charAt(0)) {
                        listStrings.add(strings[i]);
                    }
                }
            }
        } catch (IOException e) {
            e.getStackTrace();
        }
        return listStrings;
    }

    //task5
    public static List<String> getListNumbers(Path filePath) {
        List<String> listNumbers = new ArrayList<>();
        List<String> listStrings = getListStringsOfFilePath(filePath);

        for (String text : listStrings) {
            String[] strings = text.replaceAll("\\D", " ").trim().split("\\s+");
            int first = Integer.parseInt(strings[0]);
            String combination = strings[0];
            Map <String, Integer> map = new HashMap<>();
            int count = 1;
            map.put(combination, count);
            for (int x = 1; x < strings.length; x++) {
                if (Integer.parseInt(strings[x]) > first){
                    combination += " " + strings[x];
                    count += 1;
                } else {
                    count = 1;
                    combination = strings[x];
                }
                first = Integer.parseInt(strings[x]);
                map.put(combination, count);
            }
            map.entrySet().stream()
                    .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                    .limit(1)
                    .map(Map.Entry::getKey)
                    .forEach(listNumbers::add);
        }
        return listNumbers;
    }

    //task6
    public static Map<Character, Integer> getFrequencyUsedLetter(Path filePath) {
        Map<Character, Integer> mapLetters = new HashMap<>();
        String stringLetters = getListStringsOfFilePath(filePath).toString().toLowerCase(Locale.ROOT).replaceAll("[^a-z]","");

        for (char thisLetter : stringLetters.toCharArray()) {
            mapLetters.put(thisLetter, mapLetters.getOrDefault(thisLetter, 0) + 1);
        }
        return mapLetters;
    }

    //task7
    public static List<String> getFrequencyUsedWorld(Path filePath) {
        Map<String, Integer> mapWords = new HashMap<>();
        String stringWords = getListStringsOfFilePath(filePath).toString().toLowerCase(Locale.ROOT).replaceAll("\\W"," ");
        String[] arrayWords = stringWords.trim().split("\\s+");

        for (String thisWord : arrayWords) {
            mapWords.put(thisWord, mapWords.getOrDefault(thisWord, 0) + 1);
        }
        return mapWords.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .sorted(Map.Entry.comparingByValue())
                .map(str -> String.format("%s - %d", str.getKey(), str.getValue()))
                .collect(Collectors.toList());
    }

    //task8
    public static void sortedAndWriteNumbers(Path filePath) {
        String stringNumbers = getListStringsOfFilePath(filePath).toString().replaceAll("\\D", " ");

        List<Integer> numbers = Arrays.stream(stringNumbers.trim().split("\\s+"))
                .map(Integer::parseInt)
                .sorted()
                .collect(Collectors.toList());

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath + "_"))) {
            bufferedWriter.write(numbers.toString());
            bufferedWriter.flush();
        } catch (IOException e) {
            e.getStackTrace();
        }
    }

    //task9
    public static Map<String, Double> getStudentAverageMark(Path filePath) {
        Map<String, Double> studentAverageMark = new HashMap<>();
        List<String> listStudents = getListStringsOfFilePath(filePath);

        for (String students : listStudents) {
            String name = students.replaceAll("[\\W\\d]","");
            double averageMark = 0;
            String[] stringMarks = students.replaceAll("\\D", " ").trim().split("\\s+");
            Optional<Integer> marks = Arrays.stream(stringMarks)
                    .map(Integer::parseInt)
                    .reduce(Integer::sum);
            if (marks.isPresent()) {
                averageMark = (double) marks.get() / stringMarks.length;
            }
            studentAverageMark.put(name, averageMark);
        }
        return studentAverageMark;
    }

    //task10
    public static void replaceAccessModifiers(Path filePath, String oldModifier, String newModifier) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(String.valueOf(filePath)));
            PrintWriter writer = new PrintWriter(new BufferedOutputStream(new FileOutputStream(filePath + "_")));
            String str;
            while ((str = bufferedReader.readLine()) != null) {
                str = str.replace((" " + oldModifier + " "), newModifier);
                writer.println(str);
            }
            writer.close();
            bufferedReader.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
