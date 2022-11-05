package com.rakovets.course.java.core.practice.jcf_collection;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class StringCollectionUtil {

    public Collection<String> resetWordsByLength(List<String> list, int sizeWorld) {
        for (String word : list) {
            if (word.length() == sizeWorld) {
                list.set(list.indexOf(word), "*");
            }
        }
        return list;
    }

    public Collection<String> removeWordsByLength(Collection<String> collection, int sizeWorld) {
        Iterator<String> size = collection.iterator();
        while (size.hasNext()) {
            if (size.next().length() == sizeWorld) {
                size.remove();
            }
        }
        return collection;
    }
}
