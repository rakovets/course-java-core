package com.rakovets.course.java.core.practice.jcf_collection;

import java.util.Collection;
import java.util.List;

public class StringCollectionUtil {
    public Collection<String> resetWordsByLength(List<String> list, int wordSize) {
        for (String word : list) {
            if (word.length() == wordSize) {
                list.set(list.indexOf(word), "*");
            }
        }
        return list;
    }

    public Collection<String> removeWordsByLength(Collection<String> collection, int wordSize) {
        collection.removeIf(word -> word.length() == wordSize);
            return collection;
    }
}
