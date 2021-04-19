package com.rakovets.course.java.core.practice.decision_making_statements;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Dmitry Rakovets
 */
@DisplayName("Zodiac: year name")
class Task14Test {
    static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of(2001, "Snake"),
                Arguments.of(2002, "Horse"),
                Arguments.of(2003, "Ram"),
                Arguments.of(2004, "Monkey"),
                Arguments.of(2005, "Rooster"),
                Arguments.of(2006, "Dog"),
                Arguments.of(2007, "Pig"),
                Arguments.of(2008, "Rat"),
                Arguments.of(2009, "Ox"),
                Arguments.of(2010, "Tiger"),
                Arguments.of(2011, "Rabbit"),
                Arguments.of(2012, "Dragon"),
                Arguments.of(2013, "Snake"),
                Arguments.of(2014, "Horse"),
                Arguments.of(2015, "Ram"),
                Arguments.of(2016, "Monkey"),
                Arguments.of(2017, "Rooster"),
                Arguments.of(2018, "Dog"),
                Arguments.of(2019, "Pig"),
                Arguments.of(2020, "Rat"),
                Arguments.of(2021, "Ox"),
                Arguments.of(2022, "Tiger"),
                Arguments.of(2023, "Rabbit"),
                Arguments.of(2024, "Dragon"));
    }

    @ParameterizedTest(name = "Birthday: {0}")
    @MethodSource("provideArguments")
    void test(int year, String expected) {
        String actual = Task14.getZodiacYearName(year);

        assertEquals(expected, actual);
    }
}
