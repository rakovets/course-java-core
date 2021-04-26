package com.rakovets.course.java.core.practice.jcf_collection;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.stream.Stream;

public class StringCollectionUtilTest {
    LinkedList<String> testCollection = new LinkedList<String>();

    @BeforeEach
    public void init() {
        testCollection.add("this");
        testCollection.add("is");
        testCollection.add("lots");
        testCollection.add("of");
        testCollection.add("fun");
        testCollection.add("for");
        testCollection.add("Java");
        testCollection.add("programmer");
    }

    @Test
    static Stream<Arguments> resetWordsByLengthTestProviderArguments() {
        return Stream.of(
                Arguments.of("[*, is, *, of, fun, for, *, programmer]", 4),
                Arguments.of("[this, *, lots, *, fun, for, Java, programmer]", 2),
                Arguments.of("[this, is, lots, of, *, *, Java, programmer]", 3)
        );
    }

    @ParameterizedTest
    @MethodSource("resetWordsByLengthTestProviderArguments")
    public void resetWordsByLengthTest(String expectedValue, int lenght) {
        StringCollectionUtil stringCollectionUtil = new StringCollectionUtil();
        testCollection = (LinkedList<String>) stringCollectionUtil.resetWordsByLength(testCollection, lenght);
        Assertions.assertEquals(expectedValue, testCollection.toString());
    }

    @Test
    static Stream<Arguments> removeWordsByLengthTestProviderArguments() {
        return Stream.of(
                Arguments.of("[is, of, fun, for, programmer]", 4),
                Arguments.of("[this, lots, fun, for, Java, programmer]", 2),
                Arguments.of("[this, is, lots, of, Java, programmer]", 3),
                Arguments.of("[this, is, lots, of, fun, for, Java]", 10)
        );
    }

    @ParameterizedTest
    @MethodSource("removeWordsByLengthTestProviderArguments")
    public void removeWordsByLengthTest(String expectedValue, int length) {
        StringCollectionUtil stringCollectionUtil = new StringCollectionUtil();
        testCollection = (LinkedList<String>) stringCollectionUtil.removeWordsByLength(testCollection, length);
        Assertions.assertEquals(expectedValue, testCollection.toString());
    }
}
