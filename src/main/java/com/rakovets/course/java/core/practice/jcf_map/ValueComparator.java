package com.rakovets.course.java.core.practice.jcf_map;

import java.util.Comparator;
import java.util.Map;

public class ValueComparator implements Comparator<Map.Entry<String, Integer>> {
    @Override
    public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
        return Integer.compare(o1.getValue(), o2.getValue());
    }

    @Override
    public  Comparator<Map.Entry<String, Integer>> reversed() {
        return Comparator.super.reversed();
    }
}
