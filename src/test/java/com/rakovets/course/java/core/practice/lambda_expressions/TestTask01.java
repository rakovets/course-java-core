package com.rakovets.course.java.core.practice.lambda_expressions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Stream;

public class TestTask01 {
    Task01 task01 = new Task01();

    @Test
    public void testConvertArrayToMap() {
        String expected = "{-o=out.txt, -d=1, -i=in.txt, --limit=40}";
        String actual = task01.convertArrayToMap(
                new String[]{"-i", "in.txt", "--limit", "40", "-d", "1", "-o", "out.txt"}).toString();
        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsConvertMapToArrayArguments() {
        return Stream.of(
                Arguments.of((Map.of("-i", "in.txt", "--limit", "40", "-d", "1", "-o", "out.txt")),
                        new String[]{"-i", "in.txt", "--limit", "40", "-d", "1", "-o", "out.txt"})
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsConvertMapToArrayArguments")
    public void testConvertMapToArray(Map<String, String> map, String[] expected) {
        String[] actual = task01.convertMapToArray(map);
        Arrays.sort(expected);
        Arrays.sort(actual);

        Assertions.assertArrayEquals(expected, actual);
    }
}
