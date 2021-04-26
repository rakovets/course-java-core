package com.rakovets.course.java.core.practice.jcf_collection;

import java.util.ArrayList;
import java.util.Collection;

public class StringCollectionUtil {
    public static Collection<String> resetWordsByLength(Collection<String> collection, int wordLength) {
        ArrayList<String> words = new ArrayList<>(collection);
        for (int i = 0; i < words.size(); i++) {
            if (words.get(i).length() == wordLength) {
                words.set(i, "*");
            }
        }
        return words;
    }

    public static Collection<String> removeWordsByLength(Collection<String> collection, int wordLength) {
        ArrayList<String> words = new ArrayList<>(collection);
        for (int i = 0; i < words.size(); i++) {
            if (words.get(i).length() == wordLength) {
                words.remove(i);
            }
        }
        return words;
    }
}
