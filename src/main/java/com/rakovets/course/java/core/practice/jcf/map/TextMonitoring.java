package com.rakovets.course.java.core.practice.jcf.map;

import java.util.*;

public class TextMonitoring {
    public static Map<String, Integer> researchText(String str){
        Map<String, Integer> repeatedWords = new HashMap<>();
        String[] words = str.split("\\s*\\W\\s*");
        for (String word : words) {
            if (repeatedWords.containsKey(word)) {
                repeatedWords.put(word, repeatedWords.get(word) + 1);
            } else {
                repeatedWords.put(word, 1);
            }
        }
        return repeatedWords;
    }

    public static int getCountUniqueWords(String str) {
        Set<Map.Entry<String, Integer>> set = researchText(str).entrySet();
        int count = 0;
        for (Map.Entry<String, Integer> me : set) {
            if (me.getValue() == 1) {
                count++;
            }
        }
        return count;
    }

    public static List<String> getUniqueWords(String str) {
        Set<Map.Entry<String, Integer>> set = researchText(str).entrySet();
        List<String> uniqueWords = new ArrayList<>();
        for (Map.Entry<String, Integer> me : set) {
            if (me.getValue() == 1) {
                uniqueWords.add(me.getKey());
            }
        }
        return uniqueWords;
    }

    public static int getFrequencyWord(String str, String word) {
        Set<Map.Entry<String, Integer>> set = researchText(str).entrySet();
        for (Map.Entry<String, Integer> me : set) {
            if (me.getKey().equals(word)) {
                return me.getValue();
            }
        }
        return 0;
    }

    public static void getFrequencyWords(boolean isAscendingFrequency, String str) {
    }
}
