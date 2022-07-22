package com.rakovets.course.java.core.practice.jcf_map;

import java.util.*;

public class TextMonitoring {
    public Map<String, Integer> researchText(String text) {
        Map<String, Integer> wordsMap = new HashMap<>();
        String pureText = text.replaceAll("[^A-Za-z'\\s]", "");
        String[] textIntoWords = pureText.trim().split("\\s{1,}");
        for (String word : textIntoWords) {
            if (wordsMap.containsKey(word)) {
                int wordCount = wordsMap.get(word) + 1;
                wordsMap.put(word, wordCount);
            } else {
                wordsMap.put(word, 1);
            }
        }
        return wordsMap;
    }

    public int getCountUniqueWords(String text) {
        return researchText(text).size();
    }

    public Set<String> getUniqueWords(String text) {
        return researchText(text).keySet();
    }

    public int getFrequencyWord(String text, String word) {
        return researchText(text).get(word);
    }

    public List<Map.Entry<String, Integer>> getFrequencyWords(String text, boolean isAscendingFrequency) {
        List<Map.Entry<String, Integer>> list = new ArrayList<>(researchText(text).entrySet());
        if (isAscendingFrequency) {
            list.sort(new ValueComparator());
        } else {
            list.sort(new ValueComparator().reversed());
        }
        return list;
    }
}
