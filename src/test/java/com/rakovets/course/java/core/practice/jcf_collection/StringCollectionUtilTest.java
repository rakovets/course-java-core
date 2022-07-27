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
        List<String> list = Arrays.asList("Summer", "is", "always", "a", "lot", "of", "fun", "for", "children", "!");
        List<String> expected = Arrays.asList("Summer", "is", "always", "a", "*", "of", "*", "*", "children", "!");

        Collection<String> actual = stringCollectionUtil.resetWordsByLength(list, 3, "*");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testRemoveWordsByLength() {
        Collection<String> collection = new ArrayList<>(Arrays.asList("Summer", "is", "always", "a", "lot", "of", "fun", "for", "children", "!"));
        Collection<String> expected = Arrays.asList("Summer", "is", "always", "a", "of", "children", "!");

        Collection<String> actual = stringCollectionUtil.removeWordsByLength(collection, 3);

        Assertions.assertEquals(expected, actual);
    }
}
