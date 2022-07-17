package com.rakovets.course.java.core.practice.jcf_collection;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class StringCollectionUtilTest {
    private final StringCollectionUtil stringCollectionUtil = new StringCollectionUtil();

    @Test
    public void testResetWordsByLength() {
        List<String> list = Arrays.asList("this", "is", "lots", "of", "fun", "for", "every", "Java", "programmer");

        List<String> expected = Arrays.asList("*", "is", "*", "of", "fun", "for", "every", "*", "programmer");

        Assertions.assertEquals(expected, (stringCollectionUtil.resetWordsByLength(list, 4)));
    }

    @Test
    public void testRemoveWordsByLength() {
        Collection<String> collection = new ArrayList<>(Arrays.asList("this", "is", "lots", "of", "fun", "for", "every", "Java", "programmer"));

        Collection<String> expected = Arrays.asList("is", "of", "fun", "for", "every", "programmer");

        Assertions.assertEquals(expected, stringCollectionUtil.removeWordsByLength(collection, 4));
    }
}
