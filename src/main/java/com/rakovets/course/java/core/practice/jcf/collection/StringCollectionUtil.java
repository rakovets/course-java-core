package com.rakovets.course.java.core.practice.jcf.collection;

import java.util.*;

public class StringCollectionUtil {

    public static Collection<String> resetWordsByLength(Collection <String> list, int length){
        ListIterator<String> listIterator = new ArrayList<>(list).listIterator();
        while (listIterator.hasNext()) {
            String element = listIterator.next();
            if(element.length() == length){
                listIterator.set("*");
            }
        }
        return list;
    }

    public static Collection<String> removeWordsByLength(Collection<String> list, int length){
        ListIterator<String> listIterator = new ArrayList<>(list).listIterator();
        List<String> toRemove = new ArrayList<String>();
        while (listIterator.hasNext()) {
            String element = listIterator.next();
            if(element.length() == length){
                toRemove.add(element);
            }
        }
        list.remove(toRemove);
        return list;
    }
}
