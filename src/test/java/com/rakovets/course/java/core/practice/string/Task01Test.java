package com.rakovets.course.java.core.practice.string;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Tests for Task01.
 *
 * @author Dmitry Rakovets
 */
@DisplayName("Names")
@SuppressWarnings("unused")
class Task01Test {
    @ParameterizedTest(name = "Full name: {0}")
    @CsvFileSource(resources = "/practice/string/task01-tests.csv", numLinesToSkip = 1, delimiter = ',')
    @DisplayName("Get name")
    void getNameTest(String fullName, String name, String surname) {
        String actual = Task01.getName(fullName);

        assertEquals(name, actual);
    }

    @ParameterizedTest(name = "Full name: {0}")
    @CsvFileSource(resources = "/practice/string/task01-tests.csv", numLinesToSkip = 1, delimiter = ',')
    @DisplayName("Get surname")
    void getSurnameTest(String fullName, String name, String surname) {
        String actual = Task01.getSurname(fullName);

        assertEquals(surname, actual);
    }

    @ParameterizedTest(name = "Full name: {0}")
    @CsvFileSource(resources = "/practice/string/task01-tests.csv", numLinesToSkip = 1, delimiter = ',')
    @DisplayName("Reverse full name")
    void reverseFullNameTest(String fullName, String name, String surname) {
        var expected = surname + " " + name;

        String actual = Task01.reverseFullName(fullName);

        assertEquals(expected, actual);
    }
}
