package com.rakovets.course.javabasics.example.generics.model;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public class StringCollectionUtil {
    public static Collection<String> resetWordsByLength(Collection<String> collection, int length) {
        Collection<String> collectionNewReset = new LinkedList<>();
        for (String string : collection) {
            if (string.length() != length) {
                collectionNewReset.add(string);
            } else {
                collectionNewReset.add("*");
            }
        } return collectionNewReset;
    }


    public static void removeWordsByLength(Collection<String> collection, int length) {
        Iterator<String> iterator = collection.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().length() == length) {
                iterator.remove();
            }
        }
    }
}


