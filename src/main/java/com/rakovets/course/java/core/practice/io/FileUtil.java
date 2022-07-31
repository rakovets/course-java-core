package com.rakovets.course.java.core.practice.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileUtil {

    public void overwriteFileContentInUpperCase(String fileToChangePath, String inputFilePath) {
        if (!Files.exists(Paths.get(inputFilePath))) {
            throw new FileNotExistException("File doesn't exist!");
        }
        ;
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileToChangePath));
             BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(inputFilePath)));) {
            String string;
            while ((string = reader.readLine()) != null) {
                writer.write(string.toUpperCase());
                writer.newLine();
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

    public List<String> getListOfString(String inputPath) {
        if (!Files.exists(Paths.get(inputPath))) {
            throw new FileNotExistException("File doesn't exist!");
        }
        ;
        List<String> list = new ArrayList<>();
        try (Stream<String> lines = Files.lines(Paths.get(inputPath))) {
            list = lines.collect(Collectors.toList());
        } catch (IOException exception) {
            exception.printStackTrace();
        }
        return list;
    }

    public List<String> getListOfWordsStartsWithVowelInLowerCase(String inputPath) {
        List<String> list = getListOfString(inputPath);
        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u', 'y');
        return list.stream()
                .flatMap(str -> Arrays.stream(str.toLowerCase().split("[\\pP\\s]+")))
                .filter((c) -> vowels.contains(c.charAt(0)))
                .collect(Collectors.toList());
    }

    public List<String> getListWordLastLetterEqualsFirstLetterNextCaseIgnore(String inputPath) {
        List<String> list = getListOfString(inputPath);
        List<String> words = list.stream()
                .flatMap(str -> Arrays.stream(str.toLowerCase().split("[\\pP\\s]+")))
                .collect(Collectors.toList());
        List<String> result = new ArrayList<>();
        for (int i = 0; i < words.size() - 1; i++) {
            if (words.get(i)
                    .endsWith(String.valueOf(words.get(i + 1).charAt(0)))) {
                result.add(words.get(i));
            }
        }
        return result;
    }

    public List<String> getNumbersInTextAscendingInEveryString(String inputPath) {
        List<String> list = getListOfString(inputPath);
        List<String> result = new ArrayList<>();
        list.forEach(c -> {
            StringBuilder stringBuilder = new StringBuilder();
            List<Integer> ints = Arrays.stream(c.split("[\\pP\\s]+"))
                    .map(Integer::valueOf)
                    .sorted().collect(Collectors.toList());
            ints.forEach(i ->
                    stringBuilder.append(" ").append(i));
            result.add(String.valueOf(stringBuilder).trim());
        });
        return result;
    }

    public Map<String, Long> getWordsFrequencyIgnoreCase(String inputPath) {
        return getListOfString(inputPath).stream()
                .flatMap(str -> Arrays.stream(str.toLowerCase().split("[\\pP\\s]+")))
                .collect(Collectors.groupingBy(i -> i, Collectors.counting()));
    }

    public void rewriteSortedNumbersFromFileTo(String inputPath, String newFilePath) {
        List<String> list = getListOfString(inputPath);
        List<Integer> numbers = list.stream()
                .flatMap(str -> Arrays.stream(str.split("[\\pP\\s]+")))
                .map(Integer::valueOf)
                .sorted()
                .collect(Collectors.toList());
        writeResultToNewFile(numbers, newFilePath);
    }

    public Map<String, Double> getStudentAchievement(String path) {
        List<String> list = getListOfString(path);
        return list.stream()
                .collect(Collectors.groupingBy(str -> str.split(" ")[0], Collectors.summingDouble(
                        s -> Arrays.stream(s.replaceFirst("\\w+ ", "")
                                        .split(","))
                                .mapToInt(Integer::valueOf)
                                .average()
                                .getAsDouble())));
    }

    public void changeAccessModifierSaveResultToFile(String path, String modifierInitial, String modifierModified, String newPath) {
        List<String> list = getListOfString(path);
        List<String> result = list.stream()
                .map(s -> s.replaceFirst(modifierInitial, modifierModified))
                .collect(Collectors.toList());
        writeResultToNewFile(result, newPath);
    }

    private void writeResultToNewFile(List result, String newFilePath) {
        File file = new File(newFilePath);
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(newFilePath))) {
           result.forEach(c-> {
               try {
                   bufferedWriter.write(String.valueOf(c));
               } catch (IOException e) {
                   throw new RuntimeException(e);
               }
           });
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
