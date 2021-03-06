package com.rakovets.course.java.core.practice.io.file_analyzer;

import java.io.*;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.nio.file.Path;
import java.util.*;

public class FileAnalyzeUtil {

    public static List<String> myList(Path filePath, Task task) {
        List<String> myList = new ArrayList<>();
        try (BufferedReader in = new BufferedReader(new FileReader(String.valueOf(filePath)))) {
            String str;
            while ((str = in.readLine()) != null) {
                switch (task) {
                    case GET_MY_LIST:
                        myList.add(str);
                        break;
                    case LIST_WORDS_START_WITH_VOWEL:
                        for (String word : str.split("\\W")) {
                            if (word.matches("[aAeEiIoOuUyY](.*)")) {
                                myList.add(word);
                            }
                        }
                        break;
                    case WORDS_WITH_EQUAL_FIRST_AND_LAST_LETTER:
                        String[] word;
                        word = str.split("\\W");
                        for (int j = 0; j < word.length - 1; j++) {
                            if (word[j] != null && word[j + 1] != null)
                                if (word[j].charAt(word[j].length() - 1) == word[j + 1].charAt(0))
                                    myList.add(word[j]);
                        }
                        break;
                    case LIST_OF_LARGEST_NUMBER_COMBINATION:
                        myList.add(listOfLargestNumberCombination(str));
                        break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return myList;
    }

    public static String listOfLargestNumberCombination(String string) {
        List<String> list = Arrays.asList(string.split(" +"));
        List<Integer> numbers = new ArrayList<>();
        for (String str : list)
            numbers.add(Integer.parseInt(str));
        List<List<Integer>> listOfNumbers = new ArrayList<>();
        int ind = 0;
        if (list.size() > 1) {
            for (int i = 1; i < numbers.size(); i++) {
                if (numbers.get(i - 1) >= numbers.get(i)) {
                    listOfNumbers.add(numbers.subList(ind, i));
                    ind = i;
                }
            }
            listOfNumbers.add(numbers.subList(ind, numbers.size()));
        } else
            return list.get(0);
        int size = listOfNumbers.get(0).size();
        int max = size;
        int index = 0;
        for (int i = 1; i < listOfNumbers.size(); i++) {
            size = listOfNumbers.get(i).size();
            if (max < size) {
                max = size;
                index = i;
            }
        }
        StringBuilder result = new StringBuilder();
        for (Integer number : listOfNumbers.get(index)) {
            result.append(number).append(" ");
        }
        return result.toString().trim();
    }

    public static List<String> getList(Path path, Task task) {
        String string;
        List<String> list = new ArrayList<>();
        StringBuilder text = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(String.valueOf(path)))) {
            while ((string = reader.readLine()) != null) {
                if (!string.equals("")) {
                    text.append(string).append(" ");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        switch (task) {
            case FREQUENCY_OF_REPETITION:
                Map<Character, Integer> mapOfChars = new HashMap<>();
                char ch;
                text = new StringBuilder(text.toString().replace(" ", ""));
                text = new StringBuilder(text.toString().toLowerCase());
                while (text.length() > 0) {
                    ch = text.charAt(0);
                    text = new StringBuilder(text.substring(1));
                    if (mapOfChars.containsKey(ch))
                        mapOfChars.put(ch, mapOfChars.get(ch) + 1);
                    else
                        mapOfChars.put(ch, 1);
                }
                for (Map.Entry<Character, Integer> entry : mapOfChars.entrySet()) {
                    list.add(entry.getKey() + "-" + entry.getValue());
                }
                break;
            case FREQUENCY_OF_WORDS_ASCENDING_ORDER:
                Map<String, Integer> mapOfWords = new HashMap<>();
                String[] words = text.toString().split(" +");
                for (String word : words) {
                    if (mapOfWords.containsKey(word))
                        mapOfWords.put(word, mapOfWords.get(word) + 1);
                    else
                        mapOfWords.put(word, 1);
                }
                int i = 0;
                for (Map.Entry<String, Integer> entry : mapOfWords.entrySet()) {
                    words[i++] = entry.getValue() + "-" + entry.getKey();
                }
                String[] result = Arrays.copyOf(words, i);
                Arrays.sort(result);
                list = Arrays.asList(result);
                break;
            case SORT_IN_ASCENDING_ORDER:
                List<String> stringNumbers = Arrays.asList(text.toString().split(" +"));
                int[] nums = new int[stringNumbers.size()];
                for (int j = 0; j < stringNumbers.size(); j++) {
                    if (!stringNumbers.get(j).equals("")) {
                        nums[j] = Integer.parseInt(stringNumbers.get(j));
                    }
                }
                Arrays.sort(nums);
                try (FileWriter writer = new FileWriter(String.valueOf(path))) {
                    for (int j = 0; j < stringNumbers.size(); j++) {
                        stringNumbers.set(j, "" + nums[j]);
                        writer.write(stringNumbers.get(j) + System.lineSeparator());
                    }
                    writer.flush();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                list.addAll(stringNumbers);
                break;
        }
        return list;
    }

    public static double studentProgress(Path path) {
        String string;
        double sum = 0;
        int count = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(String.valueOf(path)))) {
            while ((string = reader.readLine()) != null) {
                String[] arr = string.split(",");
                for (String value : arr) {
                    try {
                        sum += Double.parseDouble(value);
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

    public static void replaceAccessModifiers(String filePath, String oldModifier, String newModifier) {
        String newFilePath = filePath.replace(filePath, filePath + "_");
        String str;
        String newStr;
        try (BufferedReader in = new BufferedReader(new FileReader(filePath));
             BufferedWriter out = new BufferedWriter(new FileWriter(newFilePath))) {
            while ((str = in.readLine()) != null) {
                newStr = str.replace(oldModifier, newModifier);
                out.write(newStr + "\n");
            }
            out.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
