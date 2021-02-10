package com.rakovets.course.java.core.practice.jcf.collection.StringCollectionUtil;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class StringCollectionUtilTest {

    Collection<String> collection;

    @BeforeEach
    void init() {
        String[] str = new String[] {"common", "program", "string", "would", "object"};
        collection = new ArrayList<>(Arrays.asList(str));
    }

    @Test
    void resetWordsByLength() {
        String[] str1 = new String[] {"*", "program", "*", "would", "*"};
        Assertions.assertEquals(new ArrayList<>(Arrays.asList(str1)),
                StringCollectionUtil.resetWordsByLength(collection, 6));
    }

    @Test
    void removeWordsByLength() {
        String[] str2 = new String[] {"program", "would"};
        StringCollectionUtil.removeWordsByLength(collection, 6);
        Assertions.assertEquals(new ArrayList<>(Arrays.asList(str2)), collection);
    }
}
