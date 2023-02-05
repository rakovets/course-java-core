package com.rakovets.course.java.core.practice.jcf_collection;

import java.util.ArrayList;
import java.util.Collection;

public class StringCollectionUtil {
    public Collection<String> resetWordsByLength(Collection<String> stringList, Integer wordLength) {
        Collection<String> collection = new ArrayList<>();

        for (String word : stringList) {
            if (word.length() == wordLength) {
                collection.add("*");
            } else {
                collection.add(word);
            }
        }

        return collection;
    }

    public Collection<String> removeWordsByLength(Collection<String> stringList, Integer wordLength) {
        stringList.removeIf(word -> word.length() == wordLength);

        return stringList;
    }
}
