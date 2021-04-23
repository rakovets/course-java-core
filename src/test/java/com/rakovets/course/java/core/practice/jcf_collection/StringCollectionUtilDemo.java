package com.rakovets.course.java.core.practice.jcf_collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class StringCollectionUtilDemo {
    public static void main(String[] args) {
        Collection<String> listOfWords = new ArrayList<>();
        listOfWords.add("this");
        listOfWords.add("is");
        listOfWords.add("lots");
        listOfWords.add("of");
        listOfWords.add("fun");
        listOfWords.add("for");
        listOfWords.add("Java");
        listOfWords.add("programmer");

        System.out.println(StringCollectionUtil.resetWordsByLength(listOfWords, 3).toString());
        System.out.println(StringCollectionUtil.removeWordsByLength(listOfWords,3).toString());

    }
}
