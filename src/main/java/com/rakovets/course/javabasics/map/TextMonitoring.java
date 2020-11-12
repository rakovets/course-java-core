package com.rakovets.course.javabasics.map;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public final class TextMonitoring {

    public static HashMap<String, Integer> researchText(String text) {

        String[] textArray = text.split("[^a-zA-Z]+");
        HashMap<String, Integer> textMap = new HashMap<>();
        for (String word : textArray) {
            if (textMap.containsKey(word)) {
                int count = textMap.get(word);
                count++;
                textMap.put(word, count);
            } else {
                textMap.put(word, 1);
            }
        }
        return textMap;
    }

    public static int getCountUniqueWords(String text) {

        HashMap<String, Integer> newmap = researchText(text);
        int count = 0;
        for (Map.Entry<String, Integer> item : newmap.entrySet()) {
            if (item.getValue() == 1) {
                count++;
            }
        }
        return count;
    }

    public static LinkedList<String> getUniqueWords(String text) {

        HashMap<String, Integer> newmap = researchText(text);
        LinkedList<String> result = new LinkedList<>();
        for (Map.Entry<String, Integer> item : newmap.entrySet()) {
            if (item.getValue() == 1) {
                result.add(item.getKey());
            }
        }
        return result;
    }

    public static int getWork(String text, String checkingWord) {

        int result = 0;
        for (Map.Entry<String, Integer> item : researchText(text).entrySet()) {
            if (item.getKey().equals(checkingWord)) {
                result = item.getValue();
            }
        }
        return result;
    }
}



