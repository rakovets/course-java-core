package com.rakovets.course.java.core.practice.jcf_map.words_monitoring;

import java.util.HashMap;

public class TextMonitoring {
    HashMap<String, Integer> textList = new HashMap<>();

    public void researchText(String text) {
        int key = 1;
        text = text.replaceAll("[,.!?]", " ");
        String[] eachWords = text.split("\\s+");
        for (String i : eachWords) {
            if (textList.containsKey(i)) {
                textList.put(i, ++key);
            } else {
                textList.put(i, key);
            }
            key = 1;
        }
    }

    public String getTextList() {
        return textList.toString();
    }
}
