package com.rakovets.course.java.core.practice.jcf_map;

import java.util.HashMap;
import java.util.Map;

public class TextMonitoringDemo {
    public static void main(String[] args) {
       TextMonitoring text = new TextMonitoring();
       text.researchText("paul paul paul Paul hello hell hello heell hell hell hell hell 222 he ll");
        System.out.println(text.getTextlist());
        System.out.println(text.getCountUniqueWords());
        System.out.println(text.getUniqueWords());
        System.out.println(text.getFrequencyWord("hell"));
        System.out.println(text.getFrequencyWords(true));
        System.out.println(text.getFrequencyWords(false));

    }
}
