package com.rakovets.course.java.core.practice.jcf_collection;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class StringCollectionUtilTest {
    private StringCollectionUtil stringCollectionUtil;
    private Collection<String> collection;
    private String replaceWord;

    @BeforeEach
    void setUp() {
        stringCollectionUtil = new StringCollectionUtil();
        replaceWord = "*";
        collection = new ArrayList<>(Arrays.asList("this", "is", "lots", "of", "fun", "for", "every", "Java", "programmer"));
    }

    @Test
    public void testResetWordsByLength() {
        Collection<String> expected = Arrays.asList(replaceWord, "is", replaceWord, "of", "fun", "for", "every", replaceWord, "programmer");
        Collection<String> actual = stringCollectionUtil.resetWordsByLength(collection, 4, replaceWord);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testRemoveWordsByLength() {
        Collection<String> expected = Arrays.asList("is", "of", "fun", "for", "every", "programmer");
        Collection<String> actual = stringCollectionUtil.removeWordsByLength(collection, 4);
        Assertions.assertEquals(expected, actual);
    }
}
