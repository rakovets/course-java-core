package com.rakovets.course.java.core.practice.jcf.collection;

import java.util.*;

public class StringCollectionUtil {

    public static List<String> resetWordsByLength2(List<String> list, int length){
        ListIterator<String> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            String element = listIterator.next();
            if(element.length() == length){
                listIterator.set("*");
            }
        }
        return list;
    }

    public static List<String> removeWordsByLength(List<String> list, int length){
        ListIterator<String> listIterator = list.listIterator();
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
