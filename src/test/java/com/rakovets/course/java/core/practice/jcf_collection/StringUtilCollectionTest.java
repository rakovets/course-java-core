package com.rakovets.course.java.core.practice.jcf_collection;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.*;
import java.util.stream.Stream;

public class StringUtilCollectionTest {
    private StringCollectionUtil stringCollectionUtil;
    private Collection<String> collection;

    @BeforeEach
    void initTestData() {
        stringCollectionUtil = new StringCollectionUtil();
        collection = Arrays.asList(
                "Java", "is", "a", "high-level", "class-based", "object-oriented", "programming", "language");
    }

    @ParameterizedTest()
    @MethodSource("resetWordsByLengthTestArguments")
    void resetWordsByLengthTest(Collection<String> expectedCollection, int wordLength) {
        Collection<String> actualCollection = stringCollectionUtil.resetWordsByLength(collection, wordLength);

        Assertions.assertEquals(expectedCollection, actualCollection);
    }

    @ParameterizedTest()
    @MethodSource("removeWordsByLengthTestArguments")
    void removeWordsByLengthTest(Collection<String> expectedCollection, int wordLength) {
        Collection<String> actualCollection = stringCollectionUtil.removeWordsByLength(collection, wordLength);

        Assertions.assertEquals(expectedCollection, actualCollection);
    }

    private static Stream<Arguments> resetWordsByLengthTestArguments() {
        return Stream.of(
                Arguments.of(Arrays.asList(
                        "Java", "is", "*", "high-level", "class-based", "object-oriented", "programming", "language"), 1),
                Arguments.of(Arrays.asList(
                        "Java", "*", "a", "high-level", "class-based", "object-oriented", "programming", "language"), 2),
                Arguments.of(Arrays.asList(
                        "*", "is", "a", "high-level", "class-based", "object-oriented", "programming", "language"), 4),
                Arguments.of(Arrays.asList(
                        "Java", "is", "a", "high-level", "class-based", "object-oriented", "programming", "*"), 8),
                Arguments.of(List.of(""), -1)
        );
    }

    private static Stream<Arguments> removeWordsByLengthTestArguments() {
        return Stream.of(
                Arguments.of(Arrays.asList(
                        "Java", "is", "high-level", "class-based", "object-oriented", "programming", "language"), 1),
                Arguments.of(Arrays.asList(
                        "Java", "a", "high-level", "class-based", "object-oriented", "programming", "language"), 2),
                Arguments.of(Arrays.asList(
                        "is", "a", "high-level", "class-based", "object-oriented", "programming", "language"), 4),
                Arguments.of(Arrays.asList(
                        "Java", "is", "a", "high-level", "class-based", "object-oriented", "programming"), 8),
                Arguments.of(List.of(""), -1)
        );
    }
}
