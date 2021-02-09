package com.rakovets.course.java.core.practice.jcf.map;

public class MapDemo {
    public static void main(String[] args) {
        String text = "SuperText test text test! word, text text Test-Test Test. Test";

        TextMonitoring map = new TextMonitoring(text);

        System.out.println(TextMonitoring.researchText(text));

        System.out.println(map.getCountUniqueWords());

        System.out.println(map.getUniqueWords());

        System.out.println(map.getFrequencyWord("test"));

        System.out.println(map.getFrequencyWords(true));
    }
}
