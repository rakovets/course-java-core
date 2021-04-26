package com.rakovets.course.java.core.practice.jcf_collection;

import com.rakovets.course.java.core.practice.jcf_collection.string_collection_util.StringCollectionUtil;

import java.util.ArrayList;

public class StringCollectionUtilDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("qwe");
        list.add("qwer");
        list.add("qasdfg");
        list.add("qgkd");
        list.add("qmammv");
        System.out.println(StringCollectionUtil.resetWordsByLength(list, 4));
        System.out.println(StringCollectionUtil.removeWordsByLength(list, 3));
        System.out.println(StringCollectionUtil.removeWordsByLength(new ArrayList<>(), 4));
    }
}
