package com.rakovets.course.java.core.practice.lambda_expressions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Map;
import java.util.stream.Stream;

public class Task01Test {
    Task01 task = new Task01();
    static Stream<Arguments> ProvideArgumentsForConvertArrayInMap() {
        return Stream.of(
                Arguments.of(new String[] {"Sun", "Sunday", "Mon", "Monday", "Tue", "Tuesday", "Wed", "Wednesday"},
                        Map.of("Sun", "Sunday", "Mon", "Monday", "Tue", "Tuesday", "Wed", "Wednesday")),
                Arguments.of(new String[] {"-i", "in.txt", "--limit", "40", "-d", "1", "-o", "out.txt"},
                        Map.of("-o", "out.txt", "-d", "1", "-i", "in.txt", "--limit", "40")),
                Arguments.of(new String[] {"He", "Helium", "Na", "Natrium", "Ca", "Calcium", "Mn", "Manganum"},
                        Map.of("He", "Helium", "Na", "Natrium", "Ca", "Calcium", "Mn", "Manganum"))
        );
    }

    @ParameterizedTest
    @MethodSource("ProvideArgumentsForConvertArrayInMap")
    void testConvertArrayInMap(String[] array, Map<String, String> expected) {
        Map<String, String> actual = task.convertArrayInMap(array);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> ProvideArgumentsForConvertMapInArray() {
        return Stream.of(
                Arguments.of(Map.of("Sun", "Sunday", "Mon", "Monday", "Tue", "Tuesday", "Wed", "Wednesday"),
                        new String[] {"Mon", "Monday", "Sun", "Sunday", "Tue", "Tuesday", "Wed", "Wednesday"}),
                Arguments.of(Map.of("-o", "out.txt", "-d", "1", "-i", "in.txt", "--limit", "40"),
                        new String[] {"--limit", "40", "-d", "1", "-i", "in.txt", "-o", "out.txt"}),
                Arguments.of(Map.of("He", "Helium", "Na", "Natrium", "Ca", "Calcium", "Mn", "Manganum"),
                        new String[] {"Ca", "Calcium", "He", "Helium", "Mn", "Manganum", "Na", "Natrium"})
        );
    }

    @ParameterizedTest
    @MethodSource("ProvideArgumentsForConvertMapInArray")
    void testConvertMapInArray(Map<String, String> map, String[] expected) {
        String[] actual = task.convertMapInArray(map);

        Assertions.assertArrayEquals(expected, actual);
    }
}
