package com.rakovets.course.java.core.practice.jcf_collection;

import java.util.List;
import java.util.ListIterator;

public class StringCollectionUtil {
    public static void resetWordsByLength(List<String> words, int lengthWord) {
        ListIterator<String> iterator = words.listIterator();
        while (iterator.hasNext()) {
            if (iterator.next().length() == lengthWord) {
                iterator.set("*");
            }
        }
    }

    public static void removeWordsByLength(List<String> words, int lengthWord) {
        ListIterator<String> iterator = words.listIterator();
        while (iterator.hasNext()) {
            if (iterator.next().length() == lengthWord) {
                iterator.remove();
            }
        }
    }
}
