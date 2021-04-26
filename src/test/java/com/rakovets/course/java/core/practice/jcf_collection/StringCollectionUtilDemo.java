package com.rakovets.course.java.core.practice.jcf_collection;

import java.util.ArrayList;

public class StringCollectionUtilDemo {
    public static void main(String[] args) {
        ArrayList<String>words = new ArrayList<>();
        words.add("this");
        words.add("is");
        words.add("lots");
        words.add("of");
        words.add("fun");
        words.add("for");
        words.add("every");
        words.add("Java");
        words.add("programmer");
        System.out.println(words);

        StringCollectionUtil.resetWordsByLength(words ,4);
        System.out.println(words);
        words.set(0,"this");
        words.set(2,"lots");
        words.set(7,"Java");
        System.out.println(words);

        StringCollectionUtil.removeWordsByLength(words,2);
        System.out.println(words);
    }
}
