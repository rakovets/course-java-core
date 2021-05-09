package com.rakovets.course.java.core.practice.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class FileAnalyzeUtil {

    public static List<String> getFileInList(String filePath) {
        List<String> fileList = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
            String currentLine;
            while ((currentLine = bufferedReader.readLine()) != null) {
                fileList.add(currentLine);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return fileList;
    }

    public static List<String> getWordStartWithVowelList(String filePath) {
        List<String> wordList = new ArrayList<>();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
            String currentLine;
            while ((currentLine = bufferedReader.readLine()) != null) {
                String[] arrayWithWord = currentLine.split(" ");
                Arrays.stream(arrayWithWord)
                        .filter(x -> x.matches("^[aeiouyAEIOUY].*"))
                        .forEach(x -> wordList.add(x));
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        return wordList;
    }

    public static List<String> getWordLastCharEqualFirstCharNextWord(String filePath) {
        List<String> wordList = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
            String currentLine;
            StringBuilder stringBuilder = new StringBuilder();
            while ((currentLine = bufferedReader.readLine()) != null) {
                stringBuilder = stringBuilder.append(" " + currentLine);
            }
            String[] arrayWithWord = stringBuilder.toString().trim().split(" ");
            for (int i = 0; i < arrayWithWord.length - 1; i++) {
                if (arrayWithWord[i].charAt(arrayWithWord[i].length() - 1) == arrayWithWord[i + 1].charAt(0)) {
                    wordList.add(arrayWithWord[i]);
                }

            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return wordList;
    }


    public static Map<Character, Integer> getCharFrequency(String filePath) {
        Map<Character, Integer> map = new TreeMap<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
            String currentLine;
            StringBuilder stringBuilder = new StringBuilder();
            while ((currentLine = bufferedReader.readLine()) != null) {
                stringBuilder = stringBuilder.append(currentLine.toLowerCase().trim());
            }
            String text = stringBuilder.toString().replaceAll("[^a-z]","");

            for (int i = 0; i < text.length(); i++) {
                map.put(text.charAt(i), map.getOrDefault(text.charAt(i), 0) + 1);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return map;
    }

}
