package com.rakovets.course.java.core.practice;

import java.util.*;

public class TextMonitoring {
    private Map<String, Integer> map;

    public Map<String, Integer> getMap() {
        return map;
    }

    public void researchText(String text) {
        String textToArray = text.replaceAll("[,.&!@]", "");
        String[] textInArray = textToArray.split(" ");

        map = new HashMap<>();

        for (String word : textInArray) {
            if (map.containsKey(word))
                map.put(word, map.get(word) + 1);
            else
                map.put(word, 1);
        }
    }

    public int getCountUniqueWords() {
        return map.size();
    }

    public Set<String> getUniqueWords() {
        return map.keySet();
    }

    public int getFrequencyWord(String word) {
        return map.get(word);
    }

    public Map<String, Integer> getFrequencyWords(boolean isAscendingFrequency) {
        List<Map.Entry<String, Integer>> arrayList = new ArrayList(map.entrySet());
        Map<String, Integer> resultMap = new LinkedHashMap<>();
        arrayList.sort(Map.Entry.comparingByValue());

        if (isAscendingFrequency) {
            for (int i = 0; i < arrayList.size(); i++) {
                resultMap.put(arrayList.get(i).getKey(), arrayList.get(i).getValue());
            }
        } else {
            for (int i = arrayList.size() - 1; i >= 0; i--) {
                resultMap.put(arrayList.get(i).getKey(), arrayList.get(i).getValue());
            }
        }
        return resultMap;
    }
}



