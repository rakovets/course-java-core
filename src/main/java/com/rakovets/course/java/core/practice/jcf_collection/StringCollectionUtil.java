package com.rakovets.course.java.core.practice.jcf_collection;

import java.util.List;
import java.util.ListIterator;

public class StringCollectionUtil {
    public static List<String> resetWordsByLength(List<String> str, int lengthWorld) {
        ListIterator<String> wordsList = str.listIterator();
        while (wordsList.hasNext()) {
            if (wordsList.next().length() == lengthWorld) {
                wordsList.set("*");
            }
        }
        return str;
    }

    public static List<String> removeWordsByLength(List<String> str, int lengthWorld) {
        ListIterator<String> wordsList = str.listIterator();
        while (wordsList.hasNext()) {
            if (wordsList.next().length() == lengthWorld) {
                wordsList.remove();
            }
        }
        return str;
    }
}
