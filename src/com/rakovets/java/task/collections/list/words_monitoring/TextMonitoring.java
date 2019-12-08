package com.rakovets.java.task.collections.list.words_monitoring;


import java.util.*;

public class TextMonitoring {

    public static Map<String, Integer> researchText(String str) {
        String[] arrayOfWords = str.split(" ");
        Map<String, Integer> mapWithWords = new HashMap<>();
        for (String word : arrayOfWords) {
            if (mapWithWords.containsKey(word)) {
                int countOfThisWord = mapWithWords.get(word);
                mapWithWords.put(word, countOfThisWord + 1);
            } else {
                mapWithWords.put(word, 1);
            }
        }
        return mapWithWords;
    }

    public Collection<String> getUniqueWords(String str) {
        String[] arrayOfWords = str.split(" ");
        List<String> listWithUniqueWords = new ArrayList<>();
        for (String word : arrayOfWords) {
            if (listWithUniqueWords.indexOf(word) == -1) {
                listWithUniqueWords.add(word);
            }
        }
        return listWithUniqueWords;
    }

    public int getCountUniqueWords(String str) {
        return getUniqueWords(str).size();
    }

    public int get(String str, String word) {
        Map<String, Integer> map = researchText(str);
        return map.get(word);
    }

    public List<Map.Entry<String, Integer>> print(String str) {
        Map<String, Integer> map = researchText(str);
        List<Map.Entry<String, Integer>> list = new ArrayList(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> a, Map.Entry<String, Integer> b) {
                return (a.getValue() - b.getValue()) * -1;
            }
        });
        return list;
    }


}
