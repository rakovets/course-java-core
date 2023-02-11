package com.rakovets.course.java.core.practice.jcf_map.words_monitoring;

import java.util.*;

public class TextMonitoring {
    private final String[] words;

    public TextMonitoring(String text) {
        words = text.trim().split("\\W+");
    }

    private Map<String, Integer> researchText() {
        Map<String, Integer> textMap = new HashMap<>();

        for (String word : words) {
            if (textMap.containsKey(word)) {
                textMap.put(word, textMap.get(word) + 1);
            } else {
                textMap.put(word, 1);
            }
        }

        return textMap;
    }

    public Integer getCountUniqueWords() {
        return researchText().size();
    }

    public Collection<String> getUniqueWords() {
        return researchText().keySet();
    }

    public Integer getFrequencyWord(String word) {
        return researchText().getOrDefault(word, 0);
    }

    public Map<String, Integer> getFrequencyWords(boolean isAscendingFrequency) {
        TreeMap<String, Integer> treeMap = new TreeMap<>(new Comparator<>() {
            @Override
            public int compare(String word1, String word2) {
                int cmp = getFrequencyWord(word1).compareTo(getFrequencyWord(word2));
                if (cmp != 0) {
                    return cmp;
                }
                return word1.compareTo(word2);
            }
        });
        treeMap.putAll(researchText());

        return isAscendingFrequency ? treeMap : treeMap.descendingMap();
    }
}
