package com.rakovets.course.java.core.practice.jcf_collection;

import java.util.ArrayList;
import java.util.Collection;

public class StringCollectionUtilDemo {
    public static void main(String[] args) {
        Collection<String> words = new ArrayList();
        words.add("12341");
        words.add("123");
        words.add("12");
        words.add("1231");
        System.out.println(StringCollectionUtil.resetWordByLength(words, 4));
        System.out.println(StringCollectionUtil.removeWordsByLength(words, 3));
    }
}
