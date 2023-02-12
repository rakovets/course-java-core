package com.rakovets.course.java.core.practice.jcf_collection;

import java.util.ArrayList;
import java.util.Collection;

public class StringCollectionUtil {
    public Collection<String> resetWordsByLength(Collection<String> stringCollection, int wordLength) {
        isValidWordLength(wordLength);
        Collection<String> collection = new ArrayList<>();
        for (String word : stringCollection) {
            if (word.length() == wordLength) {
                collection.add("*");
                continue;
            }
            collection.add(word);
        }
        return collection;
    }

    public Collection<String> removeWordsByLength(Collection<String> stringCollection, int wordLength) {
        /*
        Idea's solution about this code "The loop can be replaced with 'Collection.removeIf'"
        Iterator<String> iterator = collection.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().length() == wordLength) {
                iterator.remove();
            }
        }
        */
        isValidWordLength(wordLength);
        stringCollection.removeIf(s -> s.length() == wordLength);
        return stringCollection;
    }

    private void isValidWordLength(int wordLength) {
        if (wordLength < 0) throw new NotValidWordLengthException();
    }
}
