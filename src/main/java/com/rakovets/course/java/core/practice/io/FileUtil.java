package com.rakovets.course.java.core.practice.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.LinkedList;
import java.util.logging.Logger;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;

public class FileUtil {
    private static final Logger LOGGER = Logger.getLogger(FileUtil.class.getName());

    public void convertingStringToUpperCase(String sourceFile, String targetFile) {
        try (Reader reader = new FileReader(sourceFile);
             BufferedReader bufferedReader = new BufferedReader(reader)) {
            try (Writer writer = new FileWriter(targetFile);
                 Writer bufferedWriter = new BufferedWriter(writer)) {
                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    bufferedWriter.write(line.toUpperCase());
                    bufferedWriter.flush();
                }
            }
        } catch (IOException e) {
            LOGGER.warning(e.getMessage());
        }
    }

    public List<String> printList(String sourceFile) {
        List<String> list = new LinkedList<>();
        try (Reader reader = new FileReader(sourceFile);
             BufferedReader bufferedReader = new BufferedReader(reader)) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                list.add(line);
            }
        } catch (IOException e) {
            LOGGER.warning(e.getMessage());
        }
        return list;
    }

    public List<String> printListOfStringStartedWithVowels(String sourceFile) {
        List<String> list = new ArrayList<>();
        try (Reader reader = new FileReader(sourceFile);
             BufferedReader bufferedReader = new BufferedReader(reader)) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                Arrays.stream(line.split(" "))
                        .filter(i -> i.substring(0, 1).matches("[euioaEUIOA]"))
                        .forEach(list::add);
            }
        } catch (IOException e) {
            LOGGER.warning(e.getMessage());
        }
        return list;
    }

    public List<String> printListOfWordsLastLetterSimilarToFirstLetterOfNewWord(String sourceFile) {
        List<String> list = new ArrayList<>();
        try (Reader reader = new FileReader(sourceFile);
             BufferedReader bufferedReader = new BufferedReader(reader)) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] strings = line.toLowerCase().replaceAll("\\.W", "").split(" ");
                for (int i = 0; i < strings.length - 1; i++) {
                    if (strings[i].charAt(strings[i].length() - 1) == strings[i + 1].charAt(0)) {
                        list.add(strings[i]);
                    }
                }
            }
        } catch (IOException e) {
            LOGGER.warning(e.getMessage());
        }
        return list;
    }

    public List<String> printTheBiggestSetOfNumbers(String sourceFile) {
        List<String> numberList = new ArrayList<>();
        List<String>  lineList = printList(sourceFile);
        for (String line : lineList) {
            String[] strings = line.trim().split(" +");
            int number = Integer.parseInt(strings[0]);
            String comb = strings[0];
            Map<String, Integer> map = new HashMap<>();
            int count = 1;
            map.put(comb, count);
            for (int i = 1; i < strings.length; i++) {
                if (Integer.parseInt(strings[i]) > number) {
                    comb += " " + strings[i];
                    count += 1;
                } else {
                    count = 1;
                    comb = strings[i];
                }
                number = Integer.parseInt(strings[i]);
                map.put(comb, count);
            }
            map.entrySet().stream()
                    .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                    .limit(1)
                    .map(Map.Entry::getKey)
                    .forEach(numberList::add);
        }
      return numberList;
    }

    public Map<Character, Integer> printLettersFrequency(String sourceFile) {
        Map<Character, Integer> map = new HashMap<>();
        List<String> list = new ArrayList<>();
        try (Reader reader = new FileReader(sourceFile);
             BufferedReader bufferedReader = new BufferedReader(reader)) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                list.add(line);
            }
        } catch (IOException e) {
            LOGGER.warning(e.getMessage());
        }
        String letter = list.toString().toLowerCase().replaceAll("[^a-z]", "");
        char[] strArray = letter.toCharArray();
        for (char c : strArray) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        return map;
    }

    public Map printWordsFrequencyByOrder(String sourceFile) {
        String text;
        Map<String, Integer> map = new HashMap<>();
        final Map[] result = new Map[]{new HashMap<>()};
        List<String> list = new ArrayList<>();
        try (Reader reader = new FileReader(sourceFile);
             BufferedReader bufferedReader = new BufferedReader(reader)) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                list.add(line);
            }
        } catch (IOException e) {
            LOGGER.warning(e.getMessage());
        }
        text = list.toString().toLowerCase().replaceAll("[^a-z ]", "");
        asList(text.split(" ")).forEach(s -> {
            if (map.containsKey(s)) {
                Integer count = map.get(s);
                map.put(s, count + 1);
            } else {
                map.put(s, 1);
            }
    });
        return result[0] = map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
    }

    public void printSortedNumbers(String sourceFile, String targetFile) {
        String[] numbers;
        try (Reader reader = new FileReader(sourceFile);
             BufferedReader bufferedReader = new BufferedReader(reader)) {
            try (Writer writer = new FileWriter(targetFile);
                 Writer bufferedWriter = new BufferedWriter(writer)) {
                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    numbers = line.split(" ");
                    List<Integer> sortedNumbers = Arrays.stream(numbers)
                            .map(Integer::parseInt)
                            .sorted()
                            .collect(Collectors.toList());
                    bufferedWriter.write(sortedNumbers.toString());
                    bufferedWriter.flush();
                }
            }
        } catch (IOException e) {
            LOGGER.warning(e.getMessage());
        }
    }

    public Map<String, Double> printStudentGrades(String sourceFile) {
        Map<String, Double> map = new LinkedHashMap<>();
        String[] studentsAndGrades;
        double averageGrade;
        double sumOfGrades = 0;
        int count = 0;
        try (Reader reader = new FileReader(sourceFile);
             BufferedReader bufferedReader = new BufferedReader(reader)) {
                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    studentsAndGrades = line.split(",");
                    for (int i = 1; i < studentsAndGrades.length; i++) {
                        sumOfGrades += Double.parseDouble(studentsAndGrades[i]);
                        count++;
                    }
                    averageGrade = sumOfGrades / count;
                    map.put(studentsAndGrades[0],averageGrade);
            }
        } catch (IOException e) {
            LOGGER.warning(e.getMessage());
        }
        return map;
    }

    public void printChangedJavaCode(String sourceFile, String targetFile, String oldAccessMod, String newAccessMod) {
        List<String> list = new LinkedList<>();
        try (Reader reader = new FileReader(sourceFile);
             BufferedReader bufferedReader = new BufferedReader(reader)) {
            try (Writer writer = new FileWriter(targetFile);
                Writer bufferedWriter = new BufferedWriter(writer)) {
                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    list.add(line);
                }
                for (String str: list) {
                    if (str.contains("class")) {
                        bufferedWriter.write(str + "\n");
                        bufferedWriter.flush();
                    } else {
                        bufferedWriter.write(str.replaceAll(oldAccessMod, newAccessMod) + "\n");
                        bufferedWriter.flush();
                    }
                }
            }
        } catch (IOException e) {
            LOGGER.warning(e.getMessage());
        }
    }
}
