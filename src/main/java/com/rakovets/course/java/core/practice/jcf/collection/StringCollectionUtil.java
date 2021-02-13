package com.rakovets.course.java.core.practice.jcf.collection;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class StringCollectionUtil {
    public static List<String> resetWordsByLength(List<String> list, int size) {
        ListIterator<String> iter = list.listIterator();
        while (iter.hasNext()){
            if (iter.next().length() == size) {
                iter.set("*");
            }
        }
        return list;
    }

    public static Collection<String> removeWordsByLength(Collection<String> list, int size) {
        Iterator<String> iter = list.iterator();
        while (iter.hasNext()){
            if (iter.next().length() == size) {
                iter.remove();
            }
        }
        return list;
    }
}
