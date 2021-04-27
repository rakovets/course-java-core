package com.rakovets.course.java.core.practice.jcf_map;

import java.util.Comparator;
import java.util.Map;

public class ComparatorAscendingFrequency implements Comparator<Map.Entry<String, Integer>> {
    @Override
    public int compare(Map.Entry<String, Integer> first, Map.Entry<String, Integer> second) {
        if (first == second) {
            return 0;
        } else {
            return Integer.compare(first.getValue(), second.getValue());
        }
    }
}
