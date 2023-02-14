package com.rakovets.course.java.core.practice.jcf_map;

import static com.rakovets.course.java.core.practice.jcf_map.TextMonitoring.*;

public class TextMonitoringDemo {
    public static void main(String[] args) {
        String str = "Hello, we are studying Java. Java is a cool cool cool language!";
        System.out.println(researchText(str));
        System.out.println(getCountUniqueWords(str));
        System.out.println(getUniqueWords(str));
        System.out.println(getFrequencyWord(str, "Java"));
        System.out.println(getFrequencyWords(str, false));
    }
}
