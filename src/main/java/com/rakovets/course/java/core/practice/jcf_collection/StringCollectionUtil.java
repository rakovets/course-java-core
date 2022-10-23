package com.rakovets.course.java.core.practice.jcf_collection;

import java.util.*;

public class StringCollectionUtil {
    final private List<String> list;

    public StringCollectionUtil(List<String> list) {
        this.list = list;
    }

    public List<String> resetWordsByLength(List<String> list, int wordSize) {
        ListIterator<String> iterator = list.listIterator();
        while (iterator.hasNext()) {
            if (iterator.next().length() == wordSize) {
                iterator.set("*");
            }
        }
        return list;
    }

    public List<String> removeWordsByLength(List<String> list, int wordSize) {
        list.removeIf(s -> s.length() == wordSize);
        return list;
    }

    public List<String> getList() {
        return list;
    }
}
