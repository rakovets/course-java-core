package com.rakovets.course.java.core.practice.io.file_util;

import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileUtil {
    public static final Logger logger = Logger.getLogger(FileUtil.class.getName());

    public void rewriteContents(String text, String text2) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(text));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(text2))) {
            String newText;
            while ((newText = bufferedReader.readLine()) != null) {
                bufferedWriter.write(newText.toUpperCase(Locale.ROOT));
            }
        } catch (IOException e) {
            logger.log(Level.WARNING, e.getMessage());
        }
    }

    public List<String> getListStringFromFile(String way) {
        List<String> list = new ArrayList<>();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(way));
            String newText;
            while ((newText = bufferedReader.readLine()) != null) {
                list.add(newText);
            }
        } catch (IOException e) {
            logger.log(Level.WARNING, e.getMessage());
        }
        return list;
    }

    public List<String> getListStringVowel(String way) {
        List<String> list = new ArrayList<>();
        for (String text : getListStringFromFile(way)) {
            Arrays.stream(text.split(" "))
                    .filter(i -> i.substring(0, 1)
                            .matches("[aeiouyAEIOUY]"))
                    .forEach(list::add);
        }
        return list;
    }

    public List<String> getListWordWithSameLetters(String way) {
        List<String> list = new ArrayList<>();
        for (String text : getListStringFromFile(way)) {
            String[] nj = text.split(" ");
            for (int i = 0; i < nj.length - 1; i++) {
                String[] nm = nj[i].split("");
                for (int j = 0; j < nm.length - 1; j++) {
                    String temp = nm[nm.length - 1];
                    if (nj[i + 1].startsWith(temp)) {
                        list.add(nj[i]);
                        break;
                    }
                }
            }
        }
        return list;
    }

    public List<String> getLargestCombinationNumbers(String way) {
        List<String> list = getListStringFromFile(way);
        List<String> largestCombinationNumbers = new LinkedList<>();

        for (String text : list) {
            String textOfNumbers = "";
            int startIndex = 0;
            int endIndex = 0;
            int currentLength = 0;
            String[] numbers = text.split(" ");
            for (int i = 1; i < numbers.length; i++) {
                if (Integer.parseInt(numbers[i]) > Integer.parseInt(numbers[i - 1])) {
                    currentLength++;
                } else if (currentLength >= (endIndex - startIndex)) {
                    endIndex = i;
                    startIndex = i - currentLength - 1;
                    currentLength = 0;
                }
            }
            if (currentLength >= (endIndex - startIndex)) {
                endIndex = numbers.length;
                startIndex = numbers.length - currentLength - 1;
            }
            for (int i = startIndex; i <= endIndex; i++) {
                textOfNumbers = i == endIndex
                        ? String.join(" ", Arrays.copyOfRange(numbers, startIndex, endIndex))
                        : String.join(" ", Arrays.copyOfRange(numbers, startIndex, endIndex)) + " ";
            }
            largestCombinationNumbers.add(textOfNumbers);
        }
        return largestCombinationNumbers;
    }

    public Map<Character, Integer> getFrequencyRepetitionAllLettersText(String way) {
        Map<Character, Integer> map = new HashMap<>();
        String letters = getListStringFromFile(way).toString().toLowerCase().replaceAll("[^a-z]", "");
        for (int i = 0; i < letters.length(); i++) {
            map.put(letters.charAt(i), map.getOrDefault(letters.charAt(i), 0) + 1);
        }
        return map;
    }
}
