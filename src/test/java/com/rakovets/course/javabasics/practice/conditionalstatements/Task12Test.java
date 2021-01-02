package com.rakovets.course.javabasics.practice.conditionalstatements;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Dmitry Rakovets
 */
@DisplayName("Zodiac")
class Task12Test {
    static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of(20, 1, 2001, "Goat"),
                Arguments.of(19, 2, 2002, "Water-bearer"),
                Arguments.of(20, 3, 2003, "Fish"),
                Arguments.of(20, 4, 2004, "Ram"),
                Arguments.of(20, 5, 2005, "Bull"),
                Arguments.of(21, 6, 2006, "Twins"),
                Arguments.of(22, 7, 2007, "Crab"),
                Arguments.of(22, 8, 2008, "Lion"),
                Arguments.of(21, 9, 2009, "Maiden"),
                Arguments.of(22, 10, 2010, "Scales"),
                Arguments.of(22, 11, 2011, "Scorpion"),
                Arguments.of(21, 12, 2012, "Archer"),
                Arguments.of(21, 1, 2013, "Water-bearer"),
                Arguments.of(20, 2, 2014, "Fish"),
                Arguments.of(21, 3, 2015, "Ram"),
                Arguments.of(21, 4, 2016, "Bull"),
                Arguments.of(21, 5, 2017, "Twins"),
                Arguments.of(22, 6, 2018, "Crab"),
                Arguments.of(23, 7, 2019, "Lion"),
                Arguments.of(23, 8, 2020, "Maiden"),
                Arguments.of(22, 9, 2021, "Scales"),
                Arguments.of(23, 10, 2022, "Scorpion"),
                Arguments.of(23, 11, 2023, "Archer"),
                Arguments.of(22, 12, 2024, "Goat")
        );
    }

    @ParameterizedTest(name = "Birthday: {0}")
    @MethodSource("provideArguments")
    void test(int day, int month, int year, String expected) {
        String actual = Task12.getZodiacSign(day, month, year);
        assertEquals(expected, actual);
    }
}
