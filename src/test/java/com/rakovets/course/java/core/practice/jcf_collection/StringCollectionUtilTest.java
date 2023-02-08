package com.rakovets.course.java.core.practice.jcf_collection;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class StringCollectionUtilTest {
    private StringCollectionUtil collectionUtil;
    private Collection<String> testCollection;

    @BeforeEach
    public void init() {
        collectionUtil = new StringCollectionUtil();
        testCollection = new ArrayList<>(Arrays.asList("sweet", "dreams", "are", "made", "of", "this", "who", "am", "I", "to", "disagree"));
    }

    @Test
    public void resetWordsByLengthTest1() {
        Collection<String> actualCollection = collectionUtil.resetWordsByLength(testCollection, 4);

        Collection<String> expectCollection = new ArrayList<>(Arrays.asList("sweet", "dreams", "are", "*", "of", "*", "who", "am", "I", "to", "disagree"));
        Assertions.assertEquals(expectCollection, actualCollection);
    }

    @Test
    public void resetWordsByLengthTest2() {
        Collection<String> actualCollection = collectionUtil.resetWordsByLength(testCollection, 3);

        Collection<String> expectCollection = new ArrayList<>(Arrays.asList("sweet", "dreams", "*", "made", "of", "this", "*", "am", "I", "to", "disagree"));
        Assertions.assertEquals(expectCollection, actualCollection);
    }

    @Test
    public void resetWordsByLengthTest3() {
        Collection<String> actualCollection = collectionUtil.resetWordsByLength(testCollection, 2);

        Collection<String> expectCollection = new ArrayList<>(Arrays.asList("sweet", "dreams", "are", "made", "*", "this", "who", "*", "I", "*", "disagree"));
        Assertions.assertEquals(expectCollection, actualCollection);
    }

    @Test
    public void removeWordsByLengthTest1() {
        Collection<String> actualCollection = collectionUtil.removeWordsByLength(testCollection, 2);

        Collection<String> expectCollection = new ArrayList<>(Arrays.asList("sweet", "dreams", "are", "made", "this", "who", "I", "disagree"));
        Assertions.assertEquals(expectCollection, actualCollection);
    }

    @Test
    public void removeWordsByLengthTest2() {
        Collection<String> actualCollection = collectionUtil.removeWordsByLength(testCollection, 4);

        Collection<String> expectCollection = new ArrayList<>(Arrays.asList("sweet", "dreams", "are", "of", "who", "am", "I", "to", "disagree"));
        Assertions.assertEquals(expectCollection, actualCollection);
    }

    @Test
    public void removeWordsByLengthTest3() {
        Collection<String> actualCollection = collectionUtil.removeWordsByLength(testCollection, 3);

        Collection<String> expectCollection = new ArrayList<>(Arrays.asList("sweet", "dreams", "made", "of", "this", "am", "I", "to", "disagree"));
        Assertions.assertEquals(expectCollection, actualCollection);
    }
}
