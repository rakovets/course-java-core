package com.rakovets.course.java.core.practice.jcf_collection;

import java.util.ArrayList;
import java.util.Collection;

public class StringCollectionUtil {
    public static Collection<String> resetWordsByLength(Collection<String> words, int lengthWord) {
        Collection<String> fixCollection = new ArrayList<>();
        for (String word : words) {
            if (word.length() == lengthWord) {
                fixCollection.add("*");
            } else {
                fixCollection.add(word);
            }
        }
        words = fixCollection;
        return words;
    }

    public static Collection<String> removeWordsByLength(Collection<String> words, int lengthWord) {
        Collection<String> fixCollection = new ArrayList<>();
        fixCollection.addAll(words);
        for (String word : words) {
            if (word.length() == lengthWord) {
                fixCollection.remove(word);
            }
        }
        words = fixCollection;
        return words;
    }
}
