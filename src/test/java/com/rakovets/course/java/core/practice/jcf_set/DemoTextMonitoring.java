package com.rakovets.course.java.core.practice.jcf_set;

import com.rakovets.course.java.core.practice.jcf_map.words_monitoring.TextMonitoring;

import java.util.*;

public class DemoTextMonitoring {
    public static void main(String[] args) {
        String inputText = "hello hello hello word world hello word hello java bye word morning morning word word word";
        TextMonitoring textMonitoring = new TextMonitoring();
        Map<String, Double> demo = new HashMap<>();
        demo = textMonitoring.researchText(inputText);
        Set<String> uniqueWords = new HashSet<>();
        uniqueWords = textMonitoring.getUniqueWords(inputText);
        NavigableMap<String, Double> navigableMapTrue = new TreeMap<>();
        NavigableMap<String, Double> navigableMapFalse = new TreeMap<>();

        System.out.println("Initial text: " + inputText);
        System.out.println("Specification of task 2");
        System.out.println(demo);
        System.out.println("\nSpecification of task 3");
        System.out.println("The number of unique words in the text: " + textMonitoring.getCountUniqueWords(inputText));
        System.out.println("The collection of unique words from the text: " + uniqueWords);
        System.out.println("The frequency of use of the word \"word\": " + textMonitoring.getFrequencyWord(inputText, "word"));
        System.out.println("List of words and frequency of their use in ascending order: " + textMonitoring.getFrequencyWords(inputText, true));
        System.out.println("List of words and frequency of their use in descending order: " + textMonitoring.getFrequencyWords(inputText, false));
    }
}
