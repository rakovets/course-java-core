package com.rakovets.course.java.core.practice.jcf_map;

import java.util.*;

public class TextMonitoring {
    private Map<String,Integer>mapText;

    public TextMonitoring() {
        mapText = new HashMap<>();
    }

    public String getMapText() {
        return mapText.toString();
    }

    public  void researchText(String text) {
        text= text.replaceAll("[,.?!:-]","");
        String[] words = text.split("\\s+");
        int numberOfRepetitions = 0;
        for(String word : words) {
            if (!mapText.containsKey(word)) {
                mapText.put(word , 1);
            } else {
                numberOfRepetitions = mapText.get(word) + 1;
                mapText.put(word,numberOfRepetitions );
            }
        }
    }

    public int getCountUniqueWords() {
        int numberOfUniqueWords = 0;
        for(Map.Entry<String,Integer> numberOfRepetitions : mapText.entrySet()) {
            if(numberOfRepetitions.getValue() == 1) {
                numberOfUniqueWords += 1;
            }
        }
        return numberOfUniqueWords;
    }

    public Collection<String> getUniqueWords() {
        Collection<String> uniqueWordsList = new ArrayList<>();
        for(Map.Entry<String,Integer> numberOfRepetitions : mapText.entrySet()) {
            if(numberOfRepetitions.getValue() == 1) {
                uniqueWordsList.add(numberOfRepetitions.getKey());
            }
        }
        return uniqueWordsList;
    }

    public int getFrequencyWord(String word) {
        return mapText.get(word);
    }

    public List<Map.Entry<String, Integer>> getFrequencyWords(boolean isAscendingFrequency) {
        List<Map.Entry<String, Integer>> list = new ArrayList<>(mapText.entrySet());

        if (isAscendingFrequency)
            list.sort(new StringOrderComparator());
        else {
            list.sort(new StringReverseOrderComparator());
        }
        return list;
    }




}
