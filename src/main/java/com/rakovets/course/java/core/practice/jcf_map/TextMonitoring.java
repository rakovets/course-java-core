package com.rakovets.course.java.core.practice.jcf_map;

import java.util.*;

public class TextMonitoring {
    private Map<String, Integer> mapForText = new HashMap<>();

    public void researchText(String text) {
        int index = 1;
        text = text.replaceAll("[.,!?:;]", " ");
        String[] words = text.split(" ");
        for (String i : words) {
            if (mapForText.containsKey(i)) {
                index = mapForText.get(i);
                mapForText.put(i, ++index);
            } else {
                mapForText.put(i, index);
            }
        }
    }


    public int getCountUniqueWords() {
        return mapForText.size();
    }


    public Set<String> getUniqueWords() {
        return mapForText.keySet();
    }

    public int getFrequencyWord(String word) {
        return mapForText.get(word);
    }


    public Collection<Map.Entry<String, Integer>> getFrequencyWords(boolean frequencyOfWord) {
        List<Map.Entry<String, Integer>> list = new ArrayList<>(mapForText.entrySet());
        if (frequencyOfWord) {
            list.sort(new StrComparator());
        } else {
            list.sort(new StrReverseComparator());
        }
        return list;
    }

    @Override
    public String toString() {
        return "TextMonitoring{" + mapForText + '}';
    }
}



