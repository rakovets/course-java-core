package com.rakovets.course.java.core.practice.jcf_collection.string_collection_util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class StringCollectionUtil {

    public Collection<String> resetWordsByLength(ArrayList<String> words, int wordLength) {
        for (String word : words) {
            if (word.length() == wordLength) {
                words.set(words.indexOf(word), "*");
            }
        }
        return words;
    }

    public Collection<String> removeWordsByLength(ArrayList<String> words, int wordLength) {
        Iterator<String> iterator = words.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().length() == wordLength) {
                iterator.remove();
            }
        }
        return words;
    }
}
