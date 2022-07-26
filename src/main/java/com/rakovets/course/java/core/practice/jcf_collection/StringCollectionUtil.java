package com.rakovets.course.java.core.practice.jcf_collection;

import java.util.ArrayList;
import java.util.Collection;

public class StringCollectionUtil {
    public Collection<String> resetWordsByLength(Collection<String> collection, int wordSize, String replacement) {
        Collection<String> resultCollection = new ArrayList<>();
        for (String word : collection) {
            if (word.length() == wordSize) {
                resultCollection.add(replacement);
            } else {
                resultCollection.add(word);
            }
        }
        return resultCollection;
    }

    public Collection<String> removeWordsByLength(Collection<String> collection, int wordSize) {
        collection.removeIf(s -> s.length() == wordSize);
        return collection;
    }
}
