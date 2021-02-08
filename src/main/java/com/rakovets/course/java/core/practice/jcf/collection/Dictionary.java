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

    public String putNewWordAndTranslate(String word, String translate) {
        if (dictionary.containsKey(word)) {
            return word + ": this word already in dictionary. You can add/delete translate if you want";
        } else {
            dictionary.put(word, translate);
            return word + " added in dictionary";
        }
    }

    public String addTranslate(String word, String translate) {
        if (dictionary.containsKey(word)) {
            dictionary.put(word, dictionary.get(word) + ", " + translate);
            return word + ": add " + translate + " to translate";
        } else {
            return word + ": no such word in dictionary";
        }
    }

    public String changeTranslate(String word, String translate){
        if (dictionary.containsKey(word)) {
            dictionary.put(word, translate);
            return word + ": changed translate on " + translate;
        } else {
            return word + ": no such word in dictionary";
        }
    }

    public String removeTranslate(String word, String translate){
        if (dictionary.containsKey(word)) {
            dictionary.put(word, dictionary.remove(word));
            return word + ": all translate removed ";
        } else {
            return word + ": no such word in dictionary";
        }
    }

    public String getTranslate(String word) {
        if (dictionary.containsKey(word)) {
            if (counterTop.get(word) == null) {
                counterTop.put(word, 1);
                return word + ": " + dictionary.get(word);
            } else {
                counterTop.put(word, counterTop.get(word) + 1);
                return word + ": " + dictionary.get(word);
            }
        } else {
            return "No such word in dictionary. Try again";
        }

    }

    public String addNewWord(String word) {
        if (dictionary.containsKey(word)) {
            return "This word already in dictionary";
        } else {
            return dictionary.put(word, "");
        }
    }

    public String changeWord(String word){
        if (dictionary.containsKey(word)) {
            dictionary.put(word, dictionary.get(word));
            return word + ": changed";
        } else {
            return word + ": no such word in dictionary";
        }
    }

    public String removeWord(String word){
        if (dictionary.containsKey(word)) {
            dictionary.entrySet().removeIf(entry -> word.equals(entry.getKey()));
            return word + ": removed ";
        } else {
            return word + ": no such word in dictionary";
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
