package com.rakovets.course.java.core.practice.lambda_expressions;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.Map;
import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task01Tests {

    static Stream<Arguments> provideArgumentsGetMapFromArray() {
        return Stream.of(
                Arguments.of(new String[]{"-i", "in.txt", "--limit", "40", "-d", "1", "-o", "out.txt"},
                        Map.of("-i", "in.txt", "--limit", "40", "-d", "1", "-o", "out.txt")),
                Arguments.of(new String[]{"one", "two", "three", "four", "five", "six", "seven", "eight"},
                        Map.of("one", "two", "three", "four", "five", "six", "seven", "eight"))
        );
    }

    @MethodSource("provideArgumentsGetMapFromArray")
    @ParameterizedTest()
    void testGetMapFromArray(String[] array, Map<String, String> expected) {
        Task01 task01 = new Task01(array);

        Map<String, String> actual = task01.getMapFromArray(array);

        assertEquals(expected, actual);
    }
}
