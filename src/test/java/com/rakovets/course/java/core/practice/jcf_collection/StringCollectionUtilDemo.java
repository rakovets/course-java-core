package com.rakovets.course.java.core.practice.jcf_collection;

import java.util.ArrayList;
import java.util.Collection;

public class StringCollectionUtilDemo {
    public static void main(String[] args) {
        ArrayList<String> states = new ArrayList<String>();
        states.add("Germany");
        states.add("France");
        states.add("Italy");
        states.add("Spain");
        states.add("Poland");
        states.add("Nigeria");
        states.add("Latvia");
        states.add("Finland");

        StringCollectionUtil stringCollectionUtil = new StringCollectionUtil();

        System.out.println("resetWordsByLength demo1: ");
        Collection<String> result = stringCollectionUtil.resetWordsByLength(states, 5);
        print(result);

        System.out.println("resetWordsByLength demo2: ");
        Collection<String> result2 = stringCollectionUtil.resetWordsByLength(states, 7);
        print(result2);

        System.out.println("resetWordsByLength demo3: ");
        Collection<String> result3 = stringCollectionUtil.resetWordsByLength(states, 6);
        print(result3);

        System.out.println("removeWordsByLength demo1: ");
        Collection<String> result4 = stringCollectionUtil.removeWordsByLength(states, 5);
        print(result4);

        System.out.println("removeWordsByLength demo1: ");
        Collection<String> result5 = stringCollectionUtil.removeWordsByLength(states, 7);
        print(result5);

        System.out.println("removeWordsByLength demo1: ");
        Collection<String> result6 = stringCollectionUtil.removeWordsByLength(states, 6);
        print(result6);
    }

    public static void print(Collection<String> collection) {
        for (String i : collection) {
            System.out.println(i);
        }
        System.out.println(" ");
    }
}
