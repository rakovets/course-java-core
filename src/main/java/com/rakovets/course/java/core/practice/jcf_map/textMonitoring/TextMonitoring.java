package com.rakovets.course.java.core.practice.jcf_map.textMonitoring;

import java.util.*;

public class TextMonitoring {
    public Map<String, Integer> researchText(String text) {
        Map<String, Integer> mapWords = new LinkedHashMap<>();
        String[] words = text.trim().split("(\\W+)");
        for (String word : words) {
            if (mapWords.containsKey(word)) {
                mapWords.put(word, mapWords.get(word) + 1);
            } else {
                mapWords.put(word, 1);
            }
        }
        return mapWords;
    }

    public Integer getCountUniqueWords(String text) {
        return researchText(text).size();
    }

    public Set<String> getUniqueWords(String text) {
        return researchText(text).keySet();
    }

    public Integer getFrequencyWord(String word, String text) {
        return researchText(text).containsKey(word) ? researchText(text).get(word) : 0;
    }

    public NavigableMap<String, Integer> getFrequencyWords(String text, boolean isAscendingFrequency) {
        Map<String, Integer> mapWords = researchText(text);
        TreeMap<String, Integer> map = new TreeMap<>(
        Comparator.comparing(mapWords :: get));
        map.putAll(mapWords);
        return isAscendingFrequency ? map : map.descendingMap();
        }
    }
