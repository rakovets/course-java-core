package com.rakovets.course.java.core.practice.jcf.map;

public class MapTest {
    public static void main(String[] args) {
        String text = "SuperText test text test! word, text text Test-Test Test. Test";

        System.out.println(TextMonitoring.researchText(text));

        System.out.println(TextMonitoring.getCountUniqueWords(text));

        System.out.println(TextMonitoring.getUniqueWords(text));

        System.out.println(TextMonitoring.getFrequencyWord(text, "test"));

        System.out.println(TextMonitoring.getFrequencyWords(text, "test", true));
    }
}
