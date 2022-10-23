package com.rakovets.course.java.core.practice.jcf_collection;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringCollectionUtilTest {
    static Stream<Arguments> provideArgumentsForResetWordsByLength() {
        return Stream.of(
                Arguments.of(new ArrayList<>(List.of("regex", "program", "hell", "abrakadabra", "hola", "this")), 5,
                        new ArrayList<>(List.of("*", "program", "hell", "abrakadabra", "hola", "this"))),
                Arguments.of(new ArrayList<>(List.of("regex", "program", "hell", "abrakadabra", "hola", "this")), 4,
                        new ArrayList<>(List.of("regex", "program", "*", "abrakadabra", "*", "*"))),
                Arguments.of(new ArrayList<>(List.of("regex", "program", "hell", "abrakadabra", "hola", "this")), 9,
                        new ArrayList<>(List.of("regex", "program", "hell", "abrakadabra", "hola", "this")))
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForResetWordsByLength")
    void getResetWordsByLength(ArrayList<String> list, int length, Collection<String> expected) {
        StringCollectionUtil coll = new StringCollectionUtil();

        Collection<String> actual = coll.resetWordsByLength(list, length);

        assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForRemoveWordsByLength() {
        return Stream.of(
                Arguments.of(new ArrayList<>(List.of("regex", "program", "hell", "abrakadabra", "hola", "this")), 5,
                        new ArrayList<>(List.of("program", "hell", "abrakadabra", "hola", "this"))),
                Arguments.of(new ArrayList<>(List.of("regex", "program", "hell", "abrakadabra", "hola", "this")), 4,
                        new ArrayList<>(List.of("regex", "program", "abrakadabra"))),
                Arguments.of(new ArrayList<>(List.of("regex", "program", "hell", "abrakadabra", "hola", "this")), 9,
                        new ArrayList<>(List.of("regex", "program", "hell", "abrakadabra", "hola", "this")))
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForRemoveWordsByLength")
    void getRemoveWordsByLength(ArrayList<String> list, int length, Collection<String> expected) {
        StringCollectionUtil coll = new StringCollectionUtil();

        Collection<String> actual = coll.removeWordsByLength(list, length);

        assertEquals(expected, actual);
    }
}
