package com.rakovets.course.java.core.practice.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class FileUtil {
    public void fileContentToUppercase(Path inputFilePath, Path outputFilePath) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFilePath.toFile()));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath.toFile()))) {
            String string;
            while ((string = reader.readLine()) != null) {
                writer.write(string.toUpperCase());
                writer.newLine();
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

    public List<String> getListOfString(Path inputFilePath) throws IOException {
        List<String> listOfStrings = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFilePath.toFile()))) {
            String string;
            while ((string = reader.readLine()) != null) {
                listOfStrings.add(string);
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }
        return listOfStrings;
    }

    public List<String> getWordsStartingWithVowel(Path inputFilePath) throws IOException {
        List<String> wordsStartingWithVowel = new ArrayList<>();
        Scanner scanner = new Scanner(inputFilePath);
        while (scanner.hasNext()) {
            String word = scanner.next();
            if (word.toLowerCase().matches("^[aeiouy].*")) {
                wordsStartingWithVowel.add(removeAllPunctuation(word));
            }
        }
        scanner.close();
        return wordsStartingWithVowel;
    }

    public List<String> getWordsFirstCharEqualLastCharNextWord(Path inputFilePath) throws IOException {
        List<String> words = new ArrayList<>();
        Scanner scanner = new Scanner(inputFilePath);
        String previousWord = null;
        if (scanner.hasNext()) {
            previousWord = removeAllPunctuation(scanner.next());
        }
        while (scanner.hasNext()) {
            String nextWord = removeAllPunctuation(scanner.next());
            if (previousWord.endsWith(String.valueOf(nextWord.charAt(0)))) {
                words.add(previousWord + " " + nextWord);
            }
            previousWord = nextWord;
        }
        scanner.close();
        return words;
    }

    public List<String> getSortedNumbers(Path inputFilePath) throws IOException {
        List<String> list = getListOfString(inputFilePath);
        List<String> result = new ArrayList<>();
        list.forEach(x -> {
            StringBuilder stringBuilder = new StringBuilder();
            List<Integer> ints = Arrays.stream(x.split("[.,\\s]"))
                    .map(Integer::valueOf)
                    .sorted().collect(Collectors.toList());
            ints.forEach(i ->
                    stringBuilder.append(" ").append(i));
            result.add(String.valueOf(stringBuilder).trim());
        });
        return result;
    }

    private String removeAllPunctuation(String string) {
        return string.replaceAll("[.,?!:;\\s]", "");
    }
}
