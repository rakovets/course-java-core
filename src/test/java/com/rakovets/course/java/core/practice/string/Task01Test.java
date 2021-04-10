package com.rakovets.course.java.core.practice.string;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Tests for Task01.
 *
 * @author Dmitry Rakovets
 */
@DisplayName("Names")
@SuppressWarnings("unused")
class Task01Test {
    static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of("Nappie Lopez-gomez", "Nappie", "Lopez-gomez"),
                Arguments.of("Crawford Kelsey", "Crawford", "Kelsey"),
                Arguments.of("Shaun-Pen Nadal-ginard", "Shaun-Pen", "Nadal-ginard")
        );
    }

    @ParameterizedTest(name = "Get name for full name: ''{0}'' -> ''{1}''")
    @MethodSource("provideArguments")
    @DisplayName("Get name")
    void getNameTest(String fullName, String name, String surname) {
        String actual = Task01.getName(fullName);

        assertEquals(name, actual);
    }

    @ParameterizedTest(name = "Get surname for full name: ''{0}'' -> ''{2}''")
    @MethodSource("provideArguments")
    void getSurnameTest(String fullName, String name, String surname) {
        String actual = Task01.getSurname(fullName);

        assertEquals(surname, actual);
    }

    @ParameterizedTest(name = "Get reversed full name for full name: ''{0}''")
    @MethodSource("provideArguments")
    void reverseFullNameTest(String fullName, String name, String surname) {
        var expected = surname + " " + name;

        String actual = Task01.reverseFullName(fullName);

        assertEquals(expected, actual);
    }
}
