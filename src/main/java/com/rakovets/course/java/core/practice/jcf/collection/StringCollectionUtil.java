package com.rakovets.course.java.core.practice.jcf.collection;

import java.util.*;

public abstract class StringCollectionUtil {
    public static void resetWordsByLength(List<String> collection, int size) {
        ListIterator<String> listIter = collection.listIterator();

        while (listIter.hasNext()) {
            if (listIter.next().length() == size) {
                listIter.set("*");
            }
        }
    }

    public static void removeWordsByLength(Collection<String> collection, int size) {
        collection.removeIf(word -> word.length() == size);
    }
}
