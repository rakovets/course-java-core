package com.rakovets.course.java.core.practice.jcf.collection;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class StringCollectionUtilTest {
    @Test
    void resetWordsByLength() {
        // GIVEN
        List<String> names = new ArrayList<>();
        names.add("Alex");
        names.add("Arthur");

        // WHEN
        StringCollectionUtil.resetWordsByLength(names, 4);

        // THEN
        Assertions.assertEquals("*", names.get(0));
        Assertions.assertEquals("Arthur", names.get(1));
    }

    @Test
    void removeWordsByLength() {
        // GIVEN
        List<String> names = new ArrayList<>();
        names.add("Alex");
        names.add("Arthur");
        names.add("Alex");
        names.add("Alex");

        // WHEN
        StringCollectionUtil.removeWordsByLength(names, 4);

        // THEN
        Assertions.assertEquals(1, names.size());
    }
}
