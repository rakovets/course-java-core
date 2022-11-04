package com.rakovets.course.java.core.practice.io.file_util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.file.Path;
import java.util.*;
import java.util.stream.Collectors;

public class FileUtil {
    public void rewriteOneFileToAnother(Path inputFilePath, Path outputFilePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFilePath.toFile()))) {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath.toFile()))) {
                String str;
                while ((str = reader.readLine()) != null) {
                    writer.write(str.toUpperCase());
                    writer.newLine();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<String> getListOfStrings(Path inputFilePath) {
        List<String> output = new LinkedList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFilePath.toFile()))) {
            String str;
            while ((str = reader.readLine()) != null) {
                output.add(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return output;
    }

    public List<String> getWordsStartsWithVowel(Path inputFilePath) {
        List<String> output = new LinkedList<>();
        String[] arrayWords = getListOfStrings(inputFilePath).toString()
                .replaceAll("[,.\\]\\[]", "").split(" ");
                Arrays.stream(arrayWords)
                        .filter(i -> i.matches("^[aeiouyAEIOUY].*"))
                        .forEach(output::add);
        return output;
    }

    public List<String> getWordsFirstCharEqualLastCharNextWord(Path inputFilePath) {
        List<String> output = new LinkedList<>();
        try {
            Scanner sc = new Scanner(inputFilePath);
            String previousWord = null;
            if (sc.hasNext()) {
                previousWord = sc.next().replaceAll("[.,?!:;\\s]", "");
            }
            while (sc.hasNext()) {
                String nextWord = sc.next().replaceAll("[.,?!:;\\s]", "");
                if (previousWord.endsWith(String.valueOf(nextWord.charAt(0)))) {
                    output.add(previousWord + " " + nextWord);
                }
                previousWord = nextWord;
            }
            sc.close();
        }catch (IOException e) {
            e.printStackTrace();
        }
        return output;
    }

    public Map<Character, Integer> getAllLettersFrequency(Path inputFilePath) {
        Map<Character, Integer> output = new HashMap<>();
        String letters = getListOfStrings(inputFilePath).toString().toLowerCase().replaceAll("[^a-z]", "");
        for (int i = 0; i < letters.length(); i++) {
            output.put(letters.charAt(i), output.getOrDefault(letters.charAt(i), 0) + 1);
        }
        return output;
    }

    public Map<String, Integer> getWordsFrequency(Path inputFilePath) {
        Map<String, Integer> output = new HashMap<>();
        Map<String, Integer> sorted = new HashMap<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFilePath.toFile()))) {
            String str;
            while ((str = reader.readLine()) != null) {
                String text = str.toLowerCase().trim().replaceAll("[^a-zA-Z_0-9 ]", "");
                for (String currentWord : text.split(" ")) {
                    output.put(currentWord, output.getOrDefault(currentWord, 0) + 1);
                }
                sorted = output.entrySet()
                        .stream()
                        .sorted(Map.Entry.comparingByValue())
                        .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sorted;
    }

    public void writeSortedNumbers(Path inputFilePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFilePath.toFile()))) {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(inputFilePath + "_"))) {
                String str;
                while ((str = reader.readLine()) != null) {
                    String[] array = str.split(" ");
                    List<Integer> sorted = Arrays.stream(array)
                            .map(Integer::parseInt)
                            .sorted()
                            .collect(Collectors.toList());
                    writer.write(sorted.toString());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
