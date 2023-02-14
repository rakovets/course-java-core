package com.rakovets.course.java.core.practice.jcf_collection;

import java.util.LinkedList;
import java.util.List;

public class StringCollectionUtilDemo {
    public static void main(String[] args) {
        String[] strings = {"this", "is", "lots", "of", "fun", "for", "every", "Java", "programmer"};
        StringCollectionUtil scu = new StringCollectionUtil();
        List<String> lof = scu.resetWordsByLength(strings, 4);
        System.out.println(lof);

        List<String> list = List.of("this", "is", "lots", "of", "fun", "for", "every", "Java", "programmer");
        List<String> stringList = new LinkedList<>(list);
        List<String> newList = StringCollectionUtil.removeWordsByLength(stringList, 4);
        System.out.println(newList);
    }
}
