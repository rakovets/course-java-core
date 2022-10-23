package com.rakovets.course.java.core.practice.jcf_collection;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.List;

public class TestStringCollectionUtil {
    StringCollectionUtil testCollection = new StringCollectionUtil();
    List<String> list = testCollection.makeList();
    int wordLength = 4;

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
