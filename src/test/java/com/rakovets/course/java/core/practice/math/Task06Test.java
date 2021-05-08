package com.rakovets.course.java.core.practice.math;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Dmitry Rakovets
 */
@DisplayName("Conversion temperatures")
@SuppressWarnings("unused")
class Task06Test {
    static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of(-273.15, "Celsius -273.15° - Kelvin 0.0° - Fahrenheit -459.67°"),
                Arguments.of(-17.78, "Celsius -17.78° - Kelvin 255.37° - Fahrenheit -0.0°"),
                Arguments.of(0, "Celsius 0.0° - Kelvin 273.15° - Fahrenheit 32.0°"),
                Arguments.of(36.8, "Celsius 36.8° - Kelvin 309.95° - Fahrenheit 98.24°"),
                Arguments.of(5526.0, "Celsius 5526.0° - Kelvin 5799.15° - Fahrenheit 9978.8°")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArguments")
    void getMinPenaltyPointsTest(double temperatureInCelsius, String expected) {
        String actual = Task06.conversionTemperature(temperatureInCelsius);

        assertEquals(expected, actual);
    }
}
