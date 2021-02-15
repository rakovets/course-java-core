package com.rakovets.course.java.core.practice.jcf.map;

import java.util.*;

public class TextMonitoring {
    public static Map<String, Integer> researchText(String string) {
        Map<String, Integer> words = new HashMap<>();
        String[] arrayWords = string.split("\\s");
        for (String key: arrayWords) {
            if (words.containsKey(key)) {
                words.put(key, words.get(key) + 1);
            } else {
                words.put(key, 1);
            }
        }
        return words;
    }

    public static  int getCuntUniqueWords(String string) {
        Map<String, Integer> uniqueWords = researchText(string);
        Set<String> wordsSet = uniqueWords.keySet();
        return wordsSet.size();
    }

    public Set<String> getUniqueWords(String string) {
        Map<String, Integer> uniqueWords = researchText(string);
        return uniqueWords.keySet();
    }

    public static int getFrequencyWord(String string, String word) {
        Map<String, Integer> uniqueWords = researchText(string);
        return uniqueWords.get(word);
    }

    public static List<Map.Entry<String, Integer>> getFrequencyWords(boolean isAscendingFrequency, String string) {
        List<Map.Entry<String, Integer>> list = new ArrayList<>(researchText(string).entrySet());
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
        System.out.println(list);
        return list;
    }
}
