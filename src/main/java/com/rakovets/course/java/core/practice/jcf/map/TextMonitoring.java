package com.rakovets.course.java.core.practice.jcf.map;

import java.util.*;

public class TextMonitoring {
    private String text;
    private Map<String, Integer> map;

    public TextMonitoring(String text) {
        this.text = text;
        this.map = researchText(text);
    }

    public static Map<String, Integer> researchText(String text) {
        Map<String, Integer> wordCounts = new HashMap<>();

        for (String word : text.split("[^A-Za-zА-Яа-я]")) {
            if (word.length() > 0) {
                wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
            }
        }
        return wordCounts;
    }

    public int getCountUniqueWords() {
        return map.size();
    }

    public Collection<String> getUniqueWords() {
        return map.keySet();
    }

    public int getFrequencyWord(String word) {
        return map.get(word);
    }

    public Collection<Map.Entry<String, Integer>> getFrequencyWords(boolean isAscendingFrequency) {
        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());

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

    public String getText() {
        return text;
    }

    public Map<String, Integer> getMap() {
        return map;
    }

    public void setText(String text) {
        this.text = text;
        this.map = researchText(text);
    }
}
