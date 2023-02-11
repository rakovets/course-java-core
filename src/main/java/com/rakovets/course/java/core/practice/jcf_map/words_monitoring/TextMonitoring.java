package com.rakovets.course.java.core.practice.jcf_map.words_monitoring;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TextMonitoring {
    private final String[] words;

    public TextMonitoring(String text) {
        words = text.trim().split("\\w");
    }

    private Map<String, Integer> researchText(String[] text) {
        Map<String, Integer> textMap = new HashMap<String, Integer>();

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
        return researchText(this.words).size();
    }

    public Collection<String> getUniqueWords() {
        return researchText(this.words).keySet();
    }

    public Integer getFrequencyWord(String word) {
        return researchText(this.words).getOrDefault(word, 0);
    }

    public Map<String, Integer> getFrequencyWords(boolean isAscendingFrequency) {
        TreeMap<String, Integer> treeMap = new TreeMap<>(researchText(this.words));

        return isAscendingFrequency ? treeMap : treeMap.descendingMap();
    }
}
