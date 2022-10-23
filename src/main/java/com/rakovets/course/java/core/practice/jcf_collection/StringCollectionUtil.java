package com.rakovets.course.java.core.practice.jcf_collection;

import java.util.List;

public class StringCollectionUtil {
    public void resetWordsByLength(List<String> word, int n) {
        for (int i = 0; i < word.size(); i++) {
            if (word.get(i).length() == n) {
                word.set(i, "*");
            }
        }
    }

    public void removeWordsByLength(List<String> words, int n) {
        words.removeIf(s -> s.length() == n);
    }
}
