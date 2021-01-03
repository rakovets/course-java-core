package com.rakovets.course.javabasics.practice.strings;

import com.rakovets.course.javabasics.util.ArrayUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * Tests for Task03.
 *
 * @author Dmitry Rakovets
 */
@DisplayName("Stuff")
@SuppressWarnings("unused")
class Task03Test {
    private static final String CSV_FIELD_SPLITERATOR = " ";

    @ParameterizedTest(name = "Information about stuff: {0}")
    @CsvFileSource(resources = "/practice/string/task03-tests.csv", numLinesToSkip = 1)
    @DisplayName("Stuff: names")
    void parseToArrayNameTest(String information, String names, String surnames, String salaries) {
        String[] expected = names.split(CSV_FIELD_SPLITERATOR);

        String[] actual = Task03.parseToArrayName(information);

        assertArrayEquals(actual, expected);
    }

    @ParameterizedTest(name = "Information about stuff: {0}")
    @CsvFileSource(resources = "/practice/string/task03-tests.csv", numLinesToSkip = 1)
    @DisplayName("Stuff: surnames")
    void parseToArraySurnameTest(String information, String names, String surnames, String salaries) {
        String[] expected = surnames.split(CSV_FIELD_SPLITERATOR);

        String[] actual = Task03.parseToArraySurname(information);

        assertArrayEquals(actual, expected);
    }

    @ParameterizedTest(name = "Information about stuff: {0}")
    @CsvFileSource(resources = "/practice/string/task03-tests.csv", numLinesToSkip = 1)
    @DisplayName("Stuff: salaries")
    void parseToArraySalaryTest(String information, String names, String surnames, String salaries) {
        int[] expected = ArrayUtil.parseToInt(salaries, CSV_FIELD_SPLITERATOR);

        int[] actual = Task03.parseToArraySalary(information);

        assertArrayEquals(actual, expected);
    }
}
