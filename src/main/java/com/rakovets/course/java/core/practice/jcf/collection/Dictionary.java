package com.rakovets.course.java.core.practice.jcf.collection;

import java.util.*;

public class Dictionary {
    public static boolean ASC = true;
    public static boolean DESC = false;
    private Map<String, String> dictionary;
    private Map<String, Integer> counterMap;

    public Map<String, String> getDictionary() {
        return dictionary;
    }

    public void setDictionary(Map<String, String> dictionary) {
        this.dictionary = dictionary;
    }

    public Dictionary() {
        counterMap = new HashMap<>();
        dictionary = new HashMap<>();
    }

    public Dictionary(HashMap<String, String> initDictionary) {
        counterMap = new HashMap<>();
        dictionary = initDictionary;
    }

    public void addToDictionary(String word, String translate) {
        if (!dictionary.containsKey(word)) {
            dictionary.put(word, translate);
        }
    }

    public void addTranslate(String word, String translate) {
        if (dictionary.containsKey(word)) {
            dictionary.put(word, dictionary.get(word) + ", " + translate);
        }
    }

    public void changeTranslate(String word, String translate) {
        if (dictionary.containsKey(word)) {
            dictionary.put(word, translate);
        }
    }

    public void removeTranslate(String word, String translate) {
        if (dictionary.containsKey(word)) {
            dictionary.put(word, "");
        }
    }

    public void addWord(String word) {
        if (dictionary.containsKey(word)) {
            dictionary.put(word, "");
        }
    }

    public void changeWord(String word, String newWord) {
        if (dictionary.containsKey(word)) {
            dictionary.put(newWord, dictionary.get(word));
            removeWord(word);
        }
    }

    public void removeWord(String word) {
        if (dictionary.containsKey(word)) {
            dictionary.remove(word);
        }
    }

    public String getTranslate(String word) {
        if (dictionary.containsKey(word)) {
            changeCounter(word);
            return dictionary.get(word);
        }
        return null;
    }

    public void changeCounter(String word) {
        int counter = 1;
        if (counterMap.containsKey(word)) {
            counter = counterMap.get(word) + 1;
        }
        counterMap.put(word, counter);
    }

    public Map<String, Integer> get10TopPopular() {
        return getSortedMapByValue(counterMap, DESC);
    }

    public Map<String, Integer> get10TopUnpopular() {
        return getSortedMapByValue(counterMap, ASC);
    }

    public Map<String, Integer> getSortedMapByValue(Map<String, Integer> unsortMap, final boolean order) {
        List<Map.Entry<String, Integer>> list = new ArrayList<>(unsortMap.entrySet());
        list.sort(Map.Entry.comparingByValue());
        if (!order) {
            Collections.reverse(list);
        }
        Map<String, Integer> result = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : list) {
            result.put(entry.getKey(), entry.getValue());
            if (result.size() == 10) {
                return result;
            }
        }

        return result;
    }

    public static void printMap(Map<String, Integer> map) {
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Word : " + entry.getKey() + " Translate : " + entry.getValue());
        }
    }
}
