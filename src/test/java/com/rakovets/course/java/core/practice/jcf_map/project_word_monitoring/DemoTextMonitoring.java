package com.rakovets.course.java.core.practice.jcf_map.project_word_monitoring;

import com.rakovets.course.java.core.practice.jcf_map.project_words_monitoring.TextMonitoring;

import java.util.*;

public class DemoTextMonitoring {
    public static void main(String[] args) {
        final String TEXT = " a a a aa? word  aa .aaa, b d bb! bbb word word c cc ccc d d d dd& ddd/ ddd! d.";TextMonitoring textMonitoring = new TextMonitoring();

        Map<String, Integer> mapWords = new HashMap<>(textMonitoring.researchText(TEXT));
        textMonitoring.printMapInMyFormat(mapWords);
        System.out.println(mapWords.entrySet());
        System.out.println(textMonitoring.getCountUniqueWords(TEXT));
        System.out.println(textMonitoring.getUniqueWords(TEXT));
        System.out.println(textMonitoring.getFrequencyWord(TEXT, "word"));
        System.out.println(textMonitoring.getFrequencyWords(TEXT, false));
        System.out.println(textMonitoring.getFrequencyWords(TEXT, true));
    }
}
