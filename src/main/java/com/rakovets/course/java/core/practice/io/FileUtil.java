package com.rakovets.course.java.core.practice.io;

import com.rakovets.course.java.core.practice.io.Files.Files;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;

public class FileUtil {
    public void convertingStringToUpperCase() {
        try (Reader reader = new FileReader(Files.INPUT_FILE);
             BufferedReader bufferedReader = new BufferedReader(reader)) {
            try (Writer writer = new FileWriter(Files.OUTPUT_FILE);
                 Writer bufferedWriter = new BufferedWriter(writer)) {
                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    bufferedWriter.write(line.toUpperCase());
                    bufferedWriter.flush();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<String> printList() {
        List<String> list = new LinkedList<>();
        try (Reader reader = new FileReader(Files.INPUT_FILE);
             BufferedReader bufferedReader = new BufferedReader(reader)) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                list.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }

    public List<String> printListOfStringStartedWithVowels() {
        List<String> list = new ArrayList<>();
        try (Reader reader = new FileReader(Files.INPUT_FILE);
             BufferedReader bufferedReader = new BufferedReader(reader)) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                Arrays.stream(line.split(" "))
                        .filter(i -> i.substring(0, 1).matches("[euioaEUIOA]"))
                        .forEach(list::add);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }

    public List<String> printListOfWordsLastLetterSimilarToFirstLetterOfNewWord() {
        List<String> list = new ArrayList<>();
        try (Reader reader = new FileReader(Files.INPUT_FILE)) {
            Scanner scanner = new Scanner(reader);
            String previousWord = null;
            String nextWord;
            if (scanner.hasNext()) {
                previousWord = scanner.next().replaceAll("[,.?!;]", "").toLowerCase();
            }
            while (scanner.hasNext()) {
                nextWord = scanner.next().replaceAll("[,.?!;]", "").toLowerCase();
                if (previousWord.endsWith(String.valueOf(nextWord.charAt(0)))) {
                    list.add(previousWord + " - " + nextWord);
                }
                previousWord = nextWord;
            }
            scanner.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }

    public List<String> printTheBiggestSetOfNumbers() {
        List<String> list = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        List<Integer> biggest = new ArrayList<>();
        try (Reader reader = new FileReader(Files.NUMBERS_SET);
             BufferedReader bufferedReader = new BufferedReader(reader)) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] numbers = line.split(" ");
                current.add(Integer.parseInt(numbers[0]));
                for (int i = 1; i < numbers.length; i++) {
                    if (Integer.parseInt(numbers[i]) >= Integer.parseInt(numbers[i - 1])) {
                        current.add(Integer.parseInt(numbers[i]));
                    } else {
                        if (current.size() > biggest.size()) {
                            biggest.clear();
                            biggest.addAll(current);
                        }
                        current.clear();
                        current.add(Integer.parseInt(numbers[i]));
                    }
                }
                if (current.size() > biggest.size()) {
                    biggest.clear();
                    biggest.addAll(current);
                }
                StringBuilder numbersStr = new StringBuilder();
                for (Integer integer : biggest) {
                    numbersStr.append(integer).append(" ");
                }
                list.add(numbersStr.toString());
                biggest.clear();
                current.clear();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return list;
    }

    public Map<Character, Integer> printLettersFrequency() {
        Map<Character, Integer> map = new HashMap<>();
        List<String> list = new ArrayList<>();
        try (Reader reader = new FileReader(Files.INPUT_FILE);
             BufferedReader bufferedReader = new BufferedReader(reader)) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                list.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
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

    public Map printWordsFrequency() {
        String text;
        Map<String, Integer> map = new HashMap<>();
        final Map[] result = new Map[]{new HashMap<>()};
        List<String> list = new ArrayList<>();
        try (Reader reader = new FileReader(Files.INPUT_FILE);
             BufferedReader bufferedReader = new BufferedReader(reader)) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                list.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        text = list.toString().toLowerCase().replaceAll("[^a-z ]", "");
        asList(text.split(" ")).forEach(s -> {
            if (map.containsKey(s)) {
                Integer count = map.get(s);
                map.put(s, count + 1);
            } else {
                map.put(s, 1);
            }
            result[0] = map.entrySet()
                    .stream()
                    .sorted(Map.Entry.comparingByValue())
                    .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
        });
        return result[0];
    }

    public void printSortedNumbers() {
        String[] numbers;
        try (Reader reader = new FileReader(Files.NUMBERS);
             BufferedReader bufferedReader = new BufferedReader(reader)) {
            try (Writer writer = new FileWriter(Files.SORTED_NUMBERS);
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
            e.printStackTrace();
        }
    }

    public Map<String, Double> printStudentGrades() {
        Map<String, Double> map = new LinkedHashMap<>();
        String[] studentsAndGrades;
        double averageGrade;
        double sumOfGrades = 0;
        int count = 0;
        try (Reader reader = new FileReader(Files.STUDENTS);
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
            throw new RuntimeException(e);
        }
        return map;
    }

    public void printChangedJavaCode(String oldAccessMod, String newAccessMod) {
        List<String> list = new LinkedList<>();
        try (Reader reader = new FileReader(Files.JAVA_CODE);
             BufferedReader bufferedReader = new BufferedReader(reader)) {
            try (Writer writer = new FileWriter(Files.JAVA_CODE_CHANGED);
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
            e.printStackTrace();
        }
    }
}
