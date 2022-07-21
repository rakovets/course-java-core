package com.rakovets.course.java.core.practice.jcf_map;

import java.util.*;

public class TextMonitoringDemo {
    public static void main(String[] args) {
        Map<String, Integer> wordsMap = new HashMap<>();
        wordsMap.put("word", 1);
        wordsMap.put("Word", 1);
        System.out.println(wordsMap.containsKey("word"));



        String text = "word sdgsgsdgs,,!  !afs asf Word";
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
    }
}
