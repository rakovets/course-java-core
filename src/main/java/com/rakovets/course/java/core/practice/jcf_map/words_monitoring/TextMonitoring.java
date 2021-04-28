package com.rakovets.course.java.core.practice.jcf_map.words_monitoring;

import java.util.*;

public class TextMonitoring {

    public static Map<String, Integer> researchText(String text) {
        text = text.replaceAll("[?!.,:;]", "");
        Map<String, Integer> map = new HashMap<>();
        for (String word : text.split("\\s+")) {
            if (!map.containsKey(word)) {
                map.put(word, 1);
            } else {
                map.put(word, map.get(word) + 1);
            }
        }
        return map;
    }

    public static int getCountUniqueWords(String text) {
        Map<String, Integer> countUniqueWords = researchText(text);
        return countUniqueWords.size();
    }

    public static Set<String> getUniqueWords(String text) {
        Map<String, Integer> uniqueWords = researchText(text);
        return uniqueWords.keySet();
    }

    public static int getFrequencyWord(String text, String word) {
        Map<String, Integer> frequencyWord = researchText(text);
        return frequencyWord.getOrDefault(word, 0);
    }

    public static List<Map.Entry<String, Integer>> getFrequencyWords(String text, boolean isAscendingFrequency) {
        List<Map.Entry<String, Integer>> list = new LinkedList<>(researchText(text).entrySet());
        if (isAscendingFrequency) {
            list.sort(Map.Entry.comparingByValue());
        } else {
            list.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));
        }
        return list;
    }
}
