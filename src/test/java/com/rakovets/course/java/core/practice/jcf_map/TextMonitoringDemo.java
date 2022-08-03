package com.rakovets.course.java.core.practice.jcf_map;

import java.util.HashMap;
import java.util.Map;

public class TextMonitoringDemo {
    public static void main(String[] args) {
        Map<String, Integer> wordsMap = new HashMap<>();
        wordsMap.put("hi", 1);
        wordsMap.put("Hi", 1);
        System.out.println(wordsMap.containsKey("hi"));



        String text = "Hi abc  ! What up, hi";
        String pureText = text.replaceAll("['.,?!:;]", " ");
        String[] textIntoWords = pureText.trim().split("\\s{1,}");

        for (String word : textIntoWords) {
            if (wordsMap.containsKey(word)) {
                int wordCount = wordsMap.get(word) + 1;
                wordsMap.put(word, wordCount);
            } else {
                wordsMap.put(word, 1);
            }
        }


        System.out.println(wordsMap);
        System.out.println(wordsMap.entrySet());
        TextMonitoring textMonitoring = new TextMonitoring();
        text = "Hi 1, hi 4, Java 8;!$$% _ word ?-_, word, Java Java hello Java  ";

        System.out.println("Total unique words: " + textMonitoring.getCountUniqueWords(text));
        System.out.println("Unique words: " + textMonitoring.getUniqueWords(text));
        System.out.println("Word 'Java' repeats times: " + textMonitoring.getFrequencyWord(text, "Java"));
        System.out.println(textMonitoring.getFrequencyWords(text, true));
        System.out.println(textMonitoring.getFrequencyWords(text, false));
    }
}
