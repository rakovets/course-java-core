package com.rakovets.java.task.collections.list.words_monitoring;

import java.util.Collection;
import java.util.List;
import java.util.Map;

public class TextMonitoringDemo {
    public static void main(String[] args) {
        String str1 = "this day and morning will be nice in this morning we sleep because this day is holiday";
        TextMonitoring textMonitoring = new TextMonitoring();
        Map<String, Integer> map = textMonitoring.researchText(str1);
        System.out.println(map);

        Collection<String> collection = textMonitoring.getUniqueWords(str1);
        System.out.println(collection);

        int count = textMonitoring.getCountUniqueWords(str1);
        System.out.println(count);

        int countOfWord = textMonitoring.get(str1, "this");
        System.out.println(countOfWord);

        List list = textMonitoring.print(str1);
        System.out.println(list);
    }
}
