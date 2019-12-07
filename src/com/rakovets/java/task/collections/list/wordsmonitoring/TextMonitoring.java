package com.rakovets.java.task.collections.list.wordsmonitoring;

import java.util.*;
import java.util.Map.Entry;

public class TextMonitoring {

    public int getCountUniqueWords(String text) {
        Collection<String> collection = getUniqueWords(text);
        return collection.size();
    }

    public Collection<String> getUniqueWords(String text) {
        String[] words = text.split(" ");
        List<String> list = Arrays.asList(words);
        Set<String> uniqueWords = new HashSet<>();
        uniqueWords.addAll(list);
        return uniqueWords;
    }

    public Map<String, Integer> researchText(String text) {
        Map<String, Integer> map = new HashMap<>();
        String[] words = text.split(" ");
        for (String word : words) {
            if (map.containsKey(word)) {
                int count = map.get(word);
                map.put(word, count + 1);
            } else {
                map.put(word, 1);
            }
        }
        return map;
    }

    public int get(String text) {
        Map<String, Integer> map = researchText(text);
        int wordCount = map.getOrDefault("word", 0);
        return wordCount;
    }

    public List<Entry<String, Integer>> print(String text) {
        Map<String, Integer> map = researchText(text);
        List<Entry<String, Integer>> list = new ArrayList<>();
        list.addAll(map.entrySet());
        list.sort((o1, o2) -> o1.getValue().compareTo(o2.getValue()) * -1);
        return list;
    }
}
