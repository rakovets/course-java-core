package com.rakovets.course.java.core.practice.jcf_map;

import com.rakovets.course.java.core.practice.jcf_map.words_monitoring.TextMonitoring;

public class TextMonitoringDemo {
    public static void main(String[] args) {
        TextMonitoring textMonitoring = new TextMonitoring();
        textMonitoring.researchText("   he,   he pr: he,  pr marry marry evgen pr ");
        System.out.println(textMonitoring.toString());

        System.out.println(textMonitoring.getCountUniqueWords());

        System.out.println(textMonitoring.getUniqueWords());

        System.out.println(textMonitoring.getFrequencyWord("he"));
        System.out.println(textMonitoring.getFrequencyWord(" "));
        System.out.println(textMonitoring.getFrequencyWord("3"));

        System.out.println(textMonitoring.getFrequencyWords(false));
        System.out.println(textMonitoring.getFrequencyWords(true));
    }
}
