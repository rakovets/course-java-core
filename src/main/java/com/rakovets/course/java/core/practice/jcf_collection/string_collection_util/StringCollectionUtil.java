package com.rakovets.course.java.core.practice.jcf_collection.string_collection_util;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

public class StringCollectionUtil {
    public Collection<String> resetWordsByLength(List<String> words, int wordLength) {
        ListIterator<String> wordsList = words.listIterator();
        while (wordsList.hasNext()) {
            if (wordsList.next().length() == wordLength) {
                wordsList.set("*");
            }
        }
        return words;
    }

    public Collection<String> removeWordsByLength(List<String> words, int wordLength) {
        words.removeIf(s -> s.length() == wordLength);
        return words;
    }
}
