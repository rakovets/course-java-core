package com.rakovets.course.java.core.practice.jcf_map.words_monitoring;

import java.util.*;

public class TextMonitoring {
    private Map<String, Integer> map = new HashMap<>();

    public void researchText(String text) {
        text = text.trim().replaceAll("[,.?!:;]", "");
        while (text.contains("  ")) {
            text = text.replaceAll(" {2}", " ");
        }
        String[] words = text.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (!map.containsKey(words[i])) {
                map.put(words[i], 1);
            } else {
                continue;
            }
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    map.put(words[i], map.get(words[i]) + 1);
                }
            }
        }
    }

    public int getCountUniqueWords() {
       return map.size();
    }

    public Set<String> getUniqueWords() {
        return map.keySet();
    }

    public Integer getFrequencyWord(String word) {
        return map.get(word);
    }

    public List getFrequencyWords(boolean isAscendingFrequency) {
        List list = new ArrayList(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> a, Map.Entry<Integer, Integer> b) {
                if (isAscendingFrequency) {
                    return a.getValue() - b.getValue();
                } else {
                    return b.getValue() - a.getValue();
                }
            }
        });
        return list;
    }

    public Map<String, Integer> getMap() {
        return map;
    }

    @Override
    public String toString() {
        return "TextMonitoring{" +
                "map=" + map +
                '}';
    }
}
