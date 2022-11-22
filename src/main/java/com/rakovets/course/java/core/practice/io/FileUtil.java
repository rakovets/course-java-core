package com.rakovets.course.java.core.practice.io;

import com.rakovets.course.java.core.util.NumberUtil;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.file.Path;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class FileUtil {
    private static final Logger logger = Logger.getLogger(FileUtil.class.getName());
    public void rewriteOneFileToAnother(Path inputFilePath, Path outputFilePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFilePath.toFile()))) {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath.toFile()))) {
                String str;
                while ((str = reader.readLine()) != null) {
                    writer.write(str.toUpperCase());
                    writer.newLine();
                }
            }
        } catch (IOException e) {
            logger.log(Level.SEVERE, "StackTrace " + Arrays.toString(e.getStackTrace()));
        }
    }

    public List<String> getListOfStrings(Path inputFilePath) {
        List<String> output = new LinkedList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFilePath.toFile()))) {
            String str;
            while ((str = reader.readLine()) != null) {
                output.add(str);
            }
        } catch (IOException e) {
            logger.log(Level.SEVERE, "StackTrace " + Arrays.toString(e.getStackTrace()));
        }
        return output;
    }

    public List<String> getWordsStartsWithVowel(Path inputFilePath) {
        List<String> output = new LinkedList<>();
        String[] arrayWords = getListOfStrings(inputFilePath).toString()
                .replaceAll("[,.\\]\\[]", "").split(" ");
        Arrays.stream(arrayWords)
                .filter(i -> i.matches("^[aeiouyAEIOUY].*"))
                .forEach(output::add);
        return output;
    }

    public List<String> getWordsFirstCharEqualLastCharNextWord(Path inputFilePath) {
        List<String> output = new LinkedList<>();
        Scanner sc = null;
        try {
            sc = new Scanner(inputFilePath);
            String previousWord = null;
            if (sc.hasNext()) {
                previousWord = sc.next().replaceAll("[.,?!:;\\s]", "");
            }
            while (sc.hasNext()) {
                String nextWord = sc.next().replaceAll("[.,?!:;\\s]", "");
                if (previousWord.endsWith(String.valueOf(nextWord.charAt(0)))) {
                    output.add(previousWord + " " + nextWord);
                }
                previousWord = nextWord;
            }
        } catch (IOException e) {
            logger.log(Level.SEVERE, "StackTrace " + Arrays.toString(e.getStackTrace()));
        }
        if (sc != null) {
            sc.close();
        }
        return output;
    }

    public void findListOfLargestNumberCombination(String[] listOfNumber, List<Integer> tempBiggest, List<Integer> tempCurrent) {
        for (int i = 1; i < listOfNumber.length; i++) {
            if (Integer.parseInt(listOfNumber[i]) >= Integer.parseInt(listOfNumber[i - 1])) {
                tempCurrent.add(Integer.parseInt(listOfNumber[i]));
            } else {
                if (tempCurrent.size() > tempBiggest.size()) {
                    tempBiggest.clear();
                    tempBiggest.addAll(tempCurrent);
                }
                tempCurrent.clear();
                tempCurrent.add(Integer.parseInt(listOfNumber[i]));
            }
        }
        if (tempCurrent.size() > tempBiggest.size()) {
            tempBiggest.clear();
            tempBiggest.addAll(tempCurrent);
        }
    }

    public List<String> getListOfLargestNumberCombination(Path inputFilePath) {
        List<String> numbersOrders = new ArrayList<>();
        List<Integer> tempBiggest = new ArrayList<>();
        List<Integer> tempCurrent = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(inputFilePath.toFile()))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] listOfNumber = line.split(" ");
                tempCurrent.add(Integer.parseInt(listOfNumber[0]));
                findListOfLargestNumberCombination(listOfNumber, tempBiggest, tempCurrent);
                String lineOfNumbers = "";
                for (Integer number : tempBiggest) {
                    lineOfNumbers += number + " ";
                }
                numbersOrders.add(lineOfNumbers);
                tempBiggest.clear();
                tempCurrent.clear();
            }
        } catch (IOException e) {
            logger.log(Level.SEVERE, "StackTrace " + Arrays.toString(e.getStackTrace()));
        }
        return numbersOrders;
    }

    public Map<Character, Integer> getAllLettersFrequency(Path inputFilePath) {
        Map<Character, Integer> output = new HashMap<>();
        String letters = getListOfStrings(inputFilePath).toString().toLowerCase().replaceAll("[^a-z]", "");
        for (int i = 0; i < letters.length(); i++) {
            output.put(letters.charAt(i), output.getOrDefault(letters.charAt(i), 0) + 1);
        }
        return output;
    }

    public Map<String, Integer> getAscendingSortedWordsFrequency(Path inputFilePath) {
        Map<String, Integer> output = new HashMap<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFilePath.toFile()))) {
            String str;
            while ((str = reader.readLine()) != null) {
                String text = str.toLowerCase().trim().replaceAll("[^a-zA-Z_0-9 ]", "");
                for (String currentWord : text.split(" ")) {
                    output.put(currentWord, output.getOrDefault(currentWord, 0) + 1);
                }
            }
        } catch (IOException e) {
            logger.log(Level.SEVERE, "StackTrace " + Arrays.toString(e.getStackTrace()));
        }
        return output.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
    }

    public void writeAscendingSortedNumbers(Path inputFilePath, String postfix) {
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFilePath.toFile()))) {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(inputFilePath + postfix))) {
                String str;
                while ((str = reader.readLine()) != null) {
                    String[] array = str.split(" ");
                    List<Integer> sorted = Arrays.stream(array)
                            .map(Integer::parseInt)
                            .sorted()
                            .collect(Collectors.toList());
                    writer.write(sorted.toString());
                }
            }
        } catch (IOException e) {
            logger.log(Level.SEVERE, "StackTrace " + Arrays.toString(e.getStackTrace()));
        }
    }

    public Map<String, Double> getStudentProgress(Path inputFilePath) {
        Map<String, Double> result = new LinkedHashMap<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFilePath.toFile()))) {
            String str;
            while ((str = reader.readLine()) != null) {
                String[] array = str.replaceAll(" ", "").trim().split(",");
                double averageMark = 0.0;
                int count = 0;
                for (int i = 1; i < array.length; i++) {
                    averageMark += Integer.parseInt(array[i]);
                    count++;
                }
                result.put(array[0], NumberUtil.roundValueToTwoDigitsForMantissa(averageMark / count));
            }
        } catch (IOException e) {
            logger.log(Level.SEVERE, "StackTrace " + Arrays.toString(e.getStackTrace()));
        }
        return result;
    }

    public void changeAccess(Path inputFilePath, String x, String y) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(inputFilePath + "_"))) {
            List<String> list = getListOfStrings(inputFilePath);
            for (String str : list) {
                if (str.contains("class")) {
                    writer.write(str + "\n");
                } else {
                    writer.write(str.replaceAll(x, y) + "\n");
                }
            }
        } catch (IOException e) {
            logger.log(Level.SEVERE, "StackTrace " + Arrays.toString(e.getStackTrace()));
        }
    }
}
