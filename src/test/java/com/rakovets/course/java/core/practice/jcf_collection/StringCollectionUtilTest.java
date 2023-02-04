package com.rakovets.course.java.core.practice.jcf_collection;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

public class StringCollectionUtilTest {
    private StringCollectionUtil collectionUtil;
    private Collection<String> testCollection;
    private Collection<String> expectCollection;
    private Collection<String> actualCollection;

    @BeforeEach
    public void init() {
        collectionUtil = new StringCollectionUtil();
        testCollection = new ArrayList<>(Arrays.asList("sweet", "dreams", "are", "made", "of", "this", "who", "am", "I", "to", "disagree"));
    }

    @Test
    public void resetWordsByLengthTest1() {
        actualCollection = collectionUtil.resetWordsByLength(testCollection, 4);

        expectCollection = new ArrayList<>(Arrays.asList("sweet", "dreams", "are", "*", "of", "*", "who", "am", "I", "to", "disagree"));
        Assertions.assertEquals(expectCollection, actualCollection);
    }

    @Test
    public void resetWordsByLengthTest2() {
        actualCollection = collectionUtil.resetWordsByLength(testCollection, 3);

        expectCollection = new ArrayList<>(Arrays.asList("sweet", "dreams", "*", "made", "of", "this", "*", "am", "I", "to", "disagree"));
        Assertions.assertEquals(expectCollection, actualCollection);
    }

    @Test
    public void resetWordsByLengthTest3() {
        actualCollection = collectionUtil.resetWordsByLength(testCollection, 2);

        expectCollection = new ArrayList<>(Arrays.asList("sweet", "dreams", "are", "made", "*", "this", "who", "*", "I", "*", "disagree"));
        Assertions.assertEquals(expectCollection, actualCollection);
    }

    @Test
    public void removeWordsByLengthTest1() {
        actualCollection = collectionUtil.removeWordsByLength(testCollection, 2);

        expectCollection = new ArrayList<>(Arrays.asList("sweet", "dreams", "are", "made", "this", "who", "I", "disagree"));
        Assertions.assertEquals(expectCollection, actualCollection);
    }

    @Test
    public void removeWordsByLengthTest2() {
        actualCollection = collectionUtil.removeWordsByLength(testCollection, 4);

        expectCollection = new ArrayList<>(Arrays.asList("sweet", "dreams", "are", "of", "who", "am", "I", "to", "disagree"));
        Assertions.assertEquals(expectCollection, actualCollection);
    }

    @Test
    public void removeWordsByLengthTest3() {
        actualCollection = collectionUtil.removeWordsByLength(testCollection, 3);

        expectCollection = new ArrayList<>(Arrays.asList("sweet", "dreams", "made", "of", "this", "am", "I", "to", "disagree"));
        Assertions.assertEquals(expectCollection, actualCollection);
    }
}
