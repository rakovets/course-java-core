package com.rakovets.course.java.core.practice;

import java.util.Map;

public class TextMonitoringDemo {
    public static void main(String[] args) {
        TextMonitoring textMonitoring = new TextMonitoring();

        textMonitoring.researchText("Java C++ Java, JAVA, Python, Java");

        Map<String, Integer> map = textMonitoring.map;

        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            String key = pair.getKey();                      //ключ
            Integer value = pair.getValue();                  //значение
            System.out.println(key + ":" + value);
        }
        System.out.println(textMonitoring.getFrequencyWord("Java"));
        System.out.println("---------------------------------");
        String[] arrayKeyAndValue = textMonitoring.getFrequencyWords(true);
        for (String text : arrayKeyAndValue) {
            System.out.println(text);
        }

    }


}
