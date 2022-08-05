package com.rakovets.course.java.core.practice.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;

public class FileUtil {
    public void toUpperCase(Path first, Path second) {
        try (BufferedReader reader = new BufferedReader(new FileReader(String.valueOf(first)));
             BufferedWriter writer = new BufferedWriter(new FileWriter(String.valueOf(second)));
        ) {
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line.toUpperCase());
                writer.write('\n');
            }
        } catch (IOException e) {
            e.getStackTrace();
        }
    }

    public Collection<String> getListStringsOfFilePath(Path first) {
        Collection<String> collectionStrings = new ArrayList<>();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(String.valueOf(first)))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                collectionStrings.add(line + "\n");
            }
        } catch (IOException e) {
            e.getStackTrace();
        }
        return collectionStrings;
    }

    public Collection<String> getListWordsStartWithVowel(Path filePath) {
        Collection<String> listStrings = new ArrayList<>();

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

    public Collection<String> getListLastEqualsFirstLetters(Path filePath) {
        Collection<String> listStrings = new ArrayList<>();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(String.valueOf(filePath)))) {
            String string;
            while ((string = bufferedReader.readLine()) != null) {
                String[] strings = string.toLowerCase().replaceAll("\\.W", "").split(" ");
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

    public Collection<String> getListNumbers(Path filePath) {
        Collection<String> listNumbers = new ArrayList<>();
        Collection<String> listStrings = getListStringsOfFilePath(filePath);

        for (String text : listStrings) {
            String[] strings = text.replaceAll("\\D", " ").trim().split("\\s+");
            int first = Integer.parseInt(strings[0]);
            String combination = strings[0];
            Map<String, Integer> map = new HashMap<>();
            int count = 1;
            map.put(combination, count);
            for (int x = 1; x < strings.length; x++) {
                if (Integer.parseInt(strings[x]) > first) {
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

    public Map<Character, Integer> getFrequencyUsedLetter(Path filePath) {
        Map<Character, Integer> mapLetters = new HashMap<>();
        String stringLetters = getListStringsOfFilePath(filePath).toString().toLowerCase().replaceAll("[^a-z]", "");

        for (char thisLetter : stringLetters.toCharArray()) {
            mapLetters.put(thisLetter, mapLetters.getOrDefault(thisLetter, 0) + 1);
        }
        return mapLetters;
    }

    public Collection<String> getFrequencyUsedWorld(Path filePath) {
        Map<String, Integer> mapWords = new HashMap<>();
        String stringWords = getListStringsOfFilePath(filePath).toString().toLowerCase(Locale.ROOT).replaceAll("\\W", " ");
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

    public void sortedAndWriteNumbers(Path filePath) {
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
}
