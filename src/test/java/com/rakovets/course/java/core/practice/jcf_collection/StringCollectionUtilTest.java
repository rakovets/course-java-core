package com.rakovets.course.java.core.practice.jcf_collection;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;

public class StringCollectionUtilTest {
    @Test
    public void testResetWordsByLength() {
       StringCollectionUtil stringCollectionUtil = new StringCollectionUtil(new ArrayList<>(List.of("this", "is", "lots", "of", "fun", "for", "every", "Java", "programmer")));
       StringCollectionUtil stringCollectionUtil1 = new StringCollectionUtil(new ArrayList<>(List.of("Please", "enter", "your", "name")));
       List<String> expected = new ArrayList<>(List.of("*", "is", "*", "of", "fun", "for", "every", "*", "programmer"));
       List<String> expected1 = new ArrayList<>(List.of("Please", "*", "your", "name"));
       Assertions.assertEquals(expected, stringCollectionUtil.resetWordsByLength(stringCollectionUtil.getList(), 4));
       Assertions.assertEquals(expected1, stringCollectionUtil1.resetWordsByLength(stringCollectionUtil1.getList(), 5));
    }

    @Test
    public void testRemoveWordsByLength() {
        StringCollectionUtil stringCollectionUtil = new StringCollectionUtil(new ArrayList<>(List.of("this", "is", "lots", "of", "fun", "for", "every", "Java", "programmer")));
        List<String> expected = new ArrayList<>(List.of("is", "of", "fun", "for", "every", "programmer"));
        Assertions.assertEquals(expected, stringCollectionUtil.removeWordsByLength(stringCollectionUtil.getList(),4));
    }
}
