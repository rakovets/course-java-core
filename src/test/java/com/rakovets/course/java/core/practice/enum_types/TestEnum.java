package com.rakovets.course.java.core.practice.enum_types;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TestEnum {
    static Stream<Arguments> provideArgumentsTestGetDescriptionAllSeasons() {
        return Stream.of(
                Arguments.of("Warm season", Task01040506Seasons.SUMMER.getDescription()),
                Arguments.of("Cold season", Task01040506Seasons.AUTUMN.getDescription()),
                Arguments.of("Cold season", Task01040506Seasons.SPRING.getDescription()),
                Arguments.of("Cold season", Task01040506Seasons.WINTER.getDescription())
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsTestGetDescriptionAllSeasons")
    public void testGetDescriptionAllSeasons(String expected, String actual) {
        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsTestGetAverageTemperaturePerSeason() {
        return Stream.of(
                Arguments.of(15.0, Task01040506Seasons.SPRING.getAverageTemperaturePerSeason(Task01040506Seasons.SPRING)),
                Arguments.of(10.0, Task01040506Seasons.AUTUMN.getAverageTemperaturePerSeason(Task01040506Seasons.AUTUMN)),
                Arguments.of(20, Task01040506Seasons.SUMMER.getAverageTemperaturePerSeason(Task01040506Seasons.SUMMER)),
                Arguments.of(-25.0, Task01040506Seasons.WINTER.getAverageTemperaturePerSeason(Task01040506Seasons.WINTER))
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsTestGetAverageTemperaturePerSeason")
    public void testGetAverageTemperaturePerSeason(double expected, double actual) {
        Assertions.assertEquals(expected, actual);
    }
}


