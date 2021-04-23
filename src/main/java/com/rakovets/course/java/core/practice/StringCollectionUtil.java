package com.rakovets.course.java.core.practice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class StringCollectionUtil {
    public ArrayList<String> resetWordsByLength(Collection<String> collection, int lenght) {
        ArrayList<String> arrayList = new ArrayList<>(collection);
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).length() == lenght) {
                arrayList.set(i,"*");
            }
        }
        return arrayList;
    }

    public ArrayList<String> removeWordsByLength(List<String> list, int length) {
        ArrayList<String> arrayList = new ArrayList<>(list);
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).length() == length) {
                arrayList.remove(i);
            }
        }
        return arrayList;
    }
}
