package com.rakovets.course.java.core.practice.jcf_map;

public class TextMonitoringDemo {
    public static void main(String[] args) {
        System.out.println("research text " + TextMonitoring.researchText("Hello, hello. hello! Test cat cat cat"));
        System.out.println("research text: numbers ignored " + TextMonitoring.researchText("Test. Text, Test 123 0"));

        System.out.println("getCountUniqueWords(the same word): " + TextMonitoring.getCountUniqueWords("cat cat cat"));
        System.out.println("getCountUniqueWords(different words): " + TextMonitoring.getCountUniqueWords("Hello! This is test message!"));

        System.out.println("getUniqueWords(the same word): " + TextMonitoring.getUniqueWords("cat cat cat"));
        System.out.println("getUniqueWords(different words): " + TextMonitoring.getUniqueWords("Hello Hello this is message message message"));

        System.out.println("getFrequencyWord(0 usage): " + TextMonitoring.getFrequencyWord("Cat", "Hello Hello this is message message message"));
        System.out.println("getFrequencyWord(multiple usage): " + TextMonitoring.getFrequencyWord("Hello", "Hello Hello this is message message message"));

        System.out.println("getFrequencyWords(ASC): " + TextMonitoring.getFrequencyWords("Hello world java cat java java Hello", true));
        System.out.println("getFrequencyWords(DESC): " + TextMonitoring.getFrequencyWords("Hello world java cat java java Hello", false));
    }
}
