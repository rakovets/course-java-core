package com.rakovets.course.java.core.practice.jcf_collection;

import java.util.LinkedList;
import java.util.List;

public class StringCollectionUtilDemo {
    public static void main(String[] args) {
        List<String> collection = new LinkedList<>();
        collection.add("this");
        collection.add("is");
        collection.add("lots");
        collection.add("of");
        collection.add("fun");
        collection.add("fun");
        collection.add("for");
        collection.add("every");
        collection.add("Java");
        collection.add("programmer");
        System.out.println(collection);
       // StringCollectionUtil.resetWordsByLength(collection,4);
        StringCollectionUtil.removeWordsByLength(collection,4);
        System.out.println(collection);


    }
}
