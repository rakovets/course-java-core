package com.rakovets.course.java.core.practice.jcf_map;

import java.util.*;

public class TextMonitoring {

    public Map<String, Integer> researchText(String text) {
        Map<String, Integer> table = new HashMap<>();

        String[] words = text.split("\\s*(\\s|,|!|\\?|\\.)\\s*");
        for (String wrd : words) {
            int countIdenticalWords = 0;
            for (String word : words) {
                if (word.equals(wrd)) {
                    countIdenticalWords++;
                }
            }
            table.put(wrd, countIdenticalWords);
        }
        return table;
    }

    public int getCountUniqueWords(String text) {
        int countUniqueWords = 0;

        String[] words = text.split("\\s*(\\s|,|!|\\?|\\.)\\s*");
        for (String wrd : words) {
            int countIdenticalWords = 0;
            for (String word : words) {
                if (word.equals(wrd)) {
                    countIdenticalWords++;
                }
            }
            if (countIdenticalWords == 1) {
                countUniqueWords++;
            }
        }
        return countUniqueWords;
    }

    public Map<String, Integer> getUniqueWords(String text) {
        Map<String, Integer> table = new HashMap<>();

        String[] words = text.split("\\s*(\\s|,|!|\\?|\\.)\\s*");
        for (String wrd : words) {
            int countIdenticalWords = 0;
            for (String word : words) {
                if (word.equals(wrd)) {
                    countIdenticalWords++;
                }
            }
            if (countIdenticalWords == 1) {
                table.put(wrd, countIdenticalWords);
            }
        }
        return table;
    }

    public int getFrequencyWord(String text, String word) {
        int countWord = 0;

        String[] words = text.split("\\s*(\\s|,|!|\\?|\\.)\\s*");
        for (String wrd : words) {
            if (wrd.equals(word)) {
                countWord++;
            }
        }
        return countWord;
    }

    public Map<String, Integer> getFrequencyWord(String text, boolean isAscendingFrequency) {
        TreeMap<String, Integer> sortedText = new TreeMap<>();

        String[] words = text.split("\\s*(\\s|,|!|\\?|\\.)\\s*");
        for (String wrd : words) {
            int countIdenticalWords = 0;
            for (String word : words) {
                if (word.equals(wrd)) {
                    countIdenticalWords++;
                }
            }
            sortedText.put(wrd, countIdenticalWords);
        }
        if (!isAscendingFrequency) {
            return sortedText.descendingMap();
        }
        return sortedText;
    }
}
