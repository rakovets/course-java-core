package com.rakovets.course.java.core.practice.jcf_collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class StringCollectionDemo {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        List<String> fixWords = new ArrayList<>();
        words.add("this");
        words.add("is");
        words.add("lots");
        words.add("of");
        words.add("fun");
        words.add("for");
        words.add("every");
        words.add("Java");
        words.add("programmer");
        fixWords.addAll(words);

        StringCollectionUtil.resetWordsByLength(fixWords, 4);

        ListIterator<String> iterator = fixWords.listIterator();
        System.out.println("\nNew collection of words after replacement:");
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

        StringCollectionUtil.removeWordsByLength(words, 4);

        ListIterator<String> iterator1 = words.listIterator();
        System.out.println("\n\nNew collection of words after deleting:");
        while (iterator1.hasNext()) {
            System.out.print(iterator1.next() + " ");
        }
        System.out.println("");
    }
}
