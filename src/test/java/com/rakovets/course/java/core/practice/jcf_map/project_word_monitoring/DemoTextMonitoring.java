package com.rakovets.course.java.core.practice.jcf_map.project_word_monitoring;

import com.rakovets.course.java.core.practice.jcf_map.project_words_monitoring.TextMonitoring;

import java.util.*;

public class DemoTextMonitoring {
    public static void main(String[] args) {
        TextMonitoring textMonitoring = new TextMonitoring();
        String text = " a a a aa? word  aa .aaa, b d bb! bbb word word c cc ccc d d d dd& ddd/ ddd! d.";
        Map<String, Integer> mapWords = new HashMap<>(textMonitoring.researchText(text));
        textMonitoring.toPrintMapInMyFormat(mapWords);
        System.out.println(mapWords.entrySet());
        System.out.println(textMonitoring.getCountUniqueWords(text));
        System.out.println(textMonitoring.getUniqueWords(text));
        System.out.println(textMonitoring.getFrequencyWord(text, "word"));
        System.out.println(textMonitoring.getFrequencyWords(text, false));
        System.out.println(textMonitoring.getFrequencyWords(text, true));
    }
}
