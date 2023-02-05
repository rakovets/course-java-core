package com.rakovets.course.java.core.practice.jcf_collection;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.LinkedList;

public class StringCollectionUtillTest {
    StringCollectionUtil str = new StringCollectionUtil();
    ArrayList<String> words = new ArrayList<>();
    ArrayList<String> words1 = new ArrayList<>();
    LinkedList<String> linkedWords = new LinkedList<>();
    LinkedList<String> linkedWords1 = new LinkedList<>();

    @Test
        // task2
    void resetWordsByLengthTest () {
        words.add("Germany");
        words.add("Poland");
        words.add("Denmark");
        words.add("USA");
        words1.add("Germany");
        words1.add("Poland");
        words1.add("Denmark");
        words1.add("*");
        Assertions.assertEquals(words1,str.resetWordsByLength(words,3));
        words1.set(1,"*");
        Assertions.assertEquals(words1,str.resetWordsByLength(words,6));
        words1.set(0,"*");
        words1.set(2,"*");
        Assertions.assertEquals(words1,str.resetWordsByLength(words,7));

    }

    @Test //task3
    void removeWordsByLengthTest () {
        linkedWords.add("Germany");
        linkedWords.add("Poland");
        linkedWords.add("USA");
        linkedWords.add("France");
        linkedWords.add("Finland");
        linkedWords1 = (LinkedList<String>) linkedWords.clone();
        linkedWords1.remove("USA");
        Assertions.assertEquals(linkedWords1,str.removeWordsByLength(linkedWords,3));
        linkedWords1.remove("Poland");
        linkedWords1.remove("France");
        Assertions.assertEquals(linkedWords1,str.removeWordsByLength(linkedWords,6));
        linkedWords1.remove("Germany");
        linkedWords1.remove("Finland");
        Assertions.assertEquals(linkedWords1,str.removeWordsByLength(linkedWords,7));

    }
}
