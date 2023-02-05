package com.rakovets.course.java.core.practice.jcf_collection;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class StringCollectionUtilTest {
    private StringCollectionUtil collectionUtil;
    private Collection<String> collection;

    @BeforeEach
    void init() {
        collection = new ArrayList<>(Arrays.asList("1", "11", "111", "11"));
        collectionUtil = new StringCollectionUtil();
    }

    @DisplayName("Test of resetWordsByLength(), returns Collection<String> according replaced elements with \n" +
            "given length to '*', assertTrue()")
    @Test
    void resetWordsByLengthTest1() {
        collection = collectionUtil.resetWordsByLength(collection, 2);
        boolean expected = collection.equals((new ArrayList<>(Arrays.asList("1", "*", "111", "*"))));

        System.out.println(collection);
        Assertions.assertTrue(expected);
    }

    @DisplayName("Test of resetWordsByLength(), returns Collection<String> according replaced elements with \n" +
            "given length to '*', assertFalse()")
    @Test
    void resetWordsByLengthTest2() {
        collection = collectionUtil.resetWordsByLength(collection, 2);
        boolean expected = collection.equals((new ArrayList<>(Arrays.asList("1", "11", "*", "11"))));

        System.out.println(collection);
        Assertions.assertFalse(expected);
    }

    @DisplayName("Test of removeWordsByLength(), returns Collection<String> according deleted elements with \n" +
            "given length to '*', assertTrue()")
    @Test
    void removeWordsByLengthTest1() {
        collection = collectionUtil.removeWordsByLength(collection, 1);
        boolean expected = collection.equals(new ArrayList<>(Arrays.asList("11", "111", "11")));

        System.out.println(collection);
        Assertions.assertTrue(expected);
    }

    @DisplayName("Test of removeWordsByLength(), returns Collection<String> according deleted elements with \n" +
            "given length to '*', assertFalse()")
    @Test
    void removeWordsByLengthTest2() {
        collection = collectionUtil.removeWordsByLength(collection, 1);
        boolean expected = collection.equals(new ArrayList<>(Arrays.asList("11", "11")));

        System.out.println(collection);
        Assertions.assertFalse(expected);
    }
}
