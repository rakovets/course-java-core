package com.rakovets.course.java.core.practice.jcf_map;

import java.util.Comparator;
import java.util.Map;

public class StringInReverseOrderComparator implements Comparator<Map.Entry<String, Integer>> {
    @Override
    public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
        return o2.getValue() - o1.getValue();
    }
}
