package com.rakovets.course.java.core.practice.jcf_collection;

import com.rakovets.course.java.core.practice.jcf_list.school.Person;
import com.rakovets.course.java.core.practice.jcf_list.school.SchoolClass;
import com.rakovets.course.java.core.practice.jcf_list.studio.Actor;
import com.rakovets.course.java.core.practice.jcf_list.studio.Studio;
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
    void getResetWordsByLength(Collection<String> coll, int length, Collection<String> expected) {

        Collection<String> actual = new ArrayList<>(StringCollectionUtil.resetWordsByLength(coll, length));

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
    void getRemoveWordsByLength(Collection<String> coll, int length, Collection<String> expected) {

        Collection<String> actual = new ArrayList<>(StringCollectionUtil.removeWordsByLength(coll, length));

        assertEquals(expected, actual);
    }
}
