package com.rakovets.course.java.core.practice.jcf_map;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class TextMonitoring {
    private String text;
    private Map<String, Integer> wordMap;

    public TextMonitoring(String text) {
        this.text = text;
        this.wordMap = researchText(text);
    }

    public static Map<String, Integer> researchText(String string) {
        Pattern repentanceMarksDeleting = Pattern.compile(".,?;:");
        Matcher matcher = repentanceMarksDeleting.matcher(string);
        String examplePure = matcher.replaceAll("");

        String[] wordArray = examplePure.trim().split("\\s+");

        Map<String, Integer> wordMap = new HashMap<>();
        for (String word: wordArray) {
            Integer frequency = wordMap.get(word);
            wordMap.put(word, frequency == null ? 1 : frequency + 1);
        }
        return wordMap;
    }

    public int getCountUniqueWords(String word) {
        return this.wordMap.size();
    }

    public Collection<String> getUniqueWords() {
        return this.wordMap.keySet();
    }

    public int getFrequencyWord(String word) {
        if (this.wordMap.get(word) == null) {
            return 0;
        }
        return this.wordMap.get(word);
    }

    public Collection<Map.Entry<String, Integer>> getFrequencyWords(boolean isAscendingFrequency) {
        List<Map.Entry<String, Integer>> list = new ArrayList<>(this.wordMap.entrySet());
        if (isAscendingFrequency) {
            list.sort(new ComparatorAscendingFrequency());
        } else {
            list.sort(new CompareDescendingFrequency());
        }
        return list;
    }

    public String getText() {
        return text;
    }

    public Map<String , Integer> getWordMap() {
        return  wordMap;
    }

    public void setText(String text) {
        this.text = text;
        this.wordMap = researchText(text);
    }
}
