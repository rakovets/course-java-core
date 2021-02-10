package com.rakovets.course.java.core.practice.jcf.map;

public class TextMonitoringDemo {
    public static void main(String[] args) {
        String str = "this text is text dog dog hello cat world is is";
        System.out.println(TextMonitoring.getFrequencyWord(str, "is"));
        System.out.println(TextMonitoring.getUniqueWords(str));
        System.out.println(TextMonitoring.getCountUniqueWords(str));
        System.out.println(TextMonitoring.researchText(str));
        System.out.println(TextMonitoring.getFrequencyWords(true, str));
    }
}
