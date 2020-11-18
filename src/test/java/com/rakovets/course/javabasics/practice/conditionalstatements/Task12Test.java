package com.rakovets.course.javabasics.practice.conditionalstatements;

import com.rakovets.course.javabasics.util.StandardOutputTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Task12Test extends StandardOutputTest {
    static Stream<Arguments> zodiacsProvider() {
        return Stream.of(
                Arguments.of(new String[]{"20", "1", "2001"}, "Zodiac Sign: Goat. Chinese Zodiac: Snake"),
                Arguments.of(new String[]{"19", "2", "2002"}, "Zodiac Sign: Water-bearer. Chinese Zodiac: Horse"),
                Arguments.of(new String[]{"20", "3", "2003"}, "Zodiac Sign: Fish. Chinese Zodiac: Ram"),
                Arguments.of(new String[]{"20", "4", "2004"}, "Zodiac Sign: Ram. Chinese Zodiac: Monkey"),
                Arguments.of(new String[]{"20", "5", "2005"}, "Zodiac Sign: Bull. Chinese Zodiac: Rooster"),
                Arguments.of(new String[]{"21", "6", "2006"}, "Zodiac Sign: Twins. Chinese Zodiac: Dog"),
                Arguments.of(new String[]{"22", "7", "2007"}, "Zodiac Sign: Crab. Chinese Zodiac: Pig"),
                Arguments.of(new String[]{"22", "8", "2008"}, "Zodiac Sign: Lion. Chinese Zodiac: Rat"),
                Arguments.of(new String[]{"21", "9", "2009"}, "Zodiac Sign: Maiden. Chinese Zodiac: Ox"),
                Arguments.of(new String[]{"22", "10", "2010"}, "Zodiac Sign: Scales. Chinese Zodiac: Tiger"),
                Arguments.of(new String[]{"22", "11", "2011"}, "Zodiac Sign: Scorpion. Chinese Zodiac: Rabbit"),
                Arguments.of(new String[]{"21", "12", "2012"}, "Zodiac Sign: Archer. Chinese Zodiac: Dragon"),
                Arguments.of(new String[]{"21", "1", "2013"}, "Zodiac Sign:  Water-bearer. Chinese Zodiac: Snake"),
                Arguments.of(new String[]{"20", "2", "2014"}, "Zodiac Sign: Fish. Chinese Zodiac: Horse"),
                Arguments.of(new String[]{"21", "3", "2015"}, "Zodiac Sign: Ram. Chinese Zodiac: Ram"),
                Arguments.of(new String[]{"21", "4", "2016"}, "Zodiac Sign: Bull. Chinese Zodiac: Monkey"),
                Arguments.of(new String[]{"21", "5", "2017"}, "Zodiac Sign: Twins. Chinese Zodiac: Rooster"),
                Arguments.of(new String[]{"22", "6", "2018"}, "Zodiac Sign: Crab. Chinese Zodiac: Dog"),
                Arguments.of(new String[]{"23", "7", "2019"}, "Zodiac Sign: Lion. Chinese Zodiac: Pig"),
                Arguments.of(new String[]{"23", "8", "2020"}, "Zodiac Sign: Maiden. Chinese Zodiac: Rat"),
                Arguments.of(new String[]{"22", "9", "2021"}, "Zodiac Sign: Scales. Chinese Zodiac: Ox"),
                Arguments.of(new String[]{"23", "10", "2022"}, "Zodiac Sign: Scorpion. Chinese Zodiac: Tiger"),
                Arguments.of(new String[]{"23", "11", "2023"}, "Zodiac Sign: Archer. Chinese Zodiac: Rabbit"),
                Arguments.of(new String[]{"22", "12", "2024"}, "Zodiac Sign: Goat. Chinese Zodiac: Dragon")
        );
    }

    @ParameterizedTest(name = "Birthday: {0}")
    @MethodSource("zodiacsProvider")
    @DisplayName("Zodiac")
    void test(String[] fuelReserves, String expected) {
        Task12.main(fuelReserves);
        assertEquals(expected, getStandardOutputContent());
    }
}
