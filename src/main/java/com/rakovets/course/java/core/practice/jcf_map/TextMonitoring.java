package com.rakovets.course.java.core.practice.jcf_map;

import java.util.*;

public class TextMonitoring {
    public Map<String, Integer> researchText(String line) {
        String[] text = line.replaceAll("\\W", " ").trim().split(" +");
        HashMap<String, Integer> words = new HashMap<>();
        for (String s : text) {
            if (words.containsKey(s)) {
                words.put(s, words.get(s) + 1);
            } else {
                words.put(s, 1);
            }
        }
        return words;
    }

    public int getCountUniqueWords(Map<String, Integer> words) {
        return words.size();
    }

    public Set<String> getUniqueWords(Map<String, Integer> words) {
        return words.keySet();
    }

    public Collection<Integer> getFrequencyWord(Map<String, Integer> words) {
        return words.values();
    }

    public SortedMap<String, Integer> getFrequencyWords(Map<String, Integer> words, boolean isAscendingFrequency) {
        Map<String, Integer> sortedMap = new TreeMap<>();
        NavigableMap<String, Integer> map = new TreeMap<>(words);
        return isAscendingFrequency ? map : map.descendingMap();
    }
}
