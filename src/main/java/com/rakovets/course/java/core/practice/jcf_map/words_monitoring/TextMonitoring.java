package com.rakovets.course.java.core.practice.jcf_map.words_monitoring;

import java.util.Map;
import java.util.*;

public class TextMonitoring {
    private Map<String, Integer> text;

    public Map<String, Integer> getMap() {
        return text;
    }

    public void researchText(String string) {
        String textToArray = string.replaceAll("[,.&!@?]", "");
        String[] textInArray = textToArray.split(" ");
        text = new HashMap<>();
        for (String word : textInArray) {
            if (text.containsKey(word))
                text.put(word, text.get(word) + 1);
            else
                text.put(word, 1);
        }
    }

    public int getCountUniqueWords() {
        return text.size();
    }

    public Collection<String> getUniqueWords() {
        return text.keySet();
    }

    public int getFrequencyWord(String word) {
        return text.get(word);
    }

    public Map<String, Integer> getFrequencyWords(boolean isAscendingFrequency) {
        List<Map.Entry<String, Integer>> list = new ArrayList<>(text.entrySet());
        Map<String, Integer> resultArray = new LinkedHashMap<>();

        if (isAscendingFrequency)
            list.sort(Map.Entry.comparingByValue());
        else {
            list.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));
        }

        for (Map.Entry<String, Integer> entry : list) {
            resultArray.put(entry.getKey(), entry.getValue());
        }
        return resultArray;
    }
}
