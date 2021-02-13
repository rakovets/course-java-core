package com.rakovets.course.java.core.practice.jcf.collection;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Dictionary {
    private Map<String,String> dictionary;
    private Map<String, Integer> counterTop;

    public Dictionary(Map<String, String> dictionary, Map<String, Integer> counterTop) {
        this.dictionary = dictionary;
        this.counterTop = counterTop;
    }

    public Dictionary(Map<String, String> dictionary, Map<String, Integer> counterTop, String firstWord, String firstTranslate) {
        this.counterTop = counterTop;
        this.dictionary = dictionary;
        dictionary.put(firstWord, firstTranslate);
    }

    public boolean putNewWordAndTranslate(String word, String translate) {
        if (dictionary.containsKey(word)) {
            return false;
        } else {
            dictionary.put(word, translate);
            return true;
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

    public void removeTranslate(String word) {
        if (dictionary.containsKey(word)) {
            dictionary.put(word, "");
        }
    }

    public String getTranslate(String word) {
        if (dictionary.containsKey(word)) {
            if (counterTop.get(word) == null) {
                counterTop.put(word, 1);
                return dictionary.get(word);
            } else {
                counterTop.put(word, counterTop.get(word) + 1);
                return dictionary.get(word);
            }
        } else {
            return "No such word in dictionary. Try again";
        }
    }

    public boolean addNewWord(String word) {
        if (dictionary.containsKey(word)) {
            return false;
        } else {
            dictionary.put(word, "");
            return true;
        }
    }

    public void changeWord(String word, String newWord) {
        if (dictionary.containsKey(word)) {
            dictionary.put(newWord, dictionary.remove(word));
        }
    }

    public void removeWord(String word) {
        if (dictionary.containsKey(word)) {
            dictionary.entrySet().removeIf(entry -> word.equals(entry.getKey()));
        }
    }

    public Map<String, Integer> getTopPopularWords() {
        List<Map.Entry<String, Integer>> list = new ArrayList<>(counterTop.entrySet());
        list.sort(Map.Entry.<String, Integer>comparingByValue().reversed());
        Map<String, Integer> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
            if (sortedMap.size() == 10) {
                return sortedMap;
            }
        }
        return sortedMap;
    }

    public Map<String, Integer> getTopNotPopularWords() {
        List<Map.Entry<String, Integer>> list = new ArrayList<>(counterTop.entrySet());
        list.sort(Map.Entry.comparingByValue());
        Map<String, Integer> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
            if (sortedMap.size() == 10) {
                return sortedMap;
            }
        }
        return sortedMap;
    }

    public Map<String, String> getDictionary() {
        return dictionary;
    }

    public void setDictionary(Map<String, String> dictionary) {
        this.dictionary = dictionary;
    }

    @Override
    public String toString() {
        return "Dictionary{" +
                "dictionary=" + dictionary +
                '}';
    }


}
