package com.rakovets.course.java.core.practice.jcf_collection.string_collection_util;

import java.util.List;

public class StringCollectionUtil {
    public void resetWordsByLength(List<String> stringList, int wordSize) {
        for (int i = 0; i < stringList.size(); i++) {
            if (stringList.get(i).length() == wordSize) {
                stringList.set(i, "*");
            }
        }
    }

    public void removeWordsByLength(List<String> stringList, int wordSize) {
        for (int i = 0; i < stringList.size(); i++) {
            if (stringList.get(i).length() == wordSize) {
                stringList.remove(i);
                i--;
            }
        }
    }
}
