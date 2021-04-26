package com.rakovets.course.java.core.practice.jcf_collection;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

class StringCollectionUtilTest {

    @Test
    void resetWordsByLength() {
        List<String> name = new ArrayList<>();
        name.add("Igor");
        name.add("Lilia");
        List<String> excepted = new ArrayList<>(name);
        excepted.set(1, "*");

        List<String> actual = StringCollectionUtil.resetWordsByLength(name, 5);

        Assertions.assertEquals(excepted, actual);
    }

    @Test
    void removeWordsByLength() {
        List<String> name = new ArrayList<>();
        name.add("Igor");
        name.add("Lilia");
        List<String> excepted = new ArrayList<>(name);
        excepted.remove(1);

        Collection<String> actual = StringCollectionUtil.removeWordsByLength(name, 5);

        Assertions.assertEquals(excepted, actual);
    }
}
