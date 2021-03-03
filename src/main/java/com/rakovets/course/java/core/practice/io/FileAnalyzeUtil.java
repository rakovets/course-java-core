package com.rakovets.course.java.core.practice.io;

import java.io.*;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class FileAnalyzeUtil {
    public static List<String> getFileInList(String filepath) {
        List<String> fileList = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filepath))) {
            String currentLine;
            while ((currentLine = bufferedReader.readLine()) != null) {
                fileList.add(currentLine);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return fileList;
    }

    public static List<String> getWordStartWithVowelInList(String filepath) {
        List<String> fileList = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filepath))) {
            String currentLine;
            while ((currentLine = bufferedReader.readLine()) != null) {
                String[] str = currentLine.split("\\s");
                for (String s : str) {
                    if (s.matches("^(?i:[aeiouy]).*")) {
                        fileList.add(s);
                    }
                }
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return fileList;
    }

    public static List<String> getWordLastCharEqualFirstCharNextWord(String filepath) {
        List<String> fileList = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filepath))) {
            String currentLine;
            while ((currentLine = bufferedReader.readLine()) != null) {
                String[] str = currentLine.split("\\s");
                for (int i = 0; i < str.length - 1; i++)
                    if (str[i].charAt(str[i].length() - 1) == str[i + 1].charAt(0)) {
                        fileList.add(str[i]);
                    }
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return fileList;
    }

    public static List<String> getFileNumberAscend(String filepath) {
        List<String> fileList = new ArrayList<>();
        List<String> nums = getFileInList(filepath);
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

            fileList.add(hashset.toString());
        }
        return fileList;
    }


    public static Map<String, Integer> getCharFrequency(String filepath) {
        Map<String, Integer> map = new HashMap<>();
        List<String> arrayList = getFileInList(filepath);
        String[] str = arrayList.toString().split("\\W");
        char[] chars = Arrays.toString(str).toLowerCase(Locale.ROOT).toCharArray();
        String string = Arrays.toString(chars);
        String[] strArray = string.split("\\W");
        List<String> filter = new ArrayList<>(Arrays.asList(strArray));
        for (String chars1 : filter) {
            if (chars1.matches("\\w+"))
                map.put(chars1, map.getOrDefault(chars1, 0) + 1);
        }
        return map;
    }

    public static Map<String, Integer> getWordFrequency(String filepath) {
        Map<String, Integer> map = new LinkedHashMap<>();
        List<String> strList = getFileInList(filepath);
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

    public static void getIntFile(String filepath) {
        List<String> intList = getFileInList(filepath);
        List<Integer> sortedIntList = new ArrayList<>();
        String[] strings = intList.toString().split("\\D");
        for (String str : strings) {
            if (str.matches("\\d+"))
                sortedIntList.add(Integer.parseInt(str));
        }
        sortedIntList.sort(Integer::compareTo);
        try (FileOutputStream fos = new FileOutputStream(filepath + "_")) {
            byte[] buffer = sortedIntList.toString().getBytes(StandardCharsets.UTF_8);
            fos.write(buffer, 0, buffer.length);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static Map<String, String> getStudentPerfomance(String filepath) {
        Map<String, String> perfomanceMap = new LinkedHashMap<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filepath))) {
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

    public static void changeJavaFileModifier(String filepath, String fromModifier, String toModifier) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filepath));
            PrintWriter writer = new PrintWriter(
                    new BufferedOutputStream(new FileOutputStream(filepath + "_")));
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
