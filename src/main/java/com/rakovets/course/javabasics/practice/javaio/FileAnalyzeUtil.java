package com.rakovets.course.javabasics.practice.javaio;

import java.io.*;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;

public class FileAnalyzeUtil {

    public static List<String> listString(String path, String condition) {
        String string;
        List<String> list = new ArrayList<>();
        String lastWord = "";
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            while ((string = reader.readLine()) != null) {
                switch (condition) {
                    case "all":
                        list.add(string);
                        break;
                    case "firstVowel":
                        if (string.matches("^[aeiouyAEIOUY].*"))
                            list.add(string);
                        break;
                    case "lastChar":
                        if (!lastWord.equals("")) {
                            if (lastWord.charAt(lastWord.length() - 1) == string.charAt(0)) {
                                list.add(lastWord);
                            }
                        }
                        lastWord = string;
                        break;
                    case "numbers":
                        list.add(numbers(string));
                        break;
                }

            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return list;
    }

    public static String numbers(String string) {
        List<String> list = Arrays.asList(string.split(" +"));
        List<Integer> numbersList = new ArrayList<>();
        for (String str : list)
            numbersList.add(Integer.parseInt(str));
        List<List<Integer>> listOfNumbersList = new ArrayList<>();
        int fromIndex = 0;
        if (list.size() > 1) {
            for (int i = 1; i < numbersList.size(); i++) {
                if (numbersList.get(i - 1) >= numbersList.get(i)) {
                    listOfNumbersList.add(numbersList.subList(fromIndex, i));
                    fromIndex = i;
                }
            }
            listOfNumbersList.add(numbersList.subList(fromIndex, numbersList.size()));
        } else return list.get(0);
        int size = listOfNumbersList.get(0).size();
        int max = size;
        int index = 0;
        for (int i = 1; i < listOfNumbersList.size(); i++) {
            size = listOfNumbersList.get(i).size();
            if (max < size) {
                max = size;
                index = i;
            }
        }
        StringBuilder result = new StringBuilder();
        for (Integer num : listOfNumbersList.get(index)) {
            result.append(num).append(" ");
        }
        return result.toString().trim();
    }

    public static List<String> listText(String path, String condition) {
        String string;
        List<String> list = new ArrayList<>();
        StringBuilder text = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            while ((string = reader.readLine()) != null) {
                if (!string.equals("")) {
                    text.append(string).append(" ");
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        switch (condition) {
            case "lettersFrequency" -> {
                Map<Character, Integer> charMap = new TreeMap<>();
                char ch;
                text = new StringBuilder(text.toString().replace(" ", ""));
                text = new StringBuilder(text.toString().toLowerCase());
                while (text.length() > 0) {
                    ch = text.charAt(0);
                    text = new StringBuilder(text.substring(1));
                    if (charMap.containsKey(ch)) {
                        charMap.put(ch, charMap.get(ch) + 1);
                    } else charMap.put(ch, 1);
                }
                for (Map.Entry<Character, Integer> entry : charMap.entrySet()) {
                    list.add(entry.getKey() + "-" + entry.getValue());
                }
            }
            case "wordsFrequency" -> {
                Map<String, Integer> stringMap = new TreeMap<>();
                String[] wordsList = text.toString().split(" +");
                for (String word : wordsList) {
                    if (stringMap.containsKey(word)) {
                        stringMap.put(word, stringMap.get(word) + 1);
                    } else stringMap.put(word, 1);
                }
                int i = 0;
                for (Map.Entry<String, Integer> entry : stringMap.entrySet()) {
                    wordsList[i++] = entry.getValue() + "-" + entry.getKey();
                }
                String[] result = Arrays.copyOf(wordsList, i);
                Arrays.sort(result);
                list = Arrays.asList(result);
            }
            case "sortNumbers" -> {
                String[] stringNumbers = text.toString().split(" +");
                int[] numbers = new int[stringNumbers.length];
                for (int j = 0; j < stringNumbers.length; j++) {
                    if (!stringNumbers[j].equals("")) {
                        numbers[j] = Integer.parseInt(stringNumbers[j]);
                    }
                }
                Arrays.sort(numbers);
                try (FileWriter writer = new FileWriter(path)) {
                    for (int j = 0; j < stringNumbers.length; j++) {
                        stringNumbers[j] = "" + numbers[j];
                        writer.write(stringNumbers[j] + System.lineSeparator());
                    }
                    writer.flush();
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
                list.addAll(Arrays.asList(stringNumbers));
            }
        }
        return list;
    }

    public static double getProgress(String path) {
        String string;
        double sum = 0;
        int num = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            while ((string = reader.readLine()) != null) {
                String[] data = string.split(",");
                for (String element : data) {
                    try {
                        sum += Double.parseDouble(element);
                        num++;
                    } catch (NumberFormatException e) {
                        throw new NumberFormatException();
                    }
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return new BigDecimal(sum / num).setScale(2, RoundingMode.HALF_UP).doubleValue();
    }

    public static boolean changeModifier(String path, String oldModifier, String newModifier) {
        String string;
        StringBuilder text = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            while ((string = reader.readLine()) != null) {
                text.append(string).append("\n");
            }
        } catch (IOException e) {
            return false;
        }
        String className = new File(path).getName().replace(".java", "");
        String regEx = "(?! " + className + "| class)";
        text = new StringBuilder(text.toString().replaceAll(oldModifier + regEx, newModifier));
        try (FileWriter writer = new FileWriter(path)) {
            writer.write(text.toString());
            writer.flush();
        } catch (IOException e) {
            return false;
        }
        return true;
    }
}

