package com.rakovets.course.javabasics.practice.jcf.collection;

import com.rakovets.course.javabasics.StringCollectionUtil.StringCollectionUtil;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class StringCollectionUtilTest {

    @Test
    void markWordsWithLengthTest() {

        LinkedList<String> testCollection = new LinkedList<>();
        testCollection.add("this");
        testCollection.add("is");
        testCollection.add("lots");
        testCollection.add("of");
        testCollection.add("fun");
        testCollection.add("for");
        testCollection.add("Java");
        testCollection.add("programmer");

        Assertions.assertIterableEquals(Arrays.asList("*", "is", "*", "of", "fun", "for", "*", "programmer"), StringCollectionUtil.markWordsWithLength(testCollection, 4));
        Assertions.assertIterableEquals(Arrays.asList("this", "*", "lots", "*", "fun", "for", "Java", "programmer"), StringCollectionUtil.markWordsWithLength(testCollection, 2));
        Assertions.assertIterableEquals(Arrays.asList("this", "is", "lots", "of", "*", "*", "Java", "programmer"), StringCollectionUtil.markWordsWithLength(testCollection, 3));
    }

    @Test
    void removeWordsByLengthTest() {

        LinkedList<String> testCollection = new LinkedList<>();
        testCollection.add("this");
        testCollection.add("is");
        testCollection.add("lots");
        testCollection.add("of");
        testCollection.add("fun");
        testCollection.add("for");
        testCollection.add("Java");
        testCollection.add("programmer");

        Assertions.assertIterableEquals(Arrays.asList("is", "of", "fun", "for", "programmer"), StringCollectionUtil.removeWordsByLength(testCollection, 4));
        Assertions.assertIterableEquals(Arrays.asList("this", "lots", "fun", "for", "Java", "programmer"), StringCollectionUtil.removeWordsByLength(testCollection, 2));
        Assertions.assertIterableEquals(Arrays.asList("this", "is", "lots", "of", "Java", "programmer"), StringCollectionUtil.removeWordsByLength(testCollection, 3));
        Assertions.assertIterableEquals(Arrays.asList("this", "is", "lots", "of", "fun", "for", "Java"), StringCollectionUtil.removeWordsByLength(testCollection, 10));


    }
}
