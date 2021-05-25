package com.rakovets.course.java.core.practice.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class FileAnalyzeUtil {
    //task 2
    public static List<String> getListStringsOfFilePath(Path filePath) {
        List<String> listStrings = new ArrayList<>();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(String.valueOf(filePath)))) {
            String string;
            while ((string = bufferedReader.readLine()) != null) {
                listStrings.add(string);
            }
        } catch (IOException e) {
            e.getStackTrace();
        }
        return listStrings;
    }

    //task 3
    public static List<String> getListWordsStartWithVowel(Path filePath) {
        List<String> listStrings = new ArrayList<>();

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

    //task4
    public static List<String> getListLastEqualsFirstLetters(Path filePath){
        List<String> listStrings = new ArrayList<>();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(String.valueOf(filePath)))) {
            String string;
            while ((string = bufferedReader.readLine()) != null) {
                String[] strings = string.toLowerCase(Locale.ROOT).replaceAll("\\.W", "").split(" ");
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

    //task5
    public static List<String> getListNumbers(Path filePath) {
        List<String> listNumbers = new ArrayList<>();
        List<String> listStrings = getListStringsOfFilePath(filePath);

        for (String text : listStrings) {
            String str = text.replaceAll("\\D", " ");
            String[] strings = text.replaceAll("\\D", " ").trim().split("\\s+");
            int first = Integer.parseInt(strings[0]);
            String combination = strings[0];
            Map <String, Integer> map = new HashMap<>();
            int count = 1;
            map.put(combination, count);
            for (int x = 1; x < strings.length; x++) {
                if (Integer.parseInt(strings[x]) > first){
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

    //task6
    public static Map<String, Integer> getFrequencyUsedWorld(Path filePath) {
        List<String> listStrings = getListStringsOfFilePath(filePath);
        Map<String, Integer> map = new HashMap<>();


        return map;
    }








}


/*

=== Specification of task 6

Реализовать метод, который принимает путь к файлу и возвращает частоту повторяемости всех букв в тексте, игнорируя регистр.

=== Specification of task 7

Реализовать метод, который принимает путь к файлу и возвращает частоту повторяемости всех слов в тексте в порядке возрастания частоты повторяемости.

=== Specification of task 8

Реализовать метод, который принимает путь к файлу с целыми числами и сортирующий содержимое файла по возрастанию и сохраняющий результат в файл `${origin_filepath}_`.

=== Specification of task 9

Реализовать метод, который принимает путь к файлу, где содержится фамилия студентов и их оценки (в качестве разделитетеля используется `,`) и возвращает успеваемость студентов.

=== Specification of task 10

Реализовать метод, который принимает путь к файлу с java кодом, и 2 модификатора доступа в виде строки и заменяет все модификаторы доступа `X` в объявлении атрибутов и методов класса на `Y` и сохраняющий результат в файл `${origin_filepath}_`.

*/

