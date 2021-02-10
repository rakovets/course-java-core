package com.rakovets.course.java.core.practice.jcf.collection;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StringCollectionUtilTest {

    @Test
    void resetWordsByLength() {
        List<String> list = new ArrayList<>();
        list.add("Good");
        list.add("evening");
        List<String> excepted = new ArrayList<>(list);
        excepted.set(1, "*");

        List<String> actual = StringCollectionUtil.resetWordsByLength(list, 7);

        Assertions.assertEquals(excepted, actual);
    }

    @Test
    void removeWordsByLength() {
        List<String> list = new ArrayList<>();
        list.add("Good");
        list.add("evening");
        List<String> excepted = new ArrayList<>(list);
        excepted.remove(1);

        List<String> actual = StringCollectionUtil.removeWordsByLength(list, 7);

        Assertions.assertEquals(excepted, actual);
    }
}
