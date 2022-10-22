package com.rakovets.course.java.core.practice.jcf_collection;

import java.util.ArrayList;
import java.util.Collection;

public class StringCollectionUtil {
    public Collection<String> resetWordsByLength(Collection<String> collection, int wordSize) {
        Collection<String> stringCollection = new ArrayList<>();
        for (String word : collection) {
            if (word.length() == wordSize) {
                stringCollection.add("*");
            } else {
                stringCollection.add(word);
            }
        }
        return stringCollection;
    }

    public Collection<String> removeWordsByLength(Collection<String> collection, int wordSize) {
        Collection<String> stringCollection = new ArrayList<>();
        for (String word : collection) {
            if (word.length() != wordSize) {
                stringCollection.add(word);
            }
        }
        return stringCollection;
    }
}
