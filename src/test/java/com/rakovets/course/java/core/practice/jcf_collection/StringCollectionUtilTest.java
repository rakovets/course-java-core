package com.rakovets.course.java.core.practice.jcf_collection;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

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
        String[] expected = new String[]{"*", "is", "*", "of", "fun", "for", "every", "*", "programmer"};

        Collection<String> actual = stringCollectionUtil.resetWordsByLength(stringCollection, 4);

        Assertions.assertEquals(new ArrayList<>(Arrays.asList(expected)), actual);
    }

    @Test
    @DisplayName("Remove words by length.")
    void removeWordsByLength() {
        String[] str2 = new String[]{"this", "lots", "fun", "for", "every", "Java", "programmer"};

        Collection<String> actual = stringCollectionUtil.removeWordsByLength(stringCollection, 2);

        Assertions.assertEquals(new ArrayList<>(Arrays.asList(str2)), actual);
    }
}
