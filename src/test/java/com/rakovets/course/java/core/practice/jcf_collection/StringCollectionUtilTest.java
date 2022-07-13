package com.rakovets.course.java.core.practice.jcf_collection;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class StringCollectionUtilTest {
    StringCollectionUtil stringCollectionUtil = new StringCollectionUtil();

    @Test
    public void testResetWordsByLength() {
        List<String> list = Arrays.asList("this", "is", "lots", "of", "fun", "for", "every", "Java", "programmer");
        List<String> listChanged = Arrays.asList("*", "is", "*", "of", "fun", "for", "every", "*", "programmer");
        Assertions.assertEquals(listChanged, (stringCollectionUtil.resetWordsByLength(list, 4)));
    }

    @Test
    public void testRemoveWordsByLength() {
        Collection<String> collection = new ArrayList<>(Arrays.asList("this", "is", "lots", "of", "fun", "for", "every", "Java", "programmer"));
        Collection<String> collectionChanged = Arrays.asList("is", "of", "fun", "for", "every", "programmer");
        Assertions.assertEquals(collectionChanged, stringCollectionUtil.removeWordsByLength(collection, 4));
    }
}
