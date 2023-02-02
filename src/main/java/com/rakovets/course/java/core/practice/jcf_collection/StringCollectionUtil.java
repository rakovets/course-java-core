package com.rakovets.course.java.core.practice.jcf_collection;

import java.util.List;
import java.util.ListIterator;

public class StringCollectionUtil {
    public List<String> resetWordsByLength(List<String> listString, Integer wordLength) {
        ListIterator<String> listIterator = listString.listIterator();
        while (listIterator.hasNext()) {
            if (listIterator.next().length() == wordLength) {
                listIterator.set("*");
            }
        }
        return listString;
    }

    public List<String> removeWordsByLength(List<String> listString, Integer wordLength) {
        ListIterator<String> listIterator = listString.listIterator();
        while (listIterator.hasNext()) {
            if (listIterator.next().length() == wordLength) {
                listIterator.remove();
            }
        }
        return listString;
    }
}
