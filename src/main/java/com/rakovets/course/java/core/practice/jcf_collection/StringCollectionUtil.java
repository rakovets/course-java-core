package com.rakovets.course.java.core.practice.jcf_collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StringCollectionUtil {

    public List<String> resetWordsByLength(String[] strings, int numberOfLetters) {
        List<String> stringList = new ArrayList<>();
        for (String str : strings) {
            if (str.length() == numberOfLetters) {
                stringList.add("*");
            } else {
                stringList.add(str);
            }
        }
        return stringList;
    }

    public static List<String> removeWordsByLength(List<String> strings, int numberOfLetters) {
        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().length() == numberOfLetters) {
                iterator.remove();
            }
        }
        return strings;
    }
}
