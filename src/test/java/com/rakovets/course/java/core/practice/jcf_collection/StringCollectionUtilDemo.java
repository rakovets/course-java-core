package com.rakovets.course.java.core.practice.jcf_collection;

import java.util.ArrayList;
import java.util.Collection;

public class StringCollectionUtilDemo {
    public static void main(String[] args) {
        Collection<String> words = new ArrayList<>();
        words.add("this");
        words.add("is");
        words.add("lots");
        words.add("of");
        words.add("fun");
        words.add("for");
        words.add("every");
        words.add("Java");
        words.add("programmer");

        System.out.println(StringCollectionUtil.resetWordsByLength(words, 2).toString());
        System.out.println(StringCollectionUtil.removeWordsByLength(words,4).toString());
    }
}
