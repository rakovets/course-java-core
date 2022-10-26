package com.rakovets.course.java.core.practice.jcf_map.project_word_monitoring;

import java.util.*;

public class DemoTextMonitoring {
    public static void main(String[] args) {
        String text = " a a a aa?   aa .aaa, b d bb! bbb c cc ccc d d d dd& ddd/ ddd! d.";
        System.out.println(text);
        String textWithoutPunctuations = text.replaceAll("\\p{Punct}", "");
        System.out.println(textWithoutPunctuations);
        String[] wordArray = textWithoutPunctuations.split(" ");
        for (String s : wordArray) {
            System.out.print(s + ',');
        }
        System.out.println();
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
            System.out.print(m.getKey() + " " + m.getValue() + "\t");
        }
        System.out.println("\nВ строке " + uniqueWords.size() + " уникальных слов");
        System.out.println("Слово d встречается в строке " + uniqueWords.get("d") + " раз");
        System.out.println(uniqueWords.keySet());
        System.out.println(uniqueWords.entrySet());

        SortedMap<String, Integer> sortedUniqueWords = new TreeMap<>();
        sortedUniqueWords.putAll(uniqueWords);
        System.out.println(sortedUniqueWords);

        SortedMap<String, Integer> reverseSortedUniqueWords = new TreeMap<>(new UniqueWordsComparator());
        reverseSortedUniqueWords.putAll(uniqueWords);
        System.out.println(reverseSortedUniqueWords);
    }
}
