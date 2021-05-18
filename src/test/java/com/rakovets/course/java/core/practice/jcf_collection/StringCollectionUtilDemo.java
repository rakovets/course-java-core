package com.rakovets.course.java.core.practice.jcf_collection;

import com.rakovets.course.java.core.practice.jcf_collection.string_collection_util.StringCollectionUtil;

import java.util.ArrayList;
import java.util.Collection;

public class StringCollectionUtilDemo {
    public static void main(String[] args) {
        ArrayList<String> collection = new ArrayList<>();
        collection.add("a");
        collection.add("ab");
        collection.add("abc");
        collection.add("abcd");
        collection.add("abcde");
        collection.add("abcde");
        collection.add("abcd");
        collection.add("abc");
        collection.add("ab");
        collection.add("a");

        StringCollectionUtil stringCollectionUtil = new StringCollectionUtil();
        System.out.println(stringCollectionUtil.resetWordsByLength(collection,2));
        System.out.println(stringCollectionUtil.removeWordsByLength(collection, 3));
    }
}
