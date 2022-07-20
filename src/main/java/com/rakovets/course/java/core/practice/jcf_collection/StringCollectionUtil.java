package com.rakovets.course.java.core.practice.jcf_collection;

import java.util.ArrayList;
import java.util.Collection;

interface StringCollectionUtil {
    /**
     * The method replaces the original string, the length of which is equal to the size of the word, with *.
     *
     * @param collection string list.
     * @param size       word size.
     * @return list after changes.
     */
    static Collection<String> resetWordsByLength(Collection<String> collection, int size) {
        Collection<String> stringCollection = new ArrayList<>();

        for (String string : collection) {
            if (string.length() != size) {
                stringCollection.add(string);
            } else {
                stringCollection.add("*");
            }
        }
        return stringCollection;
    }

    /**
     * The method removes from the list of strings all strings with a length equal to the dimension of the word.
     *
     * @param collection string list.
     * @param size       word size.
     */
    static void removeWordsByLength(Collection<String> collection, int size) {
        collection.removeIf(string -> string.length() == size);
    }
}
