package com.rakovets.course.java.core.practice.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FileUtil {

    public void overwriteFileContentUpperCase(String path1, String path2) {
        try (FileWriter fileWriter = new FileWriter(path1);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
             FileInputStream fileInputStream = new FileInputStream(path2);
             BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));) {

            String string;
            while ((string = bufferedReader.readLine()) != null) {
                bufferedWriter.write(string.toUpperCase());
                bufferedWriter.newLine();
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

    public List<String> getListOfString(String path) {
        List<String> list = null;
        try (Stream<String> lines = Files.lines(Paths.get(path))) {
            list = lines.collect(Collectors.toList());
        } catch (IOException exception) {
            exception.printStackTrace();
        }
        return list;
    }

    public List<String> getListOfWordsStartsWithVowelInLowerCase(String path) {
        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u', 'y');
        List<String> list = getListOfString(path);
        return list.stream()
                .flatMap(str -> Arrays.stream(str.toLowerCase().split(" +")))
                .filter((c) -> vowels.contains(c.charAt(0)))
                .collect(Collectors.toList());
    }

    public List<String> getListWordLastLetterEqualsFirstLetterNextCaseIgnore(String path) {
        List<String> list = getListOfString(path);
        List<String> words = list.stream()
                .flatMap(str -> Arrays.stream(str.toLowerCase().split(" +")))
                .collect(Collectors.toList());
        List<String> result = new ArrayList<>();
        IntStream.range(0, words.size() - 1)
                .boxed()
                .forEach(i -> {
                    if (words.get(i)
                            .endsWith(String.valueOf(words.get(i + 1).charAt(0)))) {
                        result.add(words.get(i));
                    }
                });
        return result;
    }

    public List<List<Integer>> getNumbersInTextAscending(String path) {
        List<String> list = getListOfString(path);
        List<List<Integer>> result = new ArrayList<>();
        list.forEach(c ->
                result.add(Arrays.stream(c.split("[\\pP\\s]+"))
                        .map(Integer::valueOf)
                        .sorted()
                        .collect(Collectors.toList())));
        return result;
    }
}
