package com.rakovets.course.java.core.practice.jcf_collection;

import java.util.ArrayList;
import java.util.Arrays;

public class Demo {
    public static void main(java.lang.String[] args) {
        String mama = new String("mama");
        String count = new String("123");
        String number = new String("4567");
        String dad = new String("dad");
        String maksim = new String("Maksim");
        String sunny = new String("Sunny");
        String kitty = new String("Kitty");
        String sun = new String("Sun");
        ArrayList<String> line = new ArrayList<>(Arrays.asList(mama, count, number, dad,
                maksim, sunny, kitty, sun));
        System.out.println(line);
        System.out.println("____________");
        StringCollectionUtil collection = new StringCollectionUtil();
        collection.removeWordsByLength(line, 4);
        for (String a : line) {
            System.out.println(a);
        }
        System.out.println("____________");
        ArrayList<String> line2 = new ArrayList<>(Arrays.asList(mama, count, number, dad,
                maksim, sunny, kitty, sun));
        System.out.println(line2);
        StringCollectionUtil collection2 = new StringCollectionUtil();
        collection2.resetWordsByLength(line2, 4);
        for (String b : line2) {
            System.out.println(b);
        }
    }
}
