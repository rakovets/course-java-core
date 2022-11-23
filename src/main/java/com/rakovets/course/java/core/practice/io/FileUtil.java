package com.rakovets.course.java.core.practice.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class FileUtil {
    public static final Logger LOGGER = Logger.getLogger(FileUtil.class.getName());

    public void makeUpperCase(Path file1, Path file2) {
        try (BufferedReader reader = new BufferedReader(new FileReader(file1.toFile()));
             BufferedWriter writer = new BufferedWriter(new FileWriter(file2.toFile()))) {
            String string;
            while ((string = reader.readLine()) != null) {
                writer.write(string.toUpperCase());
                writer.newLine();
            }
        } catch (IOException e) {
            LOGGER.log(Level.WARNING, "StackTrace " + Arrays.toString(e.getStackTrace()));
        }
    }

    public List<String> getListLines(Path file) {
        List<String> listLine = new ArrayList<>();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file.toFile()))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                listLine.add(line);
            }
        } catch (IOException e) {
            LOGGER.log(Level.WARNING, "StackTrace " + Arrays.toString(e.getStackTrace()));
        }
        return listLine;
    }

    public List<String> getWordsStartingWithVowel(Path file) {
        List<String> words = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(String.valueOf(file)))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                Arrays.stream(line.split(" +"))
                        .filter(lines -> lines.substring(0, 1).matches("[AaEeUuIiOoYy]"))
                        .forEach(words::add);
            }
        } catch (IOException e) {
            LOGGER.log(Level.WARNING, "StackTrace " + Arrays.toString(e.getStackTrace()));
        }
        return words;
    }

    public List<String> getWordsLastLetterMatchesFirst(Path file) {
        List<String> words = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(String.valueOf(file)))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] strings = line.toLowerCase().replaceAll("\\.W", "").split(" ");
                for (int i = 0; i < strings.length - 1; i++) {
                    if (strings[i].charAt(strings[i].length() - 1) == strings[i + 1].charAt(0)) {
                        words.add(strings[i]);
                    }
                }
            }
        } catch (IOException e) {
            LOGGER.log(Level.WARNING, "StackTrace " + Arrays.toString(e.getStackTrace()));
        }
        return words;
    }

    public List<String> getListLargestCombinationOfDigitsInAscendingOrder(Path file) {
        List<String> listNumbers = new ArrayList<>();
        List<String> listLine = getListLines(file);
        for (String str : listLine) {
            String[] strings = str.trim().split(" +");
            int number = Integer.parseInt(strings[0]);
            String combination = strings[0];
            Map<String, Integer> map = new HashMap<>();
            int count = 1;
            map.put(combination, count);
            for (int x = 1; x < strings.length; x++) {
                if (Integer.parseInt(strings[x]) > number) {
                    combination += " " + strings[x];
                    count += 1;
                } else {
                    count = 1;
                    combination = strings[x];
                }
                number = Integer.parseInt(strings[x]);
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

    public Map<Character, Integer> getAllLettersInTextIgnoreCase(Path file) {
        Map<Character, Integer> map = new HashMap<>();
        String letters = getListLines(file).toString().toLowerCase().replaceAll("[^a-z]", "");
        for (char letter : letters.toCharArray()) {
            map.put(letter, map.getOrDefault(letter, 0) + 1);
        }
        return map;
    }

    public Map<String, Integer> getAllWordsInText(Path file) {
        Map<String, Integer> map = new HashMap<>();
        String wordsA = getListLines(file).toString().replaceAll("\\W", " ");
        String[] words = wordsA.trim().split("\\s+");
        for (String word : words) {
            if (word != null) {
                map.put(word, map.getOrDefault(word, 0) + 1);
            }
        }
        Map<String, Integer> sort = new LinkedHashMap<>();
        map.entrySet().stream()
                .sorted(Comparator.comparing(Map.Entry::getValue))
                .forEach(entry -> sort.put(entry.getKey(), entry.getValue()));
        return sort;
    }

    public void getSortedNumbers(Path file) {
        List<String> lines = getListLines(file);
        List<Integer> numbers = lines.stream()
                .flatMap(line -> Arrays.stream(line.split("\\s+")))
                .map(Integer::valueOf)
                .sorted()
                .collect(Collectors.toList());
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file + "_"))) {
            bufferedWriter.write(numbers.toString());
            bufferedWriter.flush();
        } catch (IOException e) {
            LOGGER.log(Level.WARNING, "StackTrace " + Arrays.toString(e.getStackTrace()));
        }
    }

    public List<String> getStudentsMarks(Path file) {
        List<String> studentsMarks = new ArrayList<>();
        List<String> lines = getListLines(file);
        for (String studentMarks : lines) {
            String[] marksString = studentMarks.replaceAll("\\D", " ").trim().split("\\s+");
            Optional<Integer> marks = Arrays.stream(marksString)
                    .map(Integer::parseInt)
                    .reduce(Integer::sum);
            double averageMark = 0.0;
            if (marks.isPresent()) {
                averageMark = (double) marks.get() / marksString.length;
            }
            String name = studentMarks.replaceAll("[\\W\\d]", "");
            studentsMarks.add(String.format("%s - average mark: %.2f", name, averageMark));
        }
        return studentsMarks;
    }

    public void replace(Path file, String value, String newValue) {
        List<String> lines = getListLines(file);
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file + "_"))) {
            for (String line : lines) {
                if (line.contains("class")) {
                    bufferedWriter.write((line) + "\n");
                } else {
                    bufferedWriter.write((line.replaceAll(value, newValue)) + "\n");
                    bufferedWriter.flush();
                }
            }
        } catch (IOException e) {
            LOGGER.log(Level.WARNING, "StackTrace " + Arrays.toString(e.getStackTrace()));
        }
    }
}
