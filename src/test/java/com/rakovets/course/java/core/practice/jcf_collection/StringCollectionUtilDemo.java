package com.rakovets.course.java.core.practice.jcf_collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class StringCollectionUtilDemo {
    public static void main(String[] args) {
        ArrayList<String> states = new ArrayList<String>();
        states.add("Germany");
        states.add("France");
        states.add("Italy");
        states.add("Spain");

        StringCollectionUtil stringCollectionUtil = new StringCollectionUtil();

        stringCollectionUtil.resetWordsByLength(states, 5);

        ListIterator<String> listIter = states.listIterator();
        while (listIter.hasNext()) {
            System.out.println(listIter.next());
        }

        System.out.println("\nremoveWordsByLength:\n");

        stringCollectionUtil.removeWordsByLength(states, 1);

        ListIterator<String> listIter2 = states.listIterator();
        while (listIter2.hasNext()) {
            System.out.println(listIter2.next());
        }
    }
}
