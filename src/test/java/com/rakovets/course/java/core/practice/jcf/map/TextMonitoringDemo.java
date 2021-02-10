package com.rakovets.course.java.core.practice.jcf.map;

import com.rakovets.course.java.core.practice.jcf.map.words_monitoring.TextMonitoring;
import java.util.Collection;
import java.util.Map;

public class TextMonitoringDemo {
    public static void main(String[] args) {
        String text = "Green Sally up and green Sally down " +
                "Lift and squat, gotta tear the ground " +
                "Green Sally up and green Sally down " +
                "Lift and squat, gotta tear the ground " +
                "" +
                "Old Miss Lucy's dead and gone " +
                "Left me here to weep and moan";
        System.out.println(TextMonitoring.researchText(text));

        TextMonitoring example = new TextMonitoring(text);

        Collection<String> unique = example.getUniqueWords();
        for (String word : unique) {
            System.out.println(word);
        }

        Collection<Map.Entry<String, Integer>> wordsFrequency = example.getFrequencyWords(false);
        for (Map.Entry<String, Integer> entry : wordsFrequency) {
            System.out.println(entry);
        }
    }
}
