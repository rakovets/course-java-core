package com.rakovets.course.java.core.practice.jcf_map;

import java.util.Map;

public class TextMonitoringDemo {
    public static void main(String[] args) {
        String text = ("Java is : Java this text is, only? - for testing ,java framework task");

        TextMonitoring textMonitoring = new TextMonitoring();
        textMonitoring.researchText(text);
        System.out.println("Map of words from the text and their repetition: ");
        System.out.println(textMonitoring.getMapText());
        System.out.println("\nCount of unique words in text: ");
        System.out.println(textMonitoring.getCountUniqueWords());
        System.out.println("\nList of unique words in text: ");
        System.out.println(textMonitoring.getUniqueWords());
        System.out.println("\nThe number of repetitions of a word in the text: ");
        System.out.println(textMonitoring.getFrequencyWord("Java"));

        System.out.println(textMonitoring.getFrequencyWords(true));
        System.out.println(textMonitoring.getFrequencyWords(false));




    }
}
