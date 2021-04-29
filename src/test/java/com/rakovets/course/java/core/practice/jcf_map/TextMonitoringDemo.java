package com.rakovets.course.java.core.practice.jcf_map;

public class TextMonitoringDemo {
    public static void main(String[] args) {
        TextMonitoring text = new TextMonitoring();
        text.researchText("hello there, they all said hello");
        System.out.println(text.getCountUniqueWords());
        System.out.println(text.getUniqueWords());
        System.out.println(text.getFrequencyWord("hello"));
        System.out.println(text.getFrequencyWords(true));
        System.out.println(text.getFrequencyWords(false));
    }
}
