package com.rakovets.course.java.core.practice.jcf_collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class StringCollectionUtil {
    public Collection<String> resetWordsByLength(Collection<String> collection, int length) {
        Collection<String> newCollection = new ArrayList<>();
        for (String string : collection) {
            if (string.length() != length) {
                newCollection.add(string);
            } else {
                newCollection.add("*");
            }
            return newCollection;
        }
    }

    public Collection<String> removeWordsByLength(Collection<String> collection, int length) {
        Iterator<String> iterator = collection.iterator();
        while (iterator.hasNext()) {
            String string = iterator.next();
            if (string.length() == length) {
                iterator.remove();
            }
        }
        return collection;
    }
}
