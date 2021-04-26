package com.rakovets.course.java.core.practice.jcf_collection.string_collection_util;

import java.util.ArrayList;
import java.util.Collection;

public class StringCollectionUtil {
    public static Collection<String> resetWordsByLength(Collection<String> arrayWords, int wordLength) {
        Collection<String> arrayList = new ArrayList<>();
        for (String element : arrayWords) {
            if (element.length() != wordLength) {
                arrayList.add(element);
            } else {
                arrayList.add("*");
            }
        }
        return arrayList;
    }

    public static Collection<String> removeWordsByLength(Collection<String> arrayWords, int wordLength) {
        Collection<String> arrayList = new ArrayList<>();
        for (String element : arrayWords) {
            if (element.length() == wordLength) {
                arrayList.remove(element);
            } else {
                arrayList.add(element);
            }
        }
        return arrayList;
    }
}
