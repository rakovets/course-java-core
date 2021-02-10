package com.rakovets.course.java.core.practice.jcf.collection.StringCollectionUtil;

import java.util.ArrayList;
import java.util.Collection;

public class StringCollectionUtil {

    public static Collection<String> resetWordsByLength(Collection<String> collection, int length) {
        Collection<String> newCollection = new ArrayList<>();
        for (String string : collection) {
            if (string.length() != length)
                newCollection.add(string);
            else
                newCollection.add("*");
        }
        return newCollection;
    }

    public static void removeWordsByLength(Collection<String> collection, int length) {
        collection.removeIf(s -> s.length() == length);
    }
}
