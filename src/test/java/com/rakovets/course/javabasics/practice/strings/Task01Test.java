package com.rakovets.course.javabasics.practice.strings;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Tests for Task01.
 *
 * @author Dmitry Rakovets
 * @version 1.0
 */
class Task01Test {
    @ParameterizedTest(name = "Full name: {0}")
    @CsvFileSource(resources = "/string/task01-tests.csv", numLinesToSkip = 1, delimiter = '|')
    @DisplayName("Get name")
    void getNameTest(String fullName, String name) {
        assertEquals(Task01.getName(fullName), name);
    }

    @ParameterizedTest(name = "Full name: {0}")
    @CsvFileSource(resources = "/string/task01-tests.csv", numLinesToSkip = 1, delimiter = '|')
    @DisplayName("Get surname")
    void getSurnameTest(String fullName, String name, String surname) {
        assertEquals(Task01.getSurname(fullName), surname);
    }

    @ParameterizedTest(name = "Full name: {0}")
    @CsvFileSource(resources = "/string/task01-tests.csv", numLinesToSkip = 1, delimiter = '|')
    @DisplayName("Reverse full name")
    void reverseFullNameTest(String fullName, String name, String surname) {
        assertEquals(Task01.reverseFullName(fullName), surname + " " + name);
    }
}