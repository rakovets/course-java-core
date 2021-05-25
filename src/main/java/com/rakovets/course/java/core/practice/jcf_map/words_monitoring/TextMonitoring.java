package com.rakovets.course.java.core.practice.jcf_map.words_monitoring;

import java.util.*;

public class TextMonitoring {
    private comparatorForHashMapValues compMapValues = new comparatorForHashMapValues();
    private Map<String, Integer> textList = new HashMap<>();

    public void researchText(String text) {
        int value = 1;
        text = text.replaceAll("[,.!?]", " ");
        String[] eachWords = text.split("\\s+");
        for (String i : eachWords) {
            if (textList.containsKey(i)) {
                value = textList.get(i);
                textList.put(i, ++value);
                value = 1;
            } else {
                textList.put(i, value);
            }
        }
    }

    public int getCountUniqueWords() {
        return textList.size();
    }

    public Collection<String> getUniqueWords() {
       return textList.keySet();
    }

    public int getFrequencyWord(String word) {
        return textList.get(word);
    }

    public List<Map.Entry<String, Integer>> getFrequencyWords(boolean isAscendingFrequency) {
        List<Map.Entry<String, Integer>> copy = new ArrayList<>(textList.entrySet());
        copy.sort(compMapValues);
        if (!isAscendingFrequency) {
            Collections.reverse(copy);
        }
        return copy;
    }

    public String getTextList() {
        return textList.toString();
    }
}
