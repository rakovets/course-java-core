package com.rakovets.course.java.core.practice.jcf.collection;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class StringCollectionUtil {
    public static void resetWordsByLength(List<String> strings, int length) {
        ListIterator<String> wordsList = strings.listIterator();

        while (wordsList.hasNext()) {
            if (wordsList.next().length() == length) {
                wordsList.set("*");
            }
        }
    }

    public static void removeWordsByLength(Collection<String> collect, int length) {
        collect.removeIf(s -> s.length() == length);
    }
}
