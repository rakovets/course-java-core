package com.rakovets.course.java.core.practice.jcf_collection;

import java.util.*;

public class StringCollectionUtil {
    /**
     * The method replaces the original string, the length of which is equal to the size of the word (as parameter), with *.
     *
     * @param list     list of strings
     * @param wordSize size of the word length to be used to replace with "*"
     * @return list of strings with replaced words on "*"
     */
    public List<String> resetWordsByLength(List<String> list, int wordSize) {
        for (String s : list) {
            if (s.length() == wordSize) {
                list.set(list.indexOf(s), "*");
            }
        }
        return list;
    }

    /**
     * The method removes from the list of strings all strings with a length equal to the dimension of the word.
     *
     * @param collection list of strings
     * @param wordSize   size of the word length to be used to remove
     * @return list of strings with removed words
     */
    public Collection<String> removeWordsByLength(Collection<String> collection, int wordSize) {
        Iterator<String> iterator = collection.iterator();

        while (iterator.hasNext()) {
            if (iterator.next().length() == wordSize) {
                iterator.remove();
            }
        }
        return collection;
    }
}
