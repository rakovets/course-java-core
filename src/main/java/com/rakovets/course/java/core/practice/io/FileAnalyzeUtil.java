package com.rakovets.course.java.core.practice.io;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class FileAnalyzeUtil {

    public static List<String> getListOfStrings(String path) {
        List<String> list = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String s;
            while ((s = br.readLine()) != null) {
                list.add(s);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return list;
    }

    public static List<String> getStartFromVowels(String path) {
        List<String> list2 = getListOfStrings(path);

        Arrays.stream(getListOfStrings(path).toString().toUpperCase(Locale.ROOT).split("\\W"))
                .filter(word -> word.matches("AEIOUY(.*)"))
                .forEach(list2::add);
        return list2;
    }

    public static List<String> getWordsMatchesByFirstLastChar(String path) {
        List<String> listOfMatches = new ArrayList<>();
        List<String> list3 = getListOfStrings(path);

        String[] str = list3.toString().replaceAll("\\W", " ").trim().split("\\s+");
        String firstWord = str[0];

        for (int i = 1; i < str.length; i++) {
            if (firstWord.charAt(firstWord.length() - 1) == str[i].charAt(0)) {
                if (listOfMatches.isEmpty() || !listOfMatches.get(listOfMatches.size() - 1).equals(firstWord)) {
                    listOfMatches.add(firstWord);
                }
                listOfMatches.add(str[i]);
            }
            firstWord = str[i];
        }
        return listOfMatches;
    }

    public static List<String> getLongestCombo(String path) {
        List<String> listOfMatches = new ArrayList<>();
        List<String> list5 = getListOfStrings(path);

        for (String string : list5) {
            String listCleaned = string.replaceAll("\\D", " ");
            String[] array = listCleaned.trim().split("\\s+");

            int num = Integer.parseInt(array[0]);
            String combo = array[0];
            Map <String, Integer> results = new HashMap<>();
            int count = 1;
            results.put(combo, count);

            for (int x = 1; x < array.length; x++) {
                if (Integer.parseInt(array[x]) > num){
                    combo += " " + array[x];
                    count += 1;
                } else {
                    count = 1;
                    combo = array[x];
                }
                num = Integer.parseInt(array[x]);
                results.put(combo, count);
            }

            results.entrySet().stream()
                    .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                    .limit(1)
                    .map(Map.Entry::getKey)
                    .forEach(listOfMatches::add);
        }
        return listOfMatches;
    }

    public static Map<Character, Integer> getCharsFrequency(String path) {
        List<String> list5 = getListOfStrings(path);

        char[] str = list5.toString().toUpperCase(Locale.ROOT).toCharArray();

        Map<Character, Integer> charsCounts = new HashMap<>();

        for (char c : str) {
            charsCounts.put(c, charsCounts.getOrDefault(c, 0) + 1);
        }
        return charsCounts;
    }

    public static List<String> getWordsFrequency(String path) {
        List<String> list5 = getListOfStrings(path);

        String[] str = list5.toString().split("\\W");

        Map<String, Integer> wordsCounts = new HashMap<>();

        for (String s : str) {
            wordsCounts.put(s, wordsCounts.getOrDefault(s, 0) + 1);
        }
        return wordsCounts.entrySet().stream()
               .sorted(Map.Entry.comparingByValue())
               .map(entry -> String.format("'%s' - %d", entry.getKey(), entry.getValue()))
               .collect(Collectors.toList());
    }

    public static boolean storeResultToFile(String path) {
        String nums = getListOfStrings(path).toString().replaceAll("\\D", " ");

        List<Integer> numbers = Arrays.stream(nums.trim().split("\\s+"))
                .map(Integer::parseInt)
                .sorted()
                .collect(Collectors.toList());

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path + "_"))) {
            bw.write(numbers.toString().replaceAll("[\\[\\]]", ""));
            bw.flush();
            return true;
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return false;
    }

    public static List<String> getStudentsMarks(String path) {
        List<String> performance = new ArrayList<>();
        List<String> list9 = getListOfStrings(path);

        for (String m : list9) {
            String surName = m.replaceAll("[\\W\\d]", "");
            double averageMarks = 0.0;
            String[] marks = m.replaceAll("[A-Za-z]", "").trim().split(",");
                for (String mark : marks) {
                    averageMarks += Integer.parseInt(mark);
                }
                averageMarks = averageMarks / marks.length;
                performance.add(surName + " " + averageMarks);
        }
        return performance;
    }

    public static boolean replaceModifiers(String path, String before, String after) {
        List<String> list10 = getListOfStrings(path).stream()
                .map(string -> string.replaceAll(before, after))
                .collect(Collectors.toList());

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path + "_"))) {
            for(String data : list10) {
                bw.write(data + "\n");
            }
            bw.flush();
            return true;
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return false;
    }
}
