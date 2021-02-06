package com.rakovets.course.java.core.practice.jcf.collection;

import java.util.List;

public class StringCollectionUtil {
    public static List<String> resetWordsByLength(List<String> list, int size) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() == size) {
                list.set(i, "*");
            }
        }
        return list;
    }

    public static List<String> removeWordsByLength(List<String> list, int size) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() == size) {
                list.remove(i);
                i--;
            }
        }
        return list;
    }
}
