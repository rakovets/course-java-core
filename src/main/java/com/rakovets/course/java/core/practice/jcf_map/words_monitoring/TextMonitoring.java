package com.rakovets.course.java.core.practice.jcf_map.words_monitoring;

import java.util.*;

public class TextMonitoring {
    public Map<String, Double> researchText(String inputText) {
        double frequency = 0.0;
        double counter = 0.0;
        Map<String, Double> wordsFrequencyTheyOccur = new HashMap<>();

        String[] convertedInputTextArray = inputText.
                replaceAll("[{.,!?_()&%#;:}*@+'\'\"]", "").
                replaceAll("-", "").
                trim().
                split(" +");

        for (String word : convertedInputTextArray) {
            for (String wordComparison : convertedInputTextArray) {
                if (word.equals(wordComparison)) {
                    counter++;
                }
                frequency = Math.round(counter / convertedInputTextArray.length);
            }
            wordsFrequencyTheyOccur.put(word, frequency);
        }
        return wordsFrequencyTheyOccur;
    }

    public int getCountUniqueWords(String inputText) {
        return researchText(inputText).size();
    }

    public Set<String> getUniqueWords(String inputText) {
        return researchText(inputText).keySet();
    }

    public double getFrequencyWord(String inputText, String word) {
        return researchText(inputText).get(word);
    }

    public NavigableMap<String, Double> getFrequencyWords(String inputText, boolean isAscendingFrequency) {
        NavigableMap<String, Double> navigableMap = new TreeMap<>(researchText(inputText));
        return isAscendingFrequency ? navigableMap : navigableMap.descendingMap();
    }
}
