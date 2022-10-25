package com.rakovets.course.java.core.practice.jcf_map.word_monitoring;

import java.util.*;

import static java.util.Map.Entry.comparingByValue;
import static java.util.stream.Collectors.toMap;

public class TextMonitoring {
    private Map<String, Integer> map;

    public void researchText(String text) {
        String[] word = text.split(" ");
        map = new HashMap<>();
        for (String d : word) {
            if (map.containsKey(d)) {
                map.put(d, map.get(d) + 1);
            } else {
                map.put(d, 1);
            }
        }
    }

    public int getCountUniqueWords() {
        return map.size();
    }

    public Collection<String> getUniqueWords() {
        return map.keySet();
    }

    public Integer getFrequencyWord(String word) {
        return map.get(word);
    }

    public Map<String, Integer> getFrequencyWords(boolean isAscendingFrequency) {
        Map<String, Integer> map1 = new HashMap<>(map);
        if (isAscendingFrequency) {
            return map1.entrySet()
                    .stream()
                    .sorted(comparingByValue())
                    .collect(
                            toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2,
                                    LinkedHashMap::new));
        } else {
            return map1.entrySet()
                    .stream()
                    .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                    .collect(
                            toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2,
                                    LinkedHashMap::new));
        }
    }
}
