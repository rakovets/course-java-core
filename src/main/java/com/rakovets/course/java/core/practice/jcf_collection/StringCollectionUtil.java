package com.rakovets.course.java.core.practice.jcf_collection;

import java.util.ArrayList;
import java.util.Collection;

public class StringCollectionUtil {
    public Collection<String> resetWordsByLength(Collection<String> coll, int length) {
        Collection<String> newCollection = new ArrayList<>();
        for (String str : coll) {
            if (str.length() == length) {
                newCollection.add("*");
            } else {
                newCollection.add(str);
            }
        }
        return newCollection;
    }

    public Collection<String> removeWordsByLength(Collection<String> coll, int length) {
        coll.removeIf(str -> str.length() == length);
        return coll;
    }
}
