package com.rakovets.course.java.core.practice.jcf_map.words_monitoring;

import java.util.*;

public class TextMonitoring {
    public Map<String, Integer> researchText(String text) {
        Map<String, Integer> repetitionWords = new HashMap<>();

        String[] arrayWords = text.split("(\\W+)");

        for (String wordOne : arrayWords) {
            Integer repetitionCounter = 0;
            for (String wordTwo : arrayWords) {
                if (wordOne.equals(wordTwo)) {
                    repetitionCounter++;
                }
            }
            repetitionWords.put(wordOne, repetitionCounter);
        }
        return repetitionWords;
    }

    public int getCountUniqueWords(String text) {
        return researchText(text).size();
    }

    public Set<String> getUniqueWords(String text) {
        return researchText(text).keySet();
    }

    public int getFrequencyWord(String text, String word) {
        int frequencyWord = researchText(text).containsKey(word)
                ? researchText(text).get(word)
                : 0;
        return frequencyWord;
    }

    public NavigableMap<String, Integer> getFrequencyWords(String text, boolean isAscendingFrequency) {
        NavigableMap<String, Integer> sortedFrequencyWords = new TreeMap<>(researchText(text));
        return isAscendingFrequency
                ? sortedFrequencyWords
                : sortedFrequencyWords.descendingMap();
    }
}
