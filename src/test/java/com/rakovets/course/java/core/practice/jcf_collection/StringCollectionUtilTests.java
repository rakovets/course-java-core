package com.rakovets.course.java.core.practice.jcf_collection;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringCollectionUtilTests {
    static Stream<Arguments> provideArgumentsResetWordsByLength() {
        return Stream.of(
                Arguments.of(new ArrayList<>(Arrays.asList("this", "is", "lots")), 4,
                        new ArrayList<>(Arrays.asList("*", "is", "*"))),
                Arguments.of(new ArrayList<>(Arrays.asList("this", "is", "lots")), 2,
                        new ArrayList<>(Arrays.asList("this", "*", "lots"))),
                Arguments.of(new ArrayList<>(Arrays.asList("this", "is", "lots")), 3,
                        new ArrayList<>(Arrays.asList("this", "is", "lots")))
        );
    }

    @ParameterizedTest()
    @MethodSource("provideArgumentsResetWordsByLength")
    void testResetWordsByLength(List<String> collection, int wordSize, Collection<String> expected) {
        StringCollectionUtil collectionUtil = new StringCollectionUtil();

        Collection<String> actual = collectionUtil.resetWordsByLength(collection, wordSize);

        assertEquals(expected, actual);
    }
    static Stream<Arguments> provideArgumentsRemoveWordsByLength() {
        return Stream.of(
                Arguments.of(new ArrayList<>(Arrays.asList("this", "is", "lots")), 4,
                        new ArrayList<>(Arrays.asList("is"))),
                Arguments.of(new ArrayList<>(Arrays.asList("this", "is", "lots")), 2,
                        new ArrayList<>(Arrays.asList("this", "lots"))),
                Arguments.of(new ArrayList<>(Arrays.asList("this", "is", "lots")), 3,
                        new ArrayList<>(Arrays.asList("this", "is", "lots")))
        );
    }

    @ParameterizedTest()
    @MethodSource("provideArgumentsRemoveWordsByLength")
    void testRemoveWordsByLength(List<String> collection, int wordSize, Collection<String> expected) {
        StringCollectionUtil collectionUtil = new StringCollectionUtil();

        Collection<String> actual = collectionUtil.removeWordsByLength(collection, wordSize);

        assertEquals(expected, actual);
    }
}
