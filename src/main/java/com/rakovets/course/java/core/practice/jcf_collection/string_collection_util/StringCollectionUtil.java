package com.rakovets.course.java.core.practice.jcf_collection.string_collection_util;

import java.util.ArrayList;

public class StringCollectionUtil {

    public static ArrayList<String> resetWordsByLength(ArrayList<String> list, int size) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() == size) {
                list.set(i, "*");
            }
        }
        return list;
    }

    public static ArrayList<String> removeWordsByLength(ArrayList<String> list, int size) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() == size) {
                list.remove(i);
            }
        }
        return list;
    }
}
