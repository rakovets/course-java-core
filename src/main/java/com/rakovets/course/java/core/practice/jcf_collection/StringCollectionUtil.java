package com.rakovets.course.java.core.practice.jcf_collection;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public abstract class StringCollectionUtil {
    public static List<String> resetWordsByLength(List<String> list, int size) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() == size) {
                list.set(i, "*");
            }
        }
        return list;
    }

    public static Collection<String> removeWordsByLength(Collection<String> col, int size) {
        Iterator<String> si = col.iterator();
        while (si.hasNext()) {
            if (si.next().length() == size) {
                si.remove();
            }
        }
        return col;
    }
}
