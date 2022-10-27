package com.rakovets.course.java.core.practice.jcf_map.project_words_monitoring;

import java.util.*;

public class TextMonitoring {
    public Map<String, Integer> researchText(String text) {
        String textWithoutPunctuations = text.replaceAll("\\p{Punct}", "");
        String[] wordArray = textWithoutPunctuations.split(" ");
        Map<String, Integer> uniqueWords = new HashMap<>();
        for (String s : wordArray) {
            if (!s.isBlank()) {
                Integer i = 1;
                Integer j = uniqueWords.put(s, i);
                if (j != null) {
                    j++;
                    uniqueWords.put(s, j);
                }
            }
        }
        return uniqueWords;
    }

    public int getCountUniqueWords(String text) {
        return researchText(text).size();
    }

    public Set<String> getUniqueWords(String text) {
        return researchText(text).keySet();
    }

    public int getFrequencyWord(String text, String word) {
        return researchText(text).get(word);
    }

    public SortedMap<String, Integer> getFrequencyWords(String text, boolean isAscendingFrequency) {
        if (isAscendingFrequency) {
            SortedMap<String, Integer> sortedUniqueWords = new TreeMap<>(researchText(text));
            return sortedUniqueWords;
        } else {
            SortedMap<String, Integer> reverseSortedUniqueWords = new TreeMap<>(new UniqueWordsComparator());
            reverseSortedUniqueWords.putAll(researchText(text));
            return reverseSortedUniqueWords;
        }
    }

    public void printMapInMyFormat(Map<String, Integer> map) {
        for (Map.Entry m : map.entrySet()) {
            System.out.print(m.getKey() + " " + m.getValue() + ", ");
        }
        System.out.println();
    }
}
