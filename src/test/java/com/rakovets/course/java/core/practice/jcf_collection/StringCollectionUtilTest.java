package com.rakovets.course.java.core.practice.jcf_collection;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

@DisplayName("String collection util test.")
class StringCollectionUtilTest {
    Collection<String> stringCollection;
    StringCollectionUtil stringCollectionUtil;

    @BeforeEach
    void init() {
        stringCollectionUtil = new StringCollectionUtil();

        stringCollection = new ArrayList<>(
                Arrays.asList("this", "is", "lots", "of", "fun", "for", "every", "Java", "programmer"));
    }

    @Test
    @DisplayName("Reset words by length.")
    void resetWordsByLength() {
        ArrayList<String> expected = new ArrayList<>(List.of("*", "is", "*", "of", "fun", "for", "every", "*", "programmer"));

        Collection<String> actual = stringCollectionUtil.resetWordsByLength(stringCollection, 4);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Remove words by length.")
    void removeWordsByLength() {
        ArrayList<String> expected = new ArrayList<>(List.of("this", "lots", "fun", "for", "every", "Java", "programmer"));

        Collection<String> actual = stringCollectionUtil.removeWordsByLength(stringCollection, 2);

        Assertions.assertEquals(expected, actual);
    }
}
