package com.rakovets.course.java.core.practice.jcf.map;

import java.util.*;

public class TextMonitoring {
    public static Map<String, Integer> researchText(String text) {
        Map<String, Integer> wordCounts = new HashMap<>();

        for (String word : text.split("[^A-Za-zА-Яа-я]")) {
            if (word.length() > 0) {
                wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
            }
        }
        return wordCounts;
    }

    public static int getCountUniqueWords(String text) {
        return researchText(text).size();
    }

    public static Collection<String> getUniqueWords(String text) {
        return researchText(text).keySet();
    }

    public static int getFrequencyWord(String text, String word) {
        return researchText(text).get(word);
    }

    public static Collection<Map.Entry<String, Integer>> getFrequencyWords(String text, String word, boolean isAscendingFrequency) {
        List<Map.Entry<String, Integer>> list = new ArrayList<>(researchText(text).entrySet());

        if (isAscendingFrequency) {
            list.sort(new Comparator<>() {
                @Override
                public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                    if (o1 == o2) {
                        return 0;
                    } else {
                        return Integer.compare(o1.getValue(), o2.getValue());
                    }
                }
            });
        } else {
            list.sort(new Comparator<>() {
                @Override
                public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                    if (o1 == o2) {
                        return 0;
                    } else {
                        return Integer.compare(o2.getValue(), o1.getValue());
                    }
                }
            });
        }
        return list;
    }
}
