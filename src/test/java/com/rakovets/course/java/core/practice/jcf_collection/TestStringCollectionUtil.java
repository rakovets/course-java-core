package com.rakovets.course.java.core.practice.jcf_collection;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestStringCollectionUtil {
    static Stream<Arguments> provideArgumentsResetWordsByLength() {
        return Stream.of(
                Arguments.of(new ArrayList<>(List.of("this", "is", "lots", "of", "fun", "for", "every", "Java", "programmer")),
                        new ArrayList<>(List.of("*", "is", "*", "of", "fun", "for", "every", "*", "programmer")))
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsResetWordsByLength")
    public void testResetWordsByLength(List<String> initial, List<String> expected) {
        StringCollectionUtil scu = new StringCollectionUtil();
        List<String> actual = scu.resetWordsByLength(initial, 4);

        assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsRemoveWordsByLength() {
        return Stream.of(
                Arguments.of(new ArrayList<>(List.of("this", "is", "lots", "of", "fun", "for", "every", "Java", "programmer")),
                        new ArrayList<>(List.of("is", "of", "fun", "for", "every", "programmer")))
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsRemoveWordsByLength")
    public void testRemoveWordsByLength(Collection<String> initial, Collection<String> expected) {
        StringCollectionUtil scu = new StringCollectionUtil();
        Collection<String> actual = scu.removeWordsByLength(initial, 4);

        assertEquals(expected, actual);
    }
}
