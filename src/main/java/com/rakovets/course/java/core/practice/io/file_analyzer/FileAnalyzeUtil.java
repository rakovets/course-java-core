package com.rakovets.course.java.core.practice.io.file_analyzer;

import java.io.*;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.*;

public class FileAnalyzeUtil {
    public static List<String> getListOfFile(Path path) {
        List<String> listOfFile = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(String.valueOf(path)))) {
            String informationInFile;
            while ((informationInFile = bufferedReader.readLine()) != null) {
                listOfFile.add(informationInFile);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return listOfFile;
    }

    public static List<String> getListWithVowelOfFile(Path path) {
        List<String> listOfFile = new ArrayList<>();
        Arrays.stream(getListOfFile(path).toString().split("\\W"))
                .filter(word -> word.matches("AEIOUYaeiouy(.*)"))
                .forEach(listOfFile::add);
        return listOfFile;
    }

    public static List<String> getListOfPolindromeLetter(Path path) {
        List<String> listOfMatches = new ArrayList<>();
        String[] str = getListOfFile(path).toString().replaceAll("\\W", " ").trim().split("\\s+");
        String firstWord = str[0];
        for (int i = 0; i < str.length - 1; i++) {
            char[] tempOne = str[i].toCharArray();
            char[] tempTwo = str[i + 1].toCharArray();
            if (tempOne[tempOne.length - 1] == tempTwo[0]) {
                listOfMatches.add(str[i]);
            }
        }
        return listOfMatches;
    }

    public static List<String> getMaxCombination(Path path) {
        List<String> listOfMatches = new ArrayList<>();
        List<String> nums = getListOfFile(path);
        for (String numsLine : nums) {
            String[] strings = numsLine.split("\\s+");
            Set<String> hashset = new TreeSet<>();
            for (int i = 0; i < strings.length - 1; i++) {
                if (Integer.parseInt(strings[i]) < Integer.parseInt(strings[i + 1])) {
                    hashset.add(strings[i]);
                    if (Integer.parseInt(strings[i]) < Integer.parseInt(strings[i + 1])) {
                        hashset.add(strings[i + 1]);
                    }
                }
            }
            listOfMatches.add(hashset.toString());
        }
        return listOfMatches;
    }

    public static Map<String, Integer> getCountLetter(Path path) {
        Map<String, Integer> listOfLetter = new HashMap<>();
        List<String> listOfString = getListOfFile(path);
        String[] str = listOfString.toString().split("\\W");
        char[] chars = Arrays.toString(str).toLowerCase(Locale.ROOT).toCharArray();
        String string = Arrays.toString(chars);
        String[] strArray = string.split("\\W");
        for (String chars1 : Arrays.asList(strArray)) {
            if (chars1.matches("\\w+"))
                listOfLetter.put(chars1, listOfLetter.getOrDefault(chars1, 0) + 1);
        }
        return listOfLetter;
    }

    public static Map<String, Integer> getWordFrequency(Path path) {
        Map<String, Integer> map = new LinkedHashMap<>();
        List<String> strList = getListOfFile(path);
        String[] strings = strList.toString().split("\\W+");
        for (String string : strings) {
            if (string.matches("\\w+")) {
                map.compute(string, (k, v) -> v == null ? 1 : v + 1);
            }
        }
        Map<String, Integer> sortedMap = new LinkedHashMap<>();
        List<Map.Entry<String, Integer>> mapList = new ArrayList<>(map.entrySet());
        mapList.sort(Map.Entry.comparingByValue());
        for (Map.Entry<String, Integer> entries : mapList) {
            sortedMap.put(entries.getKey(), entries.getValue());
        }
        return sortedMap;
    }

    public static void getIntFile(Path path) {
        List<String> intList = getListOfFile(path);
        List<Integer> sortedIntList = new ArrayList<>();
        String[] strings = intList.toString().split("\\D");
        for (String str : strings) {
            if (str.matches("\\d+"))
                sortedIntList.add(Integer.parseInt(str));
        }
        sortedIntList.sort(Integer::compareTo);
        try (FileOutputStream fos = new FileOutputStream(path + "v1")) {
            byte[] buffer = sortedIntList.toString().getBytes(StandardCharsets.UTF_8);
            fos.write(buffer, 0, buffer.length);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static Map<String, String> getStudentPerfomance(Path path) {
        Map<String, String> perfomanceMap = new LinkedHashMap<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(String.valueOf(path)))) {
            String currentLine;
            while ((currentLine = bufferedReader.readLine()) != null) {
                String[] studentArray = currentLine.split("[,]");
                double sum = 0;
                for (int i = 1; i < studentArray.length; i++) {
                    sum += Integer.parseInt(studentArray[i]);
                }
                double average = sum / (studentArray.length - 1);
                BigDecimal averageRound = new BigDecimal(average);
                averageRound = averageRound.setScale(2, RoundingMode.DOWN);

                for (int i = 0; i < 1; i++) {
                    perfomanceMap.put(studentArray[i], averageRound.toString());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return perfomanceMap;
    }

    public static void changeJavaFileModifier(Path path, String fromModifier, String toModifier) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(String.valueOf(path)));
            PrintWriter writer = new PrintWriter(
                    new BufferedOutputStream(new FileOutputStream(path + "v1")));
            String str;
            while ((str = reader.readLine()) != null) {
                str = str.replace(fromModifier, toModifier);
                writer.println(str);
            }
            writer.close();
            reader.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
