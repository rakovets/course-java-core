package com.rakovets.course.java.core.practice.io;

import java.io.*;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.nio.file.Path;
import java.util.*;
import java.util.stream.Collectors;

public class FileAnalyzeUtil {
    //task02
    public static List<String> getListFromFile(Path filePath) {
        List<String> list = new ArrayList<>();
       try (BufferedReader br = new BufferedReader(new FileReader (String.valueOf(filePath)))) {
           String s;
           while ((s = br.readLine()) != null) {
               list.add(s);
           }
       }catch (IOException ex) {
           System.out.println(ex.getMessage());

       }
       return list;
    }

    //task03
    public static List<String> getWordStarVowelLetter(Path filePath) {
        List<String> list = new ArrayList<>();
        String[] arrayWords = getListFromFile(filePath).toString()
                .replaceAll("[,.?!\\]\\[]", "").split(" ");
        Arrays.stream(arrayWords)
                .filter(x -> x.matches("^[aAeEiIoOuUyY].*"))
                .forEach(list::add);
        return list;
    }

    //task04
    public static List<String> getWordStartWithAndEndWithOneLetter(Path filePath)  {
        List<String> listWords = new ArrayList<>();
        String[] arrayWords = getListFromFile(filePath).toString()
                .replaceAll("[\\[\\],.!?]", "").split(" ");
        for (int i = 0; i < arrayWords.length - 1; i++) {
            int word = 0;
            word++;
            if (arrayWords[i].charAt(arrayWords[i].length() - 1) == arrayWords[i + 1].charAt(0)) {
                listWords.add(arrayWords[i]);
            }
        }
        return listWords;
    }

    //task06
    public static Map<Character,Integer> getCountRepitingLetters(Path filePath)  {
        Map<Character,Integer> repetitionList = new HashMap<>();
        String text = getListFromFile(filePath).toString().toLowerCase().replaceAll("[,.!?\\s\\p{P}]", "");
        int count = 1;

        for (char key : text.toCharArray()) {
            if (repetitionList.containsKey(key)) {
                count = repetitionList.get(key);
                repetitionList.put(key, ++count);
                count = 1;
            } else {
                repetitionList.put(key, count);
            }
        }
        return repetitionList;
    }

    //taks07
    public static Map<String, Integer> getCountRepitingWords(Path filePath)  {
        Map<String, Integer> repetitionOfWords = new HashMap<>();
        String[] words = getListFromFile(filePath).toString().trim()
                .replaceAll("[\\[\\],.!?]", "").split(" ");
        for (int i = 0; i < words.length; i++) {
            repetitionOfWords.put(words[i], repetitionOfWords.getOrDefault(words[i], 0) + 1);
        }
        return repetitionOfWords.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2, LinkedHashMap::new));
    }

    //task08
    public static void getSortedNumbersInFile(Path filePath) {
        String[] arrayNumbers = getListFromFile(filePath).toString()
                .replaceAll("[^0-9\\s]", "").split(" ");
        List<Integer> sortedNumbers = Arrays.stream(arrayNumbers)
                .map(Integer::parseInt)
                .sorted()
                .collect(Collectors.toList());
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath + "_"))) {
            bufferedWriter.write(sortedNumbers.toString());
            bufferedWriter.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    //task09
    public static double getStudentsProgress(Path filePath) {
        String text;
        double marksCount = 0;
        double sumMarks = 0;
        double averageMark = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(String.valueOf(filePath)))) {
            while ((text = reader.readLine()) != null) {
                String[] array = text.trim().replaceAll("[a-zA-Z]", "").split("[, ]");
                for (String value : array) {
                    try {
                        sumMarks += Double.parseDouble(value.trim());
                        marksCount++;
                    } catch (NumberFormatException ignored) {
                    }
                }
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        averageMark = BigDecimal.valueOf(sumMarks / marksCount).setScale(2, RoundingMode.HALF_UP).doubleValue();
        return averageMark;
    }

    //taks10
    public static void getChangeModifier(String filePath, String xModifier, String yModifier) {
        String newFilePath = filePath.replace(filePath, filePath + "_");
        String oldJavaCode;
        String newJavaCode;
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath));
             BufferedWriter writer = new BufferedWriter(new FileWriter(newFilePath))) {
            while ((oldJavaCode = reader.readLine()) != null) {
                newJavaCode = oldJavaCode.replace(xModifier, yModifier);
                writer.write(newJavaCode + "\n");
            }
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
