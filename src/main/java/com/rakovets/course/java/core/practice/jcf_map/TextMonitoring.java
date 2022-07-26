package com.rakovets.course.java.core.practice.jcf_map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TextMonitoring {

    public Map<String, Integer> researchText(String text) {
        List<String> words = Arrays.asList(text.split("[\\pP\\s]+"));
        Set<String> unique = new HashSet<>(words);
        Map<String, Integer> result = new HashMap<>();
        for (String word : unique) {
            int counter = 0;
            for (String s : words) {
                if (word.equals(s)) {
                    counter++;
                }
            }
            result.put(word, counter);
        }
        return result;
    }

    public int getCountUniqueWords(String text) {
        int counter = 0;
        for (Integer numberRepetitions : researchText(text).values()) {
            if (numberRepetitions == 1) {
                counter++;
            }
        }
        return counter;
    }

    public Set<String> getUniqueWords(String text) {
        Set<String> unique = new HashSet<>();
        for (Map.Entry<String, Integer> entry : researchText(text).entrySet()) {
            if (entry.getValue() == 1) {
                unique.add(entry.getKey());
            }
        }
        return unique;
    }

    public int getFrequencyWord(String text, String word) {
        if (!researchText(text).containsKey(word)) {
            return 0;
        }
        return researchText(text).get(word);
    }

    public Map<String, Integer> getFrequencyWords(String text, boolean isAscendingFrequency) {
        List<Map.Entry<String, Integer>> list = new LinkedList<>(researchText(text).entrySet());
        if (isAscendingFrequency) {
            list.sort(new ByWordFrequency());
        } else {
            list.sort(new ByWordFrequency().reversed());
        }
        Map<String, Integer> result = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> e : list) {
            result.put(e.getKey(), e.getValue());
        }
        return result;
    }
}
