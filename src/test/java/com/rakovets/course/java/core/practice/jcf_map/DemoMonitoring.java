package com.rakovets.course.java.core.practice.jcf_map;

import java.util.*;

public class DemoMonitoring {
    public static void main(String[] args) {
        TextMonitoring textMonitoring = new TextMonitoring();
        String line = new String("Sun sun. My cat line... Cat cat, dog cat Sun & dog! Hi sun? fine!!! AND sun YoU)");
        Map<String, Integer> map = textMonitoring.researchText(line);
        System.out.println(map);
        System.out.println(textMonitoring.getCountUniqueWords(map));
        System.out.println(textMonitoring.getUniqueWords(map));
        System.out.println(textMonitoring.getFrequencyWord(map, "cat"));
        System.out.println(textMonitoring.getFrequencyWords(map, true));
        System.out.println(textMonitoring.getFrequencyWords(map, false));
    }
}
