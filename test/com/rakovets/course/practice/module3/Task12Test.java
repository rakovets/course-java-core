package com.rakovets.course.practice.module3;

import com.rakovets.course.util.ConsoleTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Task12Test extends ConsoleTest {
    static Stream<Arguments> zodiacsProvider() {
        return Stream.of(
                Arguments.of(new String[]{"5", "1", "2001"}, "Zodiac Sign: Sea-Goat. Chinese Zodiac: Snake"),
                Arguments.of(new String[]{"5", "2", "2002"}, "Zodiac Sign: Water-Bearer. Chinese Zodiac: Horse"),
                Arguments.of(new String[]{"5", "3", "2003"}, "Zodiac Sign: Fishes. Chinese Zodiac: Ram"),
                Arguments.of(new String[]{"5", "4", "2004"}, "Zodiac Sign: Ram. Chinese Zodiac: Monkey"),
                Arguments.of(new String[]{"5", "5", "2005"}, "Zodiac Sign: Bull. Chinese Zodiac: Rooster"),
                Arguments.of(new String[]{"5", "6", "2006"}, "Zodiac Sign: Twins. Chinese Zodiac: Dog"),
                Arguments.of(new String[]{"5", "7", "2007"}, "Zodiac Sign: Crab. Chinese Zodiac: Pig"),
                Arguments.of(new String[]{"5", "8", "2008"}, "Zodiac Sign: Lion. Chinese Zodiac: Rat"),
                Arguments.of(new String[]{"5", "9", "2009"}, "Zodiac Sign: Maiden. Chinese Zodiac: Ox"),
                Arguments.of(new String[]{"5", "10", "2010"}, "Zodiac Sign: Scales. Chinese Zodiac: Tiger"),
                Arguments.of(new String[]{"5", "11", "2011"}, "Zodiac Sign: Scorpion. Chinese Zodiac: Rabbit"),
                Arguments.of(new String[]{"5", "12", "2012"}, "Zodiac Sign: Archer. Chinese Zodiac: Dragon")
        );
    }

    @ParameterizedTest(name = "Birthday: {0}")
    @MethodSource("zodiacsProvider")
    @DisplayName("Zodiac")
    void test(String[] fuelReserves, String expected) {
        Task12.main(fuelReserves);
        assertEquals(getConsoleContent(), expected);
    }
}