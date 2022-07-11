package com.rakovets.course.java.core.practice.jcf_collection;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class StringCollectionUtil {
    public List<String> resetWordsByLength(List<String> list, int wordSize) {
        for (String l : list) {
            if (l.length() == wordSize) {
                list.set(list.indexOf(l), "*");
            }
        }
        return list;
    }

    public boolean removeWordsByLength(Collection<String> collection, int wordSize) {
        return collection.removeIf(s -> s.length() == wordSize);
    }
}
