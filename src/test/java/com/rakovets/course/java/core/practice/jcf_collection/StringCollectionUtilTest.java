package com.rakovets.course.java.core.practice.jcf_collection;

import com.rakovets.course.java.core.practice.jcf_collection.string_collection_util.StringCollectionUtil;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StringCollectionUtilTest {
    StringCollectionUtil stringCollectionUtil = new StringCollectionUtil();

    static Stream<Arguments> provideArgumentsForResetWordsByLengthMethod() {
        return Stream.of(
                Arguments.of(new ArrayList(Arrays.asList("this", "is", "lots",
                                "of", "fun", "for", "every", "Java", "programmer")),
                                4, Arrays.asList("*", "is", "*", "of", "fun", "for",
                                "every", "*", "programmer")),
                Arguments.of(new ArrayList(Arrays.asList("this", "is", "lots",
                                "of", "fun", "for", "every", "Java", "programmer")),
                                2, Arrays.asList("this", "*", "lots", "*", "fun", "for",
                                "every", "Java", "programmer")),
                Arguments.of(new ArrayList(Arrays.asList("this", "is", "lots",
                                "of", "fun", "for", "every", "Java", "programmer")),
                                3, Arrays.asList("this", "is", "lots", "of", "*", "*",
                                "every", "Java", "programmer"))
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForResetWordsByLengthMethod")
    void testResetWordsByLengthMethod(List<String> stringList, int wordSize, List<String> expected) {
        stringCollectionUtil.resetWordsByLength(stringList, wordSize);
        List<String> actual = stringList;

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForRemoveWordsByLengthMethod() {
        return Stream.of(
                Arguments.of(new ArrayList(Arrays.asList("this", "is", "lots",
                                "of", "fun", "for", "every", "Java", "programmer")),
                        4, Arrays.asList("is", "of", "fun", "for", "every", "programmer")),
                Arguments.of(new ArrayList(Arrays.asList("this", "is", "lots",
                                "of", "fun", "for", "every", "Java", "programmer")),
                        2, Arrays.asList("this", "lots", "fun", "for", "every", "Java", "programmer")),
                Arguments.of(new ArrayList(Arrays.asList("this", "is", "lots",
                                "of", "fun", "for", "every", "Java", "programmer")),
                        3, Arrays.asList("this", "is", "lots", "of", "every", "Java", "programmer"))
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForRemoveWordsByLengthMethod")
    void testRemoveWordsByLengthMethod(List<String> stringList, int wordSize, List<String> expected) {
        stringCollectionUtil.removeWordsByLength(stringList, wordSize);
        List<String> actual = stringList;

        Assertions.assertEquals(expected, actual);
    }
}
