package com.rakovets.course.java.core.practice.jcf.map;

import java.util.Comparator;
import java.util.Map;

public class DescendingFrequencyComparator implements Comparator<Map.Entry<String, Integer>> {
    @Override
    public int compare(Map.Entry<String, Integer> first, Map.Entry<String, Integer> second) {
        if (first == second) {
            return 0;
        } else {
            return Integer.compare(second.getValue(), first.getValue());
        }
    }
}

