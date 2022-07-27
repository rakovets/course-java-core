package com.rakovets.course.java.core.practice.jcf_map;

import java.util.Map;
import java.util.HashMap;
import java.util.Collections;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Collection;

public class TextMonitoring {
    public static Map<String, Integer> researchText(String text) {
        Map<String, Integer> words = new HashMap<>();
        String rawText = text.replaceAll("[^A-Za-z'\\s]", "");
        String[] word = rawText.trim().split("\\s{1,}");
        for (int i = 0; i < word.length; i++) {
            if (words.containsKey(word[i])) {
                int count = words.get(word[i]) + 1;
                words.replace(word[i], count);
            } else words.put(word[i], 1);
        }
        return words;
    }

    public static int getCountUniqueWords(String text) {
        int uniqueWordsCounter = 0;
        Map<String, Integer> words = researchText(text);
        for (Map.Entry<String, Integer> m : words.entrySet()) {
            uniqueWordsCounter++;
        }
        return uniqueWordsCounter;
    }

    public static Collection<String> getUniqueWords(String text) {
        Collection<String> uniqueWords = new ArrayList<>();
        Map<String, Integer> words = researchText(text);
        for (Map.Entry<String, Integer> m : words.entrySet()) {
            uniqueWords.add(m.getKey());
        }
        return uniqueWords;
    }

    public static int getFrequencyWord(String word, String text) {
        int wordFrequencyCounter = 0;
        Map<String, Integer> words = researchText(text);
        for (Map.Entry<String, Integer> m : words.entrySet()) {
            if (Objects.equals(m.getKey(), word)) {
                wordFrequencyCounter = m.getValue();
            }
        }
        return wordFrequencyCounter;
    }

    public static Map<String, Integer> getFrequencyWords(String text, boolean isAscendingFrequency) {
        List<Map.Entry<String, Integer>> list = new ArrayList<>(researchText(text).entrySet());
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
        if (!isAscendingFrequency) {
            Collections.sort(list, Comparator.comparing(Map.Entry::getValue));
            Collections.reverse(list);
            for (Map.Entry<String, Integer> entry : list) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        } else {
            Collections.sort(list, Comparator.comparing(Map.Entry::getValue));
            for (Map.Entry<String, Integer> entry : list) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }
}
