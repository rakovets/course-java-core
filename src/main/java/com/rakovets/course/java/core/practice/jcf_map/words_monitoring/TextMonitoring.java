package com.rakovets.course.java.core.practice.jcf_map.words_monitoring;

import java.util.*;

public class TextMonitoring {
    private Map<String, Integer> map;

    public void researchText(String text) {
        String[] item = text.split(" ");
        map = new HashMap<>();
        for (String word : item) {
            if (map.containsKey(word))
                map.put(word, map.get(word) + 1);
            else
                map.put(word, 1);
        }
    }

    public int getCountUniqueWords() {
        return map.size();
    }

    public Set<String> getUniqueWords() {
        return map.keySet();
    }

    public int getFrequencyWord(String word) {
        return map.get(word);
    }

    public LinkedHashMap<String, Integer> getFrequencyWords(boolean isAscendingFrequency) {
        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        if (isAscendingFrequency) {
            list.sort(Map.Entry.comparingByValue());
        } else {
            list.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));
        }
        LinkedHashMap<String, Integer> result = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : list) {
            result.put(entry.getKey(), entry.getValue());
        }
        return result;
    }
}
