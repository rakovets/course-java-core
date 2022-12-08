package com.rakovets.course.java.core.practice.jcf_collection;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class TestStringCollectionUtil {
    private StringCollectionUtil testCollection;
    private  List<String> list;
    private int wordLength;
    @BeforeEach
    void unit() {
        testCollection = new StringCollectionUtil();
        list = new ArrayList<>();
        list.add("This");
        list.add("is");
        list.add("lots");
        list.add("of");
        list.add("fun");
        list.add("for");
        list.add("every");
        list.add("Java");
        list.add("programmer");
        wordLength = 4;
    }

    @Test
    void testResetWordsByLength() {
        List<String> actual = testCollection.resetWordsByLength(list, wordLength);
        List<String> expected = List.of("*", "is", "*", "of", "fun", "for", "every", "*", "programmer");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testRemoveWordsByLength() {
        Collection<String> actual = testCollection.removeWordsByLength(list, wordLength);
        Collection<String> expected = List.of("is", "of", "fun", "for", "every", "programmer");

        Assertions.assertEquals(expected, actual);
    }
}
