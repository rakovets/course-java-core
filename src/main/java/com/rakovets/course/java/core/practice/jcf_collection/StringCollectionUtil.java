package com.rakovets.course.java.core.practice.jcf_collection;

import java.util.Collection;
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

    public Collection <String> removeWordsByLength(Collection<String> collection, int wordSize) {
       collection.removeIf(s -> s.length() == wordSize);
       return collection;
    }
}
