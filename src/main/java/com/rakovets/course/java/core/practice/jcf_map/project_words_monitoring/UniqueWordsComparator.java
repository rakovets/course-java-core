package com.rakovets.course.java.core.practice.jcf_map.project_words_monitoring;

import java.util.Comparator;

public class UniqueWordsComparator implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        return o2.compareTo(o1);
    }
}
