package com.rakovets.course.java.core.practice.jcf_map;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextMonitoring {
    Map<String, Integer> counterWords;

    public TextMonitoring(){
        counterWords = new HashMap<>();
    }
    public void researchText(String text){
        List<String> words = new ArrayList<>();
        Pattern pattern = Pattern.compile("[a-zA-Zа-яА-Я0-9]+");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            words.add(matcher.group());
        }
        System.out.println(words.toString());

        int tempValue = 0;
        for (String word : words) {
            if (counterWords.containsKey(word)) {
                tempValue = counterWords.get(word) + 1;
                counterWords.put(word, tempValue);
            } else{
                counterWords.put(word, 1);
            }
        }

    }

    @Override
    public String toString() {
        return "TextMonitoring{" +
                "counterWords=" + counterWords +
                '}';
    }
}
