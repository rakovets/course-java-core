package com.rakovets.course.java.core.practice.io;

import java.io.*;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.nio.file.Path;
import java.util.*;
import java.util.stream.Collectors;

public class FileAnalyzeUtil {
    public static List<String> getTextInLinesList(Path filePath) {
        List<String> fileList = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(String.valueOf(filePath)))) {
            String currentLine;
            while ((currentLine = bufferedReader.readLine()) != null) {
                fileList.add(currentLine);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return fileList;
    }

    public static List<String> getWordStartWithVowelList(Path filePath) {
        List<String> wordList = new ArrayList<>();
        String[] arrayWithWords = getTextInLinesList(filePath).toString()
                .replaceAll("[,\\]\\[]", "").split(" ");
        Arrays.stream(arrayWithWords)
                .filter(x -> x.matches("^[aeiouyAEIOUY].*"))
                .forEach(x -> wordList.add(x));
        return wordList;
    }

    public static List<String> getWordLastCharEqualFirstCharNextWord(Path filePath) {
        List<String> wordList = new ArrayList<>();
        String[] arrayWithWord = getTextInLinesList(filePath).toString().trim()
                .replaceAll("[,\\]\\[]", "").split(" ");
        for (int i = 0; i < arrayWithWord.length - 1; i++) {
            System.out.println(arrayWithWord[i]);
            if (arrayWithWord[i].charAt(arrayWithWord[i].length() - 1) == arrayWithWord[i + 1].charAt(0)) {
                wordList.add(arrayWithWord[i]);
            }
        }
        return wordList;
    }

    public static List<String> listOfLargestNumberCombination(Path filePath) {
        List<String> arrayWithWords = getTextInLinesList(filePath);
        List<String> maxCombinations = new ArrayList<>();
        List<Integer> numbersInArray = new ArrayList<>();

        for (String str : arrayWithWords) {
            String[] text = str.split(" ");
            for (String number : text) {
                numbersInArray.add(Integer.parseInt(number));
            }
            numbersInArray = numbersInArray.stream()
                    .sorted()
                    .distinct()
                    .collect(Collectors.toList());
            List<Integer> numbers = new ArrayList<>();
            List<Integer> tempArray = new ArrayList<>();
            tempArray.add(numbersInArray.get(0));

            for (int i = 1; i < numbersInArray.size(); i++) {
                if ((numbersInArray.get(i - 1) + 1) == numbersInArray.get(i)) {
                    tempArray.add(numbersInArray.get(i));
                } else {
                    if (numbers.size() < tempArray.size()) {
                        numbers.clear();
                        tempArray.stream().forEach(x -> numbers.add(x));
                    }
                    tempArray.clear();
                    tempArray.add(numbersInArray.get(i));
                }
            }

            if (numbers.size() < tempArray.size()) {
                numbers.clear();
                tempArray.stream().forEach(x -> numbers.add(x));
            }
            maxCombinations.add(numbers.toString());
            numbers.clear();
        }

        return maxCombinations;
    }

    public static Map<Character, Integer> getCharFrequency(Path filePath) {
        Map<Character, Integer> map = new HashMap<>();
        String text = getTextInLinesList(filePath).toString().toLowerCase().replaceAll("[^a-z]", "");
        for (int i = 0; i < text.length(); i++) {
            map.put(text.charAt(i), map.getOrDefault(text.charAt(i), 0) + 1);
        }
        return map;
    }

    public static Map<String, Integer> getStringFrequency(Path filePath) {
        Map<String, Integer> unsortedMap = new HashMap<>();
        Map<String, Integer> sortedMap = new LinkedHashMap<>();
        String[] arrayWithWords = getTextInLinesList(filePath).toString().trim()
                .replaceAll("[^a-zA-Z_0-9 ]", "").split(" ");

        for (int i = 0; i < arrayWithWords.length; i++) {
            unsortedMap.put(arrayWithWords[i], unsortedMap.getOrDefault(arrayWithWords[i], 0) + 1);
        }

        unsortedMap.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .forEachOrdered(x -> sortedMap.put(x.getKey(), x.getValue()));
        return sortedMap;
    }

    public static void writeSortedNumbersInFile(Path filePath) {
        List<String> unsortedNumbers = getTextInLinesList(filePath);
        String[] arrayWithNumbers = unsortedNumbers.toString()
                .replaceAll("[^0-9\\s]", "").split(" ");

        List<Integer> sortedNumbers = Arrays.stream(arrayWithNumbers)
                .map(Integer::parseInt)
                .sorted()
                .collect(Collectors.toList());

        try (BufferedWriter bufferedWriter =
                     new BufferedWriter(new FileWriter(filePath + "_"))) {
            bufferedWriter.write(sortedNumbers.toString());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static double studentProgress(Path filePath) {
        String text;
        double sum = 0;
        int count = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(String.valueOf(filePath)))) {
            while ((text = reader.readLine()) != null) {
                String[] arr = text.trim().split("[, ]");
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
        return new BigDecimal(sum / count).setScale(2, RoundingMode.HALF_UP).doubleValue();
    }

    public static void replaceAccess(String filePath, String oldModifier, String newModifier) {
        String newFilePath = filePath.replace(filePath, filePath + "_");
        String text;
        String newText;
        try (BufferedReader in = new BufferedReader(new FileReader(filePath));
             BufferedWriter out = new BufferedWriter(new FileWriter(newFilePath))) {
            while ((text = in.readLine()) != null) {
                newText = text.replace(oldModifier, newModifier);
                out.write(newText + "\n");
            }
            out.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
