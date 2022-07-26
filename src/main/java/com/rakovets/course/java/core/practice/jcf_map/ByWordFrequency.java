package com.rakovets.course.java.core.practice.jcf_map;

import java.util.Comparator;
import java.util.Map;
import java.util.Objects;

public class ByWordFrequency implements Comparator<Map.Entry<String, Integer>> {
    @Override
    public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
        if (!(Objects.equals(o1.getValue(), o2.getValue()))) {
            return o1.getValue().compareTo(o2.getValue());
        }
        return o1.getKey().compareTo(o2.getKey());
    }
}
