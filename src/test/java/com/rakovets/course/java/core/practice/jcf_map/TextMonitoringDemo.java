package com.rakovets.course.java.core.practice.jcf_map;

public class TextMonitoringDemo {
    public static void main(String[] args) {
        TextMonitoring textMonitoring = new TextMonitoring();
        textMonitoring.researchText("Tatsiana, tatsiana, hello,   tatsiana! hello!  hello.");
        System.out.println(textMonitoring.toString());

        System.out.println(textMonitoring.getCountUniqueWords());

        System.out.println(textMonitoring.getUniqueWords());

        System.out.println(textMonitoring.getFrequencyWord("Tatsiana"));

        System.out.println(textMonitoring.getFrequencyWords(true));
        System.out.println(textMonitoring.getFrequencyWords(false));
    }
}
