package com.rakovets.course.java.core.practice.jcf.collection;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class StringCollectionUtil {
    public static void resetWordsByLength(List<String> str, int size) {
        for (int i = 0; i < str.size(); i++) {
            if (str.get(i).length() == size) {
                str.set(i, "*");
            }
        }
    }

    public static void removeWordsByLength(Collection<String> str, int size) {
        Iterator<String> iterator = str.iterator();
        while (iterator.hasNext()) {
            String str1 = iterator.next();
            if (str1.length() == size) {
                iterator.remove();
            }
        }
    }
}
