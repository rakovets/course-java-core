package com.rakovets.course.java.core.practice.jcf_collection;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class StringCollectionUtil {
    public void resetWordsByLength(List<String> collection, int size) {
        ListIterator<String> list = collection.listIterator();
        while (list.hasNext()) {
            if (list.next().length() == size) {
                list.set("*");
            }
        }
    }

    public void removeWordsByLength1(Collection<String> strings, int size) {
        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().length() == size) {
                iterator.remove();
            }
        }
    }
}
