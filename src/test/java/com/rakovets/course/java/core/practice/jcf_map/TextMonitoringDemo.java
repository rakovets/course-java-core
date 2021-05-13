package com.rakovets.course.java.core.practice.jcf_map;

public class TextMonitoringDemo {
    public static void main(String[] args) {
        String text = "hello, I like java, but I don't like java??? skript???.    hello hello, ,      hello";

        System.out.println(TextMonitoring.researchText(text));
        System.out.println(TextMonitoring.getCountUniqueWords(text));
        System.out.println(TextMonitoring.getUniqueWords(text));
        System.out.println(TextMonitoring.getFrequencyWord(text, "word"));
        System.out.println(TextMonitoring.getFrequencyWords(text, true));
    }
}
