package com.rakovets.course.java.core.practice.generics;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PairTests {
    static Stream<Arguments> provideArgumentsGetSwapped() {
        return Stream.of(
                Arguments.of("One", "Two", "Two", "One"),
                Arguments.of("Marry", "Jack", "Jack", "Marry")
        );
    }
    @ParameterizedTest
    @MethodSource("provideArgumentsGetSwapped")
    void getGetSwapped(String first, String second, String expectedFirst, String expectedSecond) {
        Pair <String, String> pair = new Pair<>(first, second);

        Pair swapped = pair.getSwapped();
        String actualFirst = (String) swapped.getFirstObject();
        String actualSecond = (String) swapped.getSecondObject();

        assertEquals(expectedFirst, actualFirst);
        assertEquals(expectedSecond, actualSecond);
    }
}
