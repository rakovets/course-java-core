package com.rakovets.course.java.core.practice.jcf_collection;

import java.util.Iterator;
import java.util.List;

public class StringCollectionUtil {
    private List<String> strings;

    public StringCollectionUtil(List<String> strings) {
        this.strings = strings;
    }

    public List<String> resetWordsByLength(int wordSize) {
        for (String word : strings) {
            if (word.length() == wordSize) {
                strings.set(strings.indexOf(word), "*");
            }
        }
        return strings;
    }

    public List<String> removeWordsByLength(int wordSize) {
        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().length() == wordSize) {
                iterator.remove();
            }
        }
        return strings;
    }
}
