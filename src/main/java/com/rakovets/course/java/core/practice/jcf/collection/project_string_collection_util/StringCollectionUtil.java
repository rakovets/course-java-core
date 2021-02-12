package com.rakovets.course.java.core.practice.jcf.collection.project_string_collection_util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.ListIterator;

public class StringCollectionUtil {
    public ArrayList<String> resetWordsByLenght(ArrayList<String> string, int wordSize) {
        ListIterator<String> listIterator = string.listIterator();
        while (listIterator.hasNext()) {
            if (listIterator.next().length() == wordSize) {
                listIterator.set("*");
            }
        }
        return string;
    }

    public Collection<String> removeWordsByLenght(Collection<String> string, int wordSize) {
        string.removeIf(str -> str.length() ==  wordSize);
        return string;
    }
}
