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

    @BeforeEach
    void init() {
        String[] strings = new String[]{"this", "is", "lots", "of", "fun", "for", "every", "Java", "programmer"};
        stringCollection = new ArrayList<>(Arrays.asList(strings));
    }

    @Test
    @DisplayName("Reset words by length.")
    void resetWordsByLength() {
        String[] str1 = new String[]{"*", "is", "*", "of", "fun", "for", "every", "*", "programmer"};

        Assertions.assertEquals(new ArrayList<>(Arrays.asList(str1)),
                StringCollectionUtil.resetWordsByLength(stringCollection, 4));
    }

    @Test
    @DisplayName("Remove words by length.")
    void removeWordsByLength() {
        String[] str2 = new String[]{"this", "lots", "fun", "for", "every", "Java", "programmer"};

        StringCollectionUtil.removeWordsByLength(stringCollection, 2);

        Assertions.assertEquals(new ArrayList<>(Arrays.asList(str2)), stringCollection);
    }
}
