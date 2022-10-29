package com.rakovets.course.java.core.practice.lambda_expressions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

public class CityHelperTest {
    static Stream<Arguments> UniqueCities() {
        return Stream.of(
                Arguments.of(List.of("Minsk", "New-York", "Antalya", "Oslo", "Batumi", "Vilnius", "Dublin", "Oslo", "Minsk"),
                        List.of("Minsk", "New-York", "Antalya", "Oslo", "Batumi", "Vilnius", "Dublin")),
                Arguments.of(List.of("Brest", "Mogilev", "Gomel", "Brest", "Moscow", "Moscow", "Minsk", "Brest", "Minsk"),
                        List.of("Brest", "Mogilev", "Gomel", "Moscow", "Minsk")
                ));
    }

    @ParameterizedTest
    @MethodSource("UniqueCities")
    public void getUniqueCities(List<String> cities, List<String> expected) {
        CityHelper city = new CityHelper(cities);

        List<String> actual = city.getUniqueCities();

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> NameCityLength() {
        return Stream.of(
                Arguments.of(List.of("Minsk", "New-York", "Antalya", "Oslo", "Batumi", "Vilnius", "Dublin", "Oslo", "Minsk"),
                        List.of("New-York", "Antalya", "Vilnius")),
                Arguments.of(List.of("Brest", "Mogilev", "Gomel", "Brest", "Moscow", "Moscow", "Minsk", "Brest", "Minsk"),
                        List.of("Mogilev")
                ));
    }

    @ParameterizedTest
    @MethodSource("NameCityLength")
    public void getNameCityLength(List<String> cities, List<String> expected) {
        CityHelper city = new CityHelper(cities);

        List<String> actual = city.getNameCityLength();

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> NameFirstLetter() {
        return Stream.of(
                Arguments.of(List.of("Minsk", "New-York", "Antalya", "Oslo", "Batumi", "Vilnius", "Dublin", "Oslo", "Minsk"),
                        List.of("Minsk", "Minsk")),
                Arguments.of(List.of("Brest", "Mogilev", "Gomel", "Brest", "Moscow", "Moscow", "Minsk", "Brest", "Minsk"),
                        List.of("Mogilev", "Moscow", "Moscow", "Minsk", "Minsk")
                ));
    }

    @ParameterizedTest
    @MethodSource("NameFirstLetter")
    public void getNameFirstLetter(List<String> cities, List<String> expected) {
        CityHelper city = new CityHelper(cities);

        List<String> actual = city.getNameFirstLetter('M');

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> CountNameCity() {
        return Stream.of(
                Arguments.of(List.of("Minsk", "New-York", "Antalya", "Oslo", "Batumi", "Vilnius", "Dublin", "Oslo", "Minsk"), 2),
                Arguments.of(List.of("Brest", "Mogilev", "Gomel", "Brest", "Moscow", "Moscow", "Minsk", "Brest", "Minsk"), 2)
        );
    }

    @ParameterizedTest
    @MethodSource("CountNameCity")
    public void getCountNameCity(List<String> cities, long expected) {
        CityHelper city = new CityHelper(cities);

        long actual = city.getCountNameCity("Minsk");

        Assertions.assertEquals(expected, actual);
    }
}
