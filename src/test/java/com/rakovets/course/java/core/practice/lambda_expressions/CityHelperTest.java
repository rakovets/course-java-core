package com.rakovets.course.java.core.practice.lambda_expressions;

import com.rakovets.course.java.core.practice.lambda_expressions.city_helter.CityHelper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

public class CityHelperTest {
    CityHelper city = new CityHelper();
    static Stream<Arguments> provideArgumentsForGetUniqueCityNames() {

        return Stream.of(
                Arguments.of(List.of("New York", "Los Angeles", "Chicago", "Houston", "New York", "Chicago"),
                        "[New York, Los Angeles, Chicago, Houston]"),
                Arguments.of(List.of("San Antonio", "San Diego", "San Jose", "San Jose", "Charlotte", "San Francisco"),
                        "[San Antonio, San Diego, San Jose, Charlotte, San Francisco]"),
                Arguments.of(List.of("Seattle", "Denver", "Seattle", "Denver", "Seattle"),
                        "[Seattle, Denver]")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForGetUniqueCityNames")
    void testGetUniqueCityNames(List<String> listCities, String expected) {
        List<String> actual = city.getUniqueCityNames(listCities);

        Assertions.assertEquals(expected, actual.toString());
    }

    static Stream<Arguments> provideArgumentsForGetCityNamesGivenLength() {

        return Stream.of(
                Arguments.of(List.of("New York", "Los Angeles", "Chicago", "Houston", "New York", "Chicago"),
                        "[New York, Los Angeles, Chicago, Houston, New York, Chicago]"),
                Arguments.of(List.of("San Antonio", "San Diego", "San Jose", "San Jose", "Charlotte", "San Francisco"),
                        "[San Antonio, San Diego, San Jose, San Jose, Charlotte, San Francisco]"),
                Arguments.of(List.of("Seattle", "Denver", "Seattle", "Denver", "Seattle"),
                        "[Seattle, Seattle, Seattle]")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForGetCityNamesGivenLength")
    void testGetCityNamesGivenLength(List<String> listCities, String expected) {
        List<String> actual = city.getCityNamesGivenLength(listCities);

        Assertions.assertEquals(expected, actual.toString());
    }

    static Stream<Arguments> provideArgumentsForGetCityNamesBeginningGivenLetter() {

        return Stream.of(
                Arguments.of(List.of("New York", "Los Angeles", "Chicago", "Houston", "New York", "Chicago"),
                        'N', "[New York, New York]"),
                Arguments.of(List.of("San Antonio", "San Diego", "San Jose", "San Jose", "Charlotte", "San Francisco"),
                        'S', "[San Antonio, San Diego, San Jose, San Jose, San Francisco]"),
                Arguments.of(List.of("Seattle", "Denver", "Seattle", "Denver", "Seattle"),
                        'D', "[Denver, Denver]")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForGetCityNamesBeginningGivenLetter")
    void testGetCityNamesBeginningGivenLetter(List<String> listCities, char firstLetterCityNames, String expected) {
        List<String> actual = city.getCityNamesBeginningGivenLetter(listCities, firstLetterCityNames);

        Assertions.assertEquals(expected, actual.toString());
    }

    static Stream<Arguments> provideArgumentsForGetCountRepetitionsGivenCityName() {

        return Stream.of(
                Arguments.of(List.of("New York", "Los Angeles", "Chicago", "Houston", "New York", "Chicago"),
                        "New York", 2),
                Arguments.of(List.of("San Antonio", "San Diego", "San Jose", "San Jose", "Charlotte", "San Francisco"),
                        "San Francisco", 1),
                Arguments.of(List.of("Seattle", "Denver", "Seattle", "Denver", "Seattle"),
                        "Chicago", 0)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForGetCountRepetitionsGivenCityName")
    void testGetCountRepetitionsGivenCityName(List<String> listCities, String cityName, long expected) {
        long actual = city.getCountRepetitionsGivenCityName(listCities, cityName);

        Assertions.assertEquals(expected, actual);
    }
}
