package com.rakovets.course.java.core.practice.jcf.map;

import java.util.*;

public class TextMonitoring {
    public static Map<String, Integer> researchText(String string) {
        Map<String, Integer> counterMap = new HashMap<>();
        int counter = 1;
        for (String word : string.split("\\s+")) {
            if (counterMap.containsKey(word)) {
                counter = counterMap.get(word) + 1;
            }
            counterMap.put(word, counter);
        }
        return counterMap;
    }

    public static Integer getCountUniqueWords(String string) {
        return getUniqueWords(string).size();
    }

    public static List<String> getUniqueWords(String string) {
        ArrayList<String> uniqueWords = new ArrayList<>();
        for (String word : string.split("\\s+")) {
            if (!uniqueWords.contains(word)) {
                uniqueWords.add(word);
            }
        }
        return uniqueWords;
    }

    public static Integer getFrequencyWord(String string, String searchedWord) {
        Map<String, Integer> counterMap = new HashMap<>();
        int counter = 0;
        for (String word : string.split("\\s+")) {
            if (word.compareTo(searchedWord) == 0) {
                counter++;
            }
        }
        return counter;
    }

    // to rework
    public static Map<String, Integer> getFrequencyWords(boolean isAscendingFrequency, String string) {
        Map<String, Integer> counterMap = new HashMap<>();
        int counter = 1;
        for (String word : string.split("\\s+")) {
            if (counterMap.containsKey(word)) {
                counter = counterMap.get(word) + 1;
            }
            counterMap.put(word, counter);
        }
        List<Map.Entry<String, Integer>> list = new ArrayList<>(counterMap.entrySet());
        list.sort(Map.Entry.comparingByValue());
        if (!isAscendingFrequency) {
            Collections.reverse(list);
        }
        Map<String, Integer> result = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : list) {
            result.put(entry.getKey(), entry.getValue());
        }
        return result;
    }
}
