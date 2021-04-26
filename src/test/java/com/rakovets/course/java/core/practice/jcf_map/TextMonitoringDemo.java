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
    }
}
