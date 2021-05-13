package com.rakovets.course.java.core.practice.io;

import java.io.*;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.nio.file.Path;
import java.util.*;
import java.util.stream.Collectors;

public class FileAnalyzeUtil {
    public static List<String> getListOfStringFromFile(Path filePath) {
        List<String> strings = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(String.valueOf(filePath)))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                strings.add(line);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return strings;
    }

    public static List<String> getListOfWordsStartWithVowelLetterFromFile(Path filePath) {
        String[] strings = getListOfStringFromFile(filePath).toString().replaceAll("[\\[\\],.!?]", "").split(" ");
        return Arrays.stream(strings)
                .filter(e -> e.matches("^[eEuUiIoOaA].*"))
                .collect(Collectors.toList());
    }

    public static List<String> getListOfWordsEndsWithTheFirstLetterOfTheNextWord(Path filePath) {
        List<String> listOfWords = new ArrayList<>();
        String[] strings = getListOfStringFromFile(filePath).toString().replaceAll("[,?!] ", "").split(" ");
        for (int i = 0; i < strings.length - 1; i++) {
            char[] tempOne = strings[i].toCharArray();
            char[] tempTwo = strings[i + 1].toCharArray();
            if (tempOne[tempOne.length - 1] == tempTwo[0]) {
                listOfWords.add(strings[i]);
            }
        }
        return listOfWords;
    }

    public static List<String> getLargestAscendingNumbersOrder(Path filePath) {
        List<String> numbersOrders = new ArrayList<>();
        List<Integer> tempBiggest = new ArrayList<>();
        List<Integer> tempCurrent = new ArrayList<>();
        getListOfStringFromFile(filePath)
                .forEach(e -> {
                    String[] listOfNumber = e.split(" ");
                    tempCurrent.add(Integer.parseInt(listOfNumber[0]));
                    for (int i = 1; i < listOfNumber.length; i++) {
                        if (Integer.parseInt(listOfNumber[i]) - 1 == Integer.parseInt(listOfNumber[i - 1])) {
                            tempCurrent.add(Integer.parseInt(listOfNumber[i]));
                        } else {
                            if (tempCurrent.size() > tempBiggest.size()) {
                                tempBiggest.clear();
                                tempBiggest.addAll(tempCurrent);
                                tempCurrent.clear();
                                tempCurrent.add(Integer.parseInt(listOfNumber[i]));
                            } else {
                                tempCurrent.clear();
                                tempCurrent.add(Integer.parseInt(listOfNumber[i]));
                            }
                        }
                    }
                    if (tempCurrent.size() > tempBiggest.size()) {
                        tempBiggest.clear();
                        tempBiggest.addAll(tempCurrent);
                    }
                    String lineOfNumbers = "";
                    for (Integer number : tempBiggest) {
                        lineOfNumbers += number + " ";
                    }
                    numbersOrders.add(lineOfNumbers);
                    tempBiggest.clear();
                    tempCurrent.clear();
                });
        return numbersOrders;
    }

    public static Map<Character, Integer> getQuantityOfCharsRepeating(Path filePath) {
        Map<Character, Integer> usageOfChars = new HashMap<>();
        String text = getListOfStringFromFile(filePath).toString().toLowerCase().replaceAll("[^a-z]", "");
        for (char currentChar : text.toCharArray()) {
            usageOfChars.put(currentChar, usageOfChars.getOrDefault(currentChar, 0) + 1);
        }
        return usageOfChars;
    }

    public static Map<String, Integer> getQuantityOfWordsRepeating(Path filePath) {
        Map<String, Integer> usageOfWords = new HashMap<>();
        Map<String, Integer> sortedMap = new HashMap<>();
        String text = getListOfStringFromFile(filePath).toString().toLowerCase().replaceAll("[\\[\\],.!?]", "").replaceAll("[\\s+]", " ");
        for (String currentWord : text.split(" ")) {
            usageOfWords.put(currentWord, usageOfWords.getOrDefault(currentWord, 0) + 1);
        }
        usageOfWords.entrySet()
                .stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .forEachOrdered(x -> sortedMap.put(x.getKey(), x.getValue()));
        return sortedMap;
    }

    public static void getSortedNubersOrder(Path filePath) {
        String[] arrayOfNumbers = getListOfStringFromFile(filePath).toString().replaceAll("[^0-9\\s]", "").split(" ");
        List<Integer> sortedList = Arrays.stream(arrayOfNumbers)
                .map(Integer::parseInt)
                .sorted()
                .collect(Collectors.toList());
        try (BufferedWriter bufferedWriter =
                     new BufferedWriter(new FileWriter(filePath + "_"))) {
            bufferedWriter.write(sortedList.toString());
            bufferedWriter.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static Map<String, Double> getStudentsRate(Path filePath) {
        Map<String, Double> studentsRate = new HashMap<>();
        List<String> listOfLines = getListOfStringFromFile(filePath);
        listOfLines.
                forEach(e -> {
                    String[] tempArray = e.replaceAll("[\\s+]","").split("[,]");
                    double count = 0.0;
                    int sum = 0;
                    for(int i = 1; i < tempArray.length; i++) {
                        sum += Integer.parseInt(tempArray[i]);
                        count ++;
                    }
                    double averageMark = sum / count;
                    studentsRate.put(tempArray[0],BigDecimal.valueOf(averageMark).setScale(2, RoundingMode.HALF_UP).doubleValue());
                });
        return studentsRate;
    }

    public static void changeModificator(Path filePath, String value, String changingValue) {
        String replacedValue = " " + value + " ";
        List<String> oldFileTextLines = getListOfStringFromFile(filePath);
        List<String> newFileTextLines = oldFileTextLines.stream().map(e -> e.replace(replacedValue, changingValue)).collect(Collectors.toList());
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath + "_"))){
            newFileTextLines.forEach(e -> {
                try {
                    bufferedWriter.write(e.toString() + "\n");
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
            });
            bufferedWriter.flush();
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}

