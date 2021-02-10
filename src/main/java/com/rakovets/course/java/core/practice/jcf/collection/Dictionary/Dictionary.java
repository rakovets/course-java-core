package com.rakovets.course.java.core.practice.jcf.collection.Dictionary;

import java.util.*;

public class Dictionary {
    private final Map<String, Word> data;
    int numIterations;

    public Dictionary() {
        data = new HashMap<>(25);
    }

    public void add(String translation, Word word) {
        data.put(translation, word);
    }

    public int size() {
        return data.size();
    }

    public HashMap<String, int[]> getIntCounter() {
        HashMap<String, int[]> intCounter = new HashMap<>();
        String[] data = new String[size()];
        for (int i = 0; i < numIterations; i++) {
            for (String value : data) {
                int[] valueWrapper = intCounter.get(value);
                if (valueWrapper == null)
                    intCounter.put(value, new int[]{1});
                else
                    valueWrapper[0]++;
            }
        }
        return intCounter;
    }
}
