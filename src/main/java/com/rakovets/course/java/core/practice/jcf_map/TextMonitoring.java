package com.rakovets.course.java.core.practice.jcf_map;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextMonitoring {
    private Map<String, Integer> researchedText;
    private String text;

    public TextMonitoring(Map<String, Integer> researchedText, String text) {
        this.researchedText = researchedText;
        this.text = text;
    }

    public void researchText(String text) {
        researchedText.clear();

        Pattern pattern = Pattern.compile("[^\\w | \\s]");
        Matcher matcher = pattern.matcher(text);
        String newText = matcher.replaceAll("");
        String[] words = newText.split(" ");

        for(String word : words) {
            int numberRepetitions = 0;
            if (!researchedText.containsKey(word)) {
                researchedText.put(word, 1);
            } else {
                numberRepetitions = researchedText.get(word) + 1;
                researchedText.put(word, numberRepetitions);
            }
        }
    }

    public int getCountUniqueWords() {
        return researchedText.size();
    }

    public Set<String> getUniqueWords() {
        return researchedText.keySet();
    }

    public int getFrequencyWord(String word) {
        return researchedText.get(word);
    }
}
