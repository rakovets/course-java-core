package com.rakovets.course.javabasics.example.generics.model.map;

import java.util.*;

public class TextMonitoring {
    private Map<String, Integer> map;

    public void researchText(String text) {
        String[] array = text.split(" ");
        map = new HashMap<>();
        for (String word : array) {
            if (map.containsKey(word)) {
                int key = map.get(word);
                map.put(word, ++key);
            }
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

    public int get(String word) {
        return map.get(word);
    }

    public Map<String, Integer> getWordFrequencyDesc(boolean isAscendingFrequency) {
        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        if (isAscendingFrequency)
            list.sort(Map.Entry.comparingByValue());
        else list.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));

        Map<String, Integer> result = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : list) {
            result.put(entry.getKey(), entry.getValue());
        }
        return result;
    }
}
