package com.rakovets.course.java.core.practice.jcf.map;

import java.util.*;

public class TextMonitoring {
    public static Map<String, Integer> researchText(String str) {
        Map<String, Integer> repeatedWords = new HashMap<>();
        for (String word : str.split("\\s*\\W\\s*")) {
            if (repeatedWords.containsKey(word)) {
                repeatedWords.put(word, repeatedWords.get(word) + 1);
            } else {
                repeatedWords.put(word, 1);
            }
        }
        return repeatedWords;
    }

    public static int getCountUniqueWords(String str) {
        Set<Map.Entry<String, Integer>> set = researchText(str).entrySet();
        int count = 0;
        for (Map.Entry<String, Integer> me : set) {
            if (me.getValue() == 1) {
                count++;
            }
        }
        return count;
    }

    public static List<String> getUniqueWords(String str) {
        Set<Map.Entry<String, Integer>> set = researchText(str).entrySet();
        List<String> uniqueWords = new ArrayList<>();
        for (Map.Entry<String, Integer> pair : set) {
            if (pair.getValue() == 1) {
                uniqueWords.add(pair.getKey());
            }
        }
        return uniqueWords;
    }

    public static int getFrequencyWord(String str, String word) {
        Set<Map.Entry<String, Integer>> set = researchText(str).entrySet();
        for (Map.Entry<String, Integer> pair : set) {
            if (pair.getKey().equals(word)) {
                return pair.getValue();
            }
        }
        return 0;
    }

    public static Map<String, Integer> getFrequencyWords(boolean isAscendingFrequency, String str) {
        List<Map.Entry<String, Integer>> list = new ArrayList<>(researchText(str).entrySet());
        if (isAscendingFrequency) {
            list.sort(Map.Entry.comparingByValue());
        } else {
            list.sort(Map.Entry.<String, Integer>comparingByValue().reversed());
        }
        Map<String, Integer> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }
        return sortedMap;
    }
}
