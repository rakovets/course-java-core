package com.rakovets.course.java.core.practice.jcf_map;

import java.util.HashMap;
import java.util.Map;

public class TextMonitoringDemo {
    public static void main(String[] args) {
        TextMonitoring textMonitoring = new TextMonitoring();

        System.out.println("Count identical words in text : "
                + textMonitoring.researchText("hi hi hello ol ol ol Ol"));
        System.out.println("Count unique words in text : "
                + textMonitoring.getCountUniqueWords( "hi hi hello ol ol ol Ol"));
        System.out.println("Collection unique words in text : "
                + textMonitoring.getUniqueWords("hi hi hello ol ol ol Ol"));
        System.out.println("Frequency of using a given word : "
                + textMonitoring.getFrequencyWord("hi hi hello ol ol ol Ol", "Ol"));
        System.out.println("All words and the frequency of their use in the text in ascending or descending order : "
                + textMonitoring.getFrequencyWord("hi hi hello ol ol ol Ol", true));
    }
}
