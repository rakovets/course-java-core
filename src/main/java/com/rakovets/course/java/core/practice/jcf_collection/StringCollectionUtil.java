package com.rakovets.course.java.core.practice.jcf_collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

public class StringCollectionUtil {
    public Collection<String> resetWordsByLength(Collection<String> collection, Integer wordLength) {
        Collection<String> collectionTwo = new ArrayList<>();
        for (String word : collection) {
            if (word.length() == wordLength) {
                collectionTwo.add("*");
            } else {
                collectionTwo.add(word);
            }
        }
        return collectionTwo;
    }

    public Collection<String> removeWordsByLength(Collection<String> collection, Integer wordLength) {
        Collection<String> collectionTwo = new ArrayList<>();
        for (String word : collection) {
            if (word.length() != wordLength) {
                collectionTwo.add(word);
            }
        }
        return collectionTwo;
    }
}
//    public List<String> resetWordsByLength(List<String> listString, Integer wordLength) {
//        ListIterator<String> listIterator = listString.listIterator();
//        while (listIterator.hasNext()) {
//            if (listIterator.next().length() == wordLength) {
//                listIterator.set("*");
//            }
//        }
//        return listString;
//    }
//ListIterator<String> listIterator = listString.listIterator();
//        while (listIterator.hasNext()) {
//        if (listIterator.next().length() == wordLength) {
//            listIterator.remove();
//        }
//    }
//        return listString;



