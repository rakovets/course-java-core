package com.rakovets.course.java.core.practice.jcf_map;

import com.rakovets.course.java.core.practice.jcf_map.words_monitoring.TextMonitoring;

import java.util.HashMap;
import java.util.Map;

public class TextMonitoringDemo {
    public static void main(String[] args) {
        TextMonitoring textMon = new TextMonitoring();
        textMon.researchText("hello world paul alex paul world hello");
        System.out.println(textMon.getTextList());
    }
}
