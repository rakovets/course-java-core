package com.rakovets.course.java.core.practice.jcf_collection;

import java.util.*;

public class StringCollectionUtil {
    private final List<String> list;

    public StringCollectionUtil(List<String> list) {
        this.list = list;
    }

    public List<String> resetWordsByLength(int wordSize) {
        ListIterator<String> iterator = list.listIterator();
        while (iterator.hasNext()) {
            if (iterator.next().length() == wordSize) {
                iterator.set("*");
            }
        }
        return list;
    }

    public List<String> removeWordsByLength(int wordSize) {
        list.removeIf(s -> s.length() == wordSize);
        return list;
    }
}
