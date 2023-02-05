package com.rakovets.course.java.core.practice.jcf_collection;

import java.util.*;

public class StringCollectionUtil {
    public ArrayList<String> resetWordsByLength (ArrayList<String> words, int num) {
        ListIterator<String> iter = words.listIterator();
        while(iter.hasNext()) {
            if (iter.next().length() == num) {
                iter.set("*");
            }
        }
        return words;
    }
    public LinkedList<String> removeWordsByLength (LinkedList<String> words, int num) {
        Iterator<String> iter = words.iterator();
        while (iter.hasNext()) {
            if (iter.next().length() == num) {
                iter.remove();
            }
        }
        return words;
    }
}
