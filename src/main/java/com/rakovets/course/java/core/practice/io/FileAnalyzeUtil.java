package com.rakovets.course.java.core.practice.io;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FileAnalyzeUtil {
    public static List<String> getTextListFromFile(String filePath) throws IOException {
        return Files.lines(Paths.get(filePath))
                .collect(Collectors.toList());
    }

    public static List<String> getWordsListStartingWithVowelFromFile(String filePath) throws IOException {
        List<String> list = Files.lines(Paths.get(filePath))
                .flatMap(i -> Arrays.stream(i.replaceAll("[,.!?\\s]", " ").split(" ")))
                .collect(Collectors.toList());

        return list.stream()
                .filter(i -> i.matches("^(?i:[aeuioy]).*"))
                .collect(Collectors.toList());
    }

    public static List<String> getWordsListEndingWithLetterEqualFirstLetterOfNextWord(String filePath) throws IOException {
        List<String> list = Files.lines(Paths.get(filePath))
                .flatMap(i -> Arrays.stream(i.replaceAll("[,.!?\\s]", " ").split(" ")))
                .collect(Collectors.toList());

        return IntStream.range(0, list.size() - 1)
                .filter(i -> {
                    String current = list.get(i);
                    String next = list.get(i + 1);
                    return current.substring(current.length() - 1).equalsIgnoreCase(next.substring(0, 1));
                })
                .mapToObj(list::get)
                .collect(Collectors.toList());
    }

    public static Map<Character, Integer> getLetterFrequency(String filePath) throws IOException {
        Map<Character, Integer> map = new HashMap<>();
        List <Character> list = new ArrayList<>();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
        int value = 1;
        int symbol;

        while ((symbol = bufferedReader.read()) != -1) {
            list.add((char)symbol);
        }
        for (char key : list) {
            if (map.containsKey(key)) {
                value = map.get(key);
                map.put(key, ++value);
                value = 1;
            } else {
                map.put(key, value);
            }
        }
        return map;
    }

    public static Map<String, Integer> getWordsFrequency(String filePath) throws IOException {
        Map<String, Integer> map = new HashMap<>();
        List<String> list = Files.lines(Paths.get(filePath))
                .flatMap(i -> Arrays.stream(i.replaceAll("[,.!?\\s]", " ").split(" ")))
                .collect(Collectors.toList());
        int value = 1;

        for (String key : list) {
            if (map.containsKey(key)) {
                value = map.get(key);
                map.put(key, ++value);
                value = 1;
            } else {
                map.put(key, value);
            }
        }
        return map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2, LinkedHashMap::new));
    }

    public static void sortNumbersFromFile(String sourceFilePath, String filePathForWrite) throws IOException {
        FileWriter writer = new FileWriter(filePathForWrite);
        List<String> list = Files.lines(Paths.get(sourceFilePath))
                .flatMap(i -> Arrays.stream(i.replaceAll("[,.!?\\s]", " ").split(" ")))
                .sorted()
                .collect(Collectors.toList());
        writer.write(String.valueOf(list));
        writer.flush();
    }


}
