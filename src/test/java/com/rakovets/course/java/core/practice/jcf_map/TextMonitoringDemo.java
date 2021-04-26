package com.rakovets.course.java.core.practice.jcf_map;

import java.util.HashMap;
import java.util.Map;

public class TextMonitoringDemo {

    public static void main(String[] args) {
        Map<String, Integer> researchedText = new HashMap<>();
        String text = "My favorite city is Minsk. Minsk is the capital of Belarus!";

        TextMonitoring textMonitoring = new TextMonitoring(researchedText, text);

        textMonitoring.researchText(text);
        System.out.println("\nThis is list of words with number of repetitions:");
        for (Map.Entry<String, Integer> item : researchedText.entrySet()) {
            System.out.printf("Word - %s, number in text %d\n", item.getKey(), item.getValue());
        }

        System.out.printf("\nNumber of unique words - %d\n", textMonitoring.getCountUniqueWords());

        System.out.println("\nThis is list of unique words:");
        System.out.printf("Words - %s\n", textMonitoring.getUniqueWords());

        String uniqueWord = "favorite";
        System.out.printf("\nFrequency of use of the word %s = %d\n", uniqueWord, textMonitoring.getFrequencyWord(uniqueWord));
        uniqueWord = "Minsk";
        System.out.printf("Frequency of use of the word %s = %d\n", uniqueWord, textMonitoring.getFrequencyWord(uniqueWord));


    }


}
