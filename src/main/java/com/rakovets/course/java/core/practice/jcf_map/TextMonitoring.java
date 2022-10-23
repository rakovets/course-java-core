package com.rakovets.course.java.core.practice.jcf_map;

import com.rakovets.course.java.core.util.NumberUtil;

import java.util.*;

public class TextMonitoring {
    public Map<String, Double> researchText(String str) {
        String[] text = str.replaceAll("[.,!?;:+'\"]", "").trim().split(" +");
        Map<String, Double> words = new HashMap<>();
        for (String s : text) {
            double count = 0.0;
            double frequency = 0.0;
            for (String value : text) {
                if (s.equals(value)) {
                    count++;
                }
                frequency = NumberUtil.roundValueToTwoDigitsForMantissa(count / text.length);
            }
            words.put(s, frequency);
        }
        return words;
    }

    public int getCountUniqueWords(String str) {
        return researchText(str).size();
    }

    public Set<String> getUniqueWords(String str) {
        return researchText(str).keySet();
    }

    public double getFrequencyWord(String str, String word) {
        return researchText(str).get(word);
    }

    public NavigableMap<String, Double> getFrequencyWords(String str, boolean isAscendingFrequency) {
        NavigableMap<String, Double> sorted = new TreeMap<>(researchText(str));
        return isAscendingFrequency ? sorted : sorted.descendingMap();
    }
}
