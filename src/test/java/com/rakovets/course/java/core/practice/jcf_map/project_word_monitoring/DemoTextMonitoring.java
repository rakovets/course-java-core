package com.rakovets.course.java.core.practice.jcf_map.project_word_monitoring;

import java.util.HashMap;
import java.util.Map;

public class DemoTextMonitoring {
    public static void main(String[] args) {
        String text = " a a a aa?  aa .aaa, b bb! bbb c cc ccc d d d d dd& ddd/ ddd! .";
        String textWithoutPunctuations = text.replaceAll("\\p{Punct}", "");
        System.out.println(textWithoutPunctuations);
        String textWithoutStartAndEndSpaces = textWithoutPunctuations.trim();
        System.out.println(textWithoutStartAndEndSpaces);
        String[] wordArray = textWithoutStartAndEndSpaces.split(" ");
        System.out.println(wordArray);
        for (String s : wordArray) {
            System.out.println(s);
        }
        Map<String, Integer> uniqueWords = new HashMap<>();
        for (String s : wordArray) {
            if (!s.isBlank()) {
                Integer i = 1;
                Integer j = uniqueWords.put(s, i);
                if (j != null) {
                    j++;
                    uniqueWords.put(s, j);
                }
            }
        }
        for (Map.Entry m : uniqueWords.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
        System.out.println(uniqueWords.size());
        System.out.println(uniqueWords.get("d"));
        System.out.println(uniqueWords.keySet());
    }
}
