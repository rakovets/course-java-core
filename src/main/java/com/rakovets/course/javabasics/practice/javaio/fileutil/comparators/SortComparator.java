package com.rakovets.course.javabasics.practice.javaio.fileutil.comparators;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.LinkedList;

public class SortComparator implements Comparator<LinkedList<Integer>> {
    @Override
    public int compare(LinkedList<Integer> o1, LinkedList<Integer> o2, int i) {
        return compare(o1.get(i), o2.get(i + 1);
    }
}
