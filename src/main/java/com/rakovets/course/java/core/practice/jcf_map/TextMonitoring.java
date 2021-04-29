package com.rakovets.course.java.core.practice.jcf_map;

import java.util.*;

public class TextMonitoring {
    private Map<String, Integer> researchedText = new HashMap<>();

    public Map<String, Integer> getResearchedText() {
        return researchedText;
    }

    public void researchText(String text) {
        researchedText.clear();
        text = text.replaceAll("[,.?!:;]", "");
        while (text.contains("  ")) {
            text = text.replaceAll(" {2}", " ");
        }
        String[] words = text.split(" ");
        for(String word : words) {
            if (!researchedText.containsKey(word)) {
                researchedText.putIfAbsent(word, 1);
            } else {
                researchedText.put(word, researchedText.get(word) + 1);
            }
        }
    }

    public int getCountUniqueWords() {
        return researchedText.size();
    }

    public Collection<String> getUniqueWords() {
        return researchedText.keySet();
    }

    public int getFrequencyWord(String word) {
        return researchedText.get(word);
    }

    public List<Map.Entry<String, Integer>> getFrequencyWords(boolean isAscendingFrequency) {
        List<Map.Entry<String, Integer>> list = new ArrayList<>(researchedText.entrySet());

        if (isAscendingFrequency)
            list.sort(new StringComparator());
        else {
            list.sort(new StringInReverseOrderComparator());
        }
        return list;
    }

    @Override
    public String toString() {
        return "TextMonitoring{" + researchedText +
                '}';
    }
}
