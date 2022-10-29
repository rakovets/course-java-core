package com.rakovets.course.java.core.practice.jcf_map;

import java.util.HashMap;
import java.util.Map;

public class TextMonitoringDemo {
    public static void main(String[] args) {
        String text = "Gunaydın arkadaşlar! siz nasılsınız? gunaydın arkadaşlar! Siz nasılsınız?";
        TextMonitoring textMonitoring = new TextMonitoring();
        Map<String, Integer> map = new HashMap<>();
        map = textMonitoring.researchTest(text);
        System.out.println(map);
        System.out.println(" ");
        System.out.println("Unique words are " + textMonitoring.getCountUniqueWords(map));
        System.out.println(" ");
        System.out.println(textMonitoring.getUniqueWords(map));
        System.out.println(" ");
        System.out.println(textMonitoring.getFrequencyWord(map, "siz"));
        System.out.println(" ");
        System.out.println(textMonitoring.getFrequencyWords(map, true));
        System.out.println(" ");
        System.out.println(textMonitoring.getFrequencyWords(map,false));
    }
}
