package com.rakovets.course.java.core.practice.jcf_map;

import java.util.Map;
import java.util.Set;

public class DemoTextMonitoring {
    public static void main(String[] args) {
        TextMonitoring textMonitoring = new TextMonitoring();
        String str = " There lived an old man and an old woman. The old man asked the old woman to bake a bun. +  And the bun ran away.  ";
        Map<String, Double> map = textMonitoring.researchText(str);
        Set<String> keys = map.keySet();
        for (String key : keys) {
            System.out.println(key + " " + map.get(key));
        }
        System.out.println(textMonitoring.getCountUniqueWords(str));

        Set<String> keys2 = textMonitoring.getUniqueWords(str);
        for (String key : keys2) {
            System.out.println(key);
        }
        System.out.println(textMonitoring.getFrequencyWord(str, "old"));
        System.out.println(textMonitoring.getFrequencyWords(str, false));
        System.out.println(textMonitoring.getFrequencyWords(str, true));
    }
}
