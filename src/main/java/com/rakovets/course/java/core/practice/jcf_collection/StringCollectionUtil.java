package com.rakovets.course.java.core.practice.jcf_collection;

import java.util.List;

public class StringCollectionUtil {
    public void resetWordsByLength(List<String> e, int n) {
        for (int i = 0; i < e.size(); i++) {
            if (e.get(i).length() == n) {
                e.set(i, "*");
            }
        }
    }

    public void removeWordsByLength(List<String> e, int n) {
        e.removeIf(s -> s.length() == n);
    }
}
