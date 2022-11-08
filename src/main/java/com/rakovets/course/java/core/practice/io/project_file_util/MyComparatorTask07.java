package com.rakovets.course.java.core.practice.io.project_file_util;

import java.util.Comparator;
import java.util.Map;

public class MyComparatorTask07 implements Comparator<Map.Entry> {

    @Override
    public int compare(Map.Entry o1, Map.Entry o2) {
        return (int) o1.getValue() - (int) o2.getValue();
    }
}
