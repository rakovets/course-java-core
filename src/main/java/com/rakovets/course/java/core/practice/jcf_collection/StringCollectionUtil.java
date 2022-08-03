package com.rakovets.course.java.core.practice.jcf_collection;

import java.util.ArrayList;
import java.util.Collection;

public class StringCollectionUtil {
    public Collection<String> resetWordsByLength(Collection<String> inputCollection, int wordSize, String replaceWord) {
        Collection<String> resultCollection = new ArrayList<>();
        for (String word : inputCollection) {
            if (word.length() == wordSize) {
                resultCollection.add(replaceWord);
            } else {
                resultCollection.add(word);
            }
        }
        return resultCollection;
    }

    public Collection<String> removeWordsByLength(Collection<String> inputCollection, int wordSize) {
        Collection<String> resultCollection = new ArrayList<>();
        for (String word : inputCollection) {
            if (word.length() == wordSize) {
                resultCollection.remove(word);
            } else {
                resultCollection.add(word);
            }
        }
        return resultCollection;
    }
}
