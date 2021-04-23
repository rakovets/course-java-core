package com.rakovets.course.java.core.practice.jcf_map;

import com.rakovets.course.java.core.practice.jcf_map.words_monitoring.TextMonitoring;

import java.util.HashMap;
import java.util.Map;

public class TextMonitoringDemo {
    public static void main(String[] args) {
        String text = "hello world paul alex paul alex world alex hello hi hi hello hi paul Java hello java";
        TextMonitoring textMon = new TextMonitoring();
        textMon.researchText(text);
        System.out.println(textMon.getTextList());
        System.out.println(textMon.getCountUniqueWords());
        System.out.println(textMon.getUniqueWords());
        System.out.println(textMon.getFrequencyWord("paul"));
        System.out.println(textMon.getFrequencyWords(true));
        System.out.println(textMon.getFrequencyWords(false));
    }
}
