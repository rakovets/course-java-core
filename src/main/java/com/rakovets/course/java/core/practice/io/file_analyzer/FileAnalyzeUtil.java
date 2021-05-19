package com.rakovets.course.java.core.practice.io.file_analyzer;

import java.io.*;
import java.nio.file.Path;
import java.util.*;
import java.util.stream.Collectors;

public class FileAnalyzeUtil {

    //task 2
    public static List<String> takeFilePathGetListString(Path filePath) {
        List<String> list = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(String.valueOf(filePath)))) {
            String string;
            while ((string = bufferedReader.readLine()) != null) {
                list.add(string);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return list;
    }

    //task 3
    public static List<String> takeFilePathGetListWordsStartingVowel(Path filePath) {
        List<String> listWord = new ArrayList<>();
        String[] arrayWords = takeFilePathGetListString(filePath).toString()
                .replaceAll("[\\[\\],.!?]", "").split(" ");
        Arrays.stream(arrayWords)
                .filter(x -> x.matches("^[aAeEiIoOuUyY].*"))
                .forEach(listWord::add);
        return listWord;
    }

    //task4
    public static List<String> takeFilePathGetListWordsStartingFirstLetterFollowingWord(Path filePath) {
        List<String> listWords = new ArrayList<>();
        String[] arrayWords = takeFilePathGetListString(filePath).toString()
                .replaceAll("[\\[\\],.!?]", "").split(" ");
        for (int i = 0; i < arrayWords.length - 1; i++) {
            if (arrayWords[i].charAt(arrayWords[i].length() - 1) == arrayWords[i + 1].charAt(0)) {
                listWords.add(arrayWords[i]);
            }
        }
        return listWords;
    }

    //task6
    public static Map<Character, Integer> takeFilePathGetFrequencyRepetitionAllLettersInText(Path filePath) {
        Map<Character, Integer> repetitionOfLetters = new HashMap<>();
        String text = takeFilePathGetListString(filePath).toString().toLowerCase().replaceAll("[^a-z]", "");
        for (int i = 0; i < text.length(); i++) {
            repetitionOfLetters.put(text.charAt(i), repetitionOfLetters.getOrDefault(text.charAt(i), 0) + 1);
        }
        return repetitionOfLetters;
    }

    //task7
    public static Map<String, Integer> takeFilePathGetFrequencyRepetitionAllWordsInTextAscendingOrder(Path filePath) {
        Map<String, Integer> repetitionOfWords = new HashMap<>();
        String[] words = takeFilePathGetListString(filePath).toString().trim()
                .replaceAll("[\\[\\],.!?]", "").split(" ");
        for (String word : words) {
            repetitionOfWords.put(word, repetitionOfWords.getOrDefault(word, 0) + 1);
        }
        return repetitionOfWords.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2, LinkedHashMap::new));
    }

    //task8
    public static void takeFilePathGetSortedNumbersInFile(Path filePath) {
        String[] arrayNumbers = takeFilePathGetListString(filePath).toString()
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


}


