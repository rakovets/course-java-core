package com.rakovets.course.java.core.practice.jcf_map;

public class TextMonitoringDemo {
    public static void main(String[] args) {
        TextMonitoring textMonitoring = new TextMonitoring();
        String text = "One 3 Two ThrEE Four! Five_ One";
        String text2 = "Zero zero One ZERo !One*Zero";
        String word = "One";

        /**
         * Specification of task 2
         */
        System.out.println(textMonitoring.researchText(text));
        System.out.println(textMonitoring.researchText(text2));

        /**
         * Specification of task 3
         */
        System.out.println(textMonitoring.getCountUniqueWords(text));
        System.out.println(textMonitoring.getCountUniqueWords(text2));

        System.out.println(textMonitoring.getUniqueWords(text));
        System.out.println(textMonitoring.getUniqueWords(text2));

        System.out.println(textMonitoring.getFrequencyWord(text, word));
        System.out.println(textMonitoring.getFrequencyWord(text2, word));

        System.out.println(textMonitoring.getFrequencyWords(text, true));
        System.out.println(textMonitoring.getFrequencyWords(text, false));
        System.out.println(textMonitoring.getFrequencyWords(text2, true));
        System.out.println(textMonitoring.getFrequencyWords(text2, false));
    }
}
