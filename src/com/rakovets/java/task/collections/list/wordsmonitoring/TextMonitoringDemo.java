package com.rakovets.java.task.collections.list.wordsmonitoring;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class TextMonitoringDemo {
    public static void main(String[] args) {
        TextMonitoring textMonitoring = new TextMonitoring();
        String text = "one word two post word three three two nik three post post";

        int count = textMonitoring.getCountUniqueWords(text);
        System.out.println("count :" + count);

        Collection<String> collection = textMonitoring.getUniqueWords(text);
        System.out.println("collection :" + collection);

        Map<String, Integer> map = textMonitoring.researchText(text);
        System.out.println("map :" + map);

        int wordCount = textMonitoring.get(text);
        System.out.println("wordCount :" + wordCount);

        List<Entry<String, Integer>> list = textMonitoring.print(text);
        System.out.println("list :" + list);
    }
}
