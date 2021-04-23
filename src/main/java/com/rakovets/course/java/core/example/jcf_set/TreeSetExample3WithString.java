package com.rakovets.course.java.core.example.jcf_set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample3WithString {
    public static void main(String[] args) {
        Set<String> set = new TreeSet<>();

        set.add("two");
        set.add("one");
        set.add("three");

        for (String s : set) {
            System.out.println(s);
        }
    }
}

