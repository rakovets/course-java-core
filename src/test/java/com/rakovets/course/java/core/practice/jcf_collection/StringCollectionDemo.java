package com.rakovets.course.java.core.practice.jcf_collection;

import java.util.ArrayList;
import java.util.Collection;

public class StringCollectionDemo {
    public static void main(String[] args) {
        Collection<String> words = new ArrayList<>();
        Collection<String> fix;
        words.add("this");
        words.add("is");
        words.add("lots");
        words.add("of");
        words.add("fun");
        words.add("for");
        words.add("every");
        words.add("Java");
        words.add("programmer");

        System.out.println("\nThis is the original collection:");
        print(words);

        System.out.println("\nNew collection of words after replacement:");
        fix = StringCollectionUtil.resetWordsByLength(words, 4);
        print(fix);

        System.out.println("\nNew collection of words after deleting:");
        words = StringCollectionUtil.removeWordsByLength(words, 4);
        print(words);
    }

    public static void print(Collection<String> collection) {
        for (String word : collection) {
            System.out.print(word + " ");
        }
        System.out.println("");
    }
}
