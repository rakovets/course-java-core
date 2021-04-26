package com.rakovets.course.java.core.practice.jcf_collection;
import java.util.ArrayList;
import java.util.Collection;

public class StringCollectionUtil {
    public static Collection<String> resetWordByLength(Collection<String> words, int wordsLength) {
        Collection<String> arr = new ArrayList<>();
        for (String word: words) {
            if (word.length() == wordsLength) {
                arr.add("*");
            } else {
                arr.add(word);
            }
        }
        words = arr;
        return words;
    }



    public static Collection<String> removeWordsByLength(Collection<String> words, int wordsLength) {
        Collection<String> arr = new ArrayList<>();
        for(String word: words) {
            if (word.length() == wordsLength) {
                arr.remove(word);
            } else  {
                arr.add(word);
            }
        }
        words = arr;
        return words;
    }
}
