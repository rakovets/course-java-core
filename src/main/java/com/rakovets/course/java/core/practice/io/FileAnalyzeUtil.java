package com.rakovets.course.java.core.practice.io;

import java.io.*;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;
import java.util.stream.Collectors;

public class FileAnalyzeUtil {

    public static List<String> getFileInList(String filePath) {
        List<String> fileList = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
            String currentLine;
            while ((currentLine = bufferedReader.readLine()) != null) {
                fileList.add(currentLine);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return fileList;
    }

    public static List<String> getWordStartWithVowelList(String filePath) {
        List<String> wordList = new ArrayList<>();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
            String currentLine;
            while ((currentLine = bufferedReader.readLine()) != null) {
                String[] arrayWithWord = currentLine.split(" ");
                Arrays.stream(arrayWithWord)
                        .filter(x -> x.matches("^[aeiouyAEIOUY].*"))
                        .forEach(x -> wordList.add(x));
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        return wordList;
    }

    public static List<String> getWordLastCharEqualFirstCharNextWord(String filePath) {
        List<String> wordList = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
            String currentLine;
            StringBuilder stringBuilder = new StringBuilder();
            while ((currentLine = bufferedReader.readLine()) != null) {
                stringBuilder = stringBuilder.append(" " + currentLine);
            }
            String[] arrayWithWord = stringBuilder.toString().trim().split(" ");
            for (int i = 0; i < arrayWithWord.length - 1; i++) {
                if (arrayWithWord[i].charAt(arrayWithWord[i].length() - 1) == arrayWithWord[i + 1].charAt(0)) {
                    wordList.add(arrayWithWord[i]);
                }

            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return wordList;
    }


    public static Map<Character, Integer> getCharFrequency(String filePath) {
        Map<Character, Integer> map = new HashMap<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
            String currentLine;
            StringBuilder stringBuilder = new StringBuilder();
            while ((currentLine = bufferedReader.readLine()) != null) {
                stringBuilder = stringBuilder.append(currentLine.toLowerCase().trim());
            }
            String text = stringBuilder.toString().replaceAll("[^a-z]", "");

            for (int i = 0; i < text.length(); i++) {
                map.put(text.charAt(i), map.getOrDefault(text.charAt(i), 0) + 1);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return map;
    }

    public static Map<String, Integer> getStringFrequency(String filePath) {
        Map<String, Integer> unsortedMap = new HashMap<>();
        Map<String, Integer> sortedMap = new LinkedHashMap<>();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
            String currentLine;
            StringBuilder stringBuilder = new StringBuilder();
            while ((currentLine = bufferedReader.readLine()) != null) {
                stringBuilder = stringBuilder.append(" " + currentLine.trim());
            }
            String[] arrayWithWord = stringBuilder.toString().trim().split(" ");

            for (int i = 0; i < arrayWithWord.length; i++) {
                unsortedMap.put(arrayWithWord[i], unsortedMap.getOrDefault(arrayWithWord[i], 0) + 1);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        unsortedMap.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .forEachOrdered(x -> sortedMap.put(x.getKey(), x.getValue()));
        ;

        return sortedMap;
    }

/*
Specification of task 8
Реализовать метод, который принимает путь к файлу с целыми числами и сортирующий
 содержимое файла по возрастанию и сохраняющий результат в файл ${origin_filepath}_.
 */

    public static void writeSortedNumbersInFile(String filePath) {
        List<String> unsortedNumbers = getFileInList(filePath);
        String []string = unsortedNumbers.toString().replaceAll("[^0-9\\s]","").split(" ");

        List<Integer> sortedNumbers = Arrays.stream(string)
                .map(Integer::parseInt)
                .sorted()
                .collect(Collectors.toList());

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src/test/resources/practice.io/ForWrite"))) {
            bufferedWriter.write(sortedNumbers.toString());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }

    public static double studentProgress(String filePath) {
        String string;
        double sum = 0;
        int count = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(String.valueOf(filePath)))) {
            while ((string = reader.readLine()) != null) {
                String[] arr = string.trim().split("[, ]");
                for (String value : arr) {
                    try {
                        System.out.println(value);
                        sum += Double.parseDouble(value.trim());
                        count++;
                    } catch (NumberFormatException ignored) {
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new BigDecimal(sum/count).setScale(2, RoundingMode.HALF_UP).doubleValue();
    }
}
