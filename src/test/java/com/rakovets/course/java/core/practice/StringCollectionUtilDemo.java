package com.rakovets.course.java.core.practice;

import java.util.*;

public class StringCollectionUtilDemo {
    public static void main(String[] args) {
        StringCollectionUtil stringCollectionUtil = new StringCollectionUtil();


        List<String> strings = Arrays.asList("Java", "C++", "C<3", "Python", "Ruby", "Dart");
        ArrayList<String> arrayList = stringCollectionUtil.resetWordsByLength(strings, 4);
        for (String text : arrayList) {
            System.out.println(text);
        }

        List<String> strings2 = Arrays.asList("Java", "C++", "C<3", "Python", "Ruby", "Dart");
        ArrayList<String> arrayList2 = stringCollectionUtil.removeWordsByLength(strings2, 4);

        for (String text : arrayList2) {
            System.out.println(text);
        }

    }

}
