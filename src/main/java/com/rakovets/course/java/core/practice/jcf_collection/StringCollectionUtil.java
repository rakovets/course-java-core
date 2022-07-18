package com.rakovets.course.java.core.practice.jcf_collection;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class StringCollectionUtil {
    public void resetWordsByLength(List<String> strings, int wordSize) {
        for (String word : strings) {
            if (word.length() == wordSize) {
                strings.set(strings.indexOf(word), "*");
            }
        }
    }

    public void removeWordsByLength(Collection<String> strings, int wordSize) {
        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()) {
           if (iterator.next().length() == wordSize) {
               iterator.remove();
           }
        }
    }
}
