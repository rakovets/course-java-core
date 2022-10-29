package com.rakovets.course.java.core.practice.jcf_map;


import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TextMonitoring {
    public Map<String, Integer> researchTest(String text) {
        Map<String, Integer> map = new HashMap<>();
        String[] arr = text.
                replaceAll("[,.!?()/|$%]", "").
                split(" ");
        for (String word : arr) {
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }
        return map;
    }

    public int getCountUniqueWords(Map<String,Integer> map) {
        return map.size();
    }

    public Set<String> getUniqueWords(Map<String, Integer> map) {
        return map.keySet();
    }

    public int getFrequencyWord(Map<String, Integer> words, String word) {
        return words.get(word);
    }

    public Map<String, Integer> getFrequencyWords(Map<String, Integer> word, boolean isAscendingFrequency) {
        Map<String, Integer> map = new TreeMap<>(word);
        return isAscendingFrequency ? map : ((TreeMap<String, Integer>) map).descendingMap();
    }
}
