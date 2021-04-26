package com.rakovets.course.java.core.practice.jcf_collection;

import com.rakovets.course.java.core.practice.jcf_collection.string_collection_util.StringCollectionUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class StringCollectionUtilDemo {
    public static void main(String[] args) {
        Collection<String> strings = new ArrayList<>(Arrays.asList("this", "is", "lots", "of", "fun", "for", "every", "Java", "programmer"));

        System.out.println(strings);
        System.out.println(StringCollectionUtil.resetWordsByLength(strings,2));
        System.out.println(StringCollectionUtil.removeWordsByLength(strings, 2));
    }
}
