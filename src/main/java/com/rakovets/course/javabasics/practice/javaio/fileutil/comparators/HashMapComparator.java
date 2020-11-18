package com.rakovets.course.javabasics.practice.javaio.fileutil.comparators;

import java.util.Comparator;
import java.util.Map;

public class HashMapComparator implements Comparator<Map.Entry<String, Integer>>{

    @Override
    public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
        return Integer.compare(o1.getValue(), o2.getValue());
    }

}
