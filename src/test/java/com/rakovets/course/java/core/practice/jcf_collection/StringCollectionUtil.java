package com.rakovets.course.java.core.practice.jcf_collection;

import java.util.*;

public class StringCollectionUtil {
    public ArrayList<String> resetWordsByLength(ArrayList<String> words, int number) {
        ListIterator<String> iterator = words.listIterator();
        while (iterator.hasNext()) {
            if (iterator.next().length() == number) {
                iterator.set("*");
            }
        }
        return words;
    }

    public LinkedList<String> removeWordsByLength(LinkedList<String> words, int number) {
        Iterator<String> iterator = words.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().length() == number) {
                iterator.remove();
            }
        }
        return words;
    }
}
