package com.rakovets.course.java.core.practice.jcf.collection;

import java.util.ArrayList;
import java.util.Collection;

import java.util.List;

public class DemoStringCollectionUtil {
    public static void main(String[] args) {
        List<String> stringCollection = new ArrayList<>();
        stringCollection.add("this");
        stringCollection.add("is");
        stringCollection.add("lots");
        stringCollection.add("of");
        stringCollection.add("fun");
        stringCollection.add("for");
        stringCollection.add("every");
        stringCollection.add("Java");
        stringCollection.add("programmer");

        StringCollectionUtil.removeWordsByLength(stringCollection, 4);
        StringCollectionUtil.resetWordsByLength(stringCollection, 4);

        printStrings(stringCollection);
    }

    private static void printStrings(Collection<String> actors) {
        for (String act: actors) {
            System.out.println(act.toString());
        }
    }
}
