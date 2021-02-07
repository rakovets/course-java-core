package com.rakovets.course.java.core.practice.jcf.collection;

import java.util.ArrayList;
import java.util.List;

public class StringCollectionUtilDemo {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Alex");
        names.add("Arthur");
        names.add("Ivan");
        names.add("Marina");
        names.add("Sergio");
        names.add("Nana");
        names.add("Anastasia");

        StringCollectionUtil.resetWordsByLength(names, 4);
        for (String name : names) {
            System.out.println(name);
        }
        System.out.print("\n");

        StringCollectionUtil.removeWordsByLength(names, 1);
        for (String name : names) {
            System.out.println(name);
        }
    }
}
