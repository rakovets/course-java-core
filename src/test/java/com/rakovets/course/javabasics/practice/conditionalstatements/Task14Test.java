package com.rakovets.course.javabasics.practice.conditionalstatements;

import com.rakovets.course.javabasics.util.StandardOutputTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Dmitry Rakovets
 */
class Task14Test extends StandardOutputTest {
    static Stream<Arguments> zodiacsProvider() {
        return Stream.of(
                Arguments.of(20, 1, 2001, "Snake"),
                Arguments.of(19, 2, 2002, "Horse"),
                Arguments.of(20, 3, 2003, "Ram"),
                Arguments.of(20, 4, 2004, "Monkey"),
                Arguments.of(20, 5, 2005, "Rooster"),
                Arguments.of(21, 6, 2006, "Dog"),
                Arguments.of(22, 7, 2007, "Pig"),
                Arguments.of(22, 8, 2008, "Rat"),
                Arguments.of(21, 9, 2009, "Ox"),
                Arguments.of(22, 10, 2010, "Tiger"),
                Arguments.of(22, 11, 2011, "Rabbit"),
                Arguments.of(21, 12, 2012, "Dragon"),
                Arguments.of(21, 1, 2013, "Snake"),
                Arguments.of(20, 2, 2014, "Horse"),
                Arguments.of(21, 3, 2015, "Ram"),
                Arguments.of(21, 4, 2016, "Monkey"),
                Arguments.of(21, 5, 2017, "Rooster"),
                Arguments.of(22, 6, 2018, "Dog"),
                Arguments.of(23, 7, 2019, "Pig"),
                Arguments.of(23, 8, 2020, "Rat"),
                Arguments.of(22, 9, 2021, "Ox"),
                Arguments.of(23, 10, 2022, "Tiger"),
                Arguments.of(23, 11, 2023, "Rabbit"),
                Arguments.of(22, 12, 2024, "Dragon"));
    }

    @ParameterizedTest(name = "Birthday: {0}")
    @MethodSource("zodiacsProvider")
    @DisplayName("Zodiac")
    void test(int day, int month, int year, String expected) {
        String actual = Task14.getZodiacYearName(day, month, year);

        assertEquals(expected, actual);
    }
}
