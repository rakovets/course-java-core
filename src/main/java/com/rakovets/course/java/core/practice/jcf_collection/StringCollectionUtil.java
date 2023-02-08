package com.rakovets.course.java.core.practice.jcf_collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class StringCollectionUtil {
    public Collection<String> resetWordsByLength(Collection<String> collection, Integer wordLength) {
        Collection<String> collectionTwo = new ArrayList<>();
        for (String word : collection) {
            if (word.length() == wordLength) {
                collectionTwo.add("*");
            } else {
                collectionTwo.add(word);
            }
        }
        return collectionTwo;
    }

    public Collection<String> removeWordsByLength(Collection<String> collection, Integer wordLength) {
        Iterator<String> iterator = collection.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().length() == wordLength) {
                iterator.remove();
            }
        }
        return collection;
    }
}
