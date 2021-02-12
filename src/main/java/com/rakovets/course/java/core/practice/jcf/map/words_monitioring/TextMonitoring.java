package com.rakovets.course.java.core.practice.jcf.map.words_monitioring;

import java.util.*;

public class TextMonitoring {
    public Map<String, Integer> researchText(String string) {
        Map<String, Integer> map = new HashMap<>();
        for (String str : string.split("[^A-Za-z]+")) {
            map.put(str, map.getOrDefault(str, 0) + 1);
        }
        return map;
    }

    public int getCountUniqueWords(String string) {
        List<Map.Entry<String, Integer>> list = new LinkedList<>(researchText(string).entrySet());
        return list.size();
    }

    public Collection<Map.Entry<String, String>> getUniqueWords(String string) {
        Map<String, String> map = new HashMap<>();
        for (String str : string.split("[^A-Za-z]+")) {
            map.put(str, "unique");
        }
        return new LinkedList<>(map.entrySet());
    }

    public int getFrequencyWord(String string, String word) {
        Map<String, Integer> map = new HashMap<>();
        for (String str : string.split("[^A-Za-z]+")) {
            map.put(str, map.getOrDefault(str, 0) + 1);
        }
        return map.getOrDefault(word, 0);
    }

    public List<Map.Entry<String, Integer>> getFrequencyWordAscending(String string, Boolean isAscendingFrequency) {
        List<Map.Entry<String, Integer>> list = new LinkedList<>(researchText(string).entrySet());
        if (isAscendingFrequency) {
            list.sort((Comparator.comparingInt(Map.Entry::getValue)));
        } else {
            list.sort((o1, o2) -> o2.getValue() - o1.getValue());
        }
        return list;
    }
}
