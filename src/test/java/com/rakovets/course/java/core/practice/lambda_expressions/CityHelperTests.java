package com.rakovets.course.java.core.practice.lambda_expressions;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CityHelperTests {
    static Stream<Arguments> provideArgumentsGetUniqueCities() {
        return Stream.of(
                Arguments.of(new String[]{"London", "Paris", "Paris", "Milan", "Rome", "Rome"},
                        Set.of("London", "Paris", "Milan", "Rome")),
                Arguments.of(new String[]{"Paris", "Paris"},
                        Set.of("Paris"))
        );
    }

    @MethodSource("provideArgumentsGetUniqueCities")
    @ParameterizedTest()
    void testGetUniqueCities(String[] arrayOfCities, Set<String> expected) {
        CityHelper cityHelper = new CityHelper(arrayOfCities);

        Set<String> actual = cityHelper.getUniqueCities(arrayOfCities);

        assertEquals(expected, actual);
    }
    static Stream<Arguments> provideArgumentsGetLongCityNames() {
        return Stream.of(
                Arguments.of(new String[]{"London", "Paris", "Paris", "Milan", "Rome", "Rome"}, 4,
                        List.of("London", "Paris", "Paris", "Milan")),
                Arguments.of(new String[]{"Paris", "Paris", "New York"}, 6,
                        List.of("New York"))
        );
    }

    @MethodSource("provideArgumentsGetLongCityNames")
    @ParameterizedTest()
    void testGetLongCityNames(String[] arrayOfCities, int cityNameLength, List<String> expected) {
        CityHelper cityHelper = new CityHelper(arrayOfCities);

        List<String> actual = cityHelper.getLongCityNames(arrayOfCities, cityNameLength);

        assertEquals(expected, actual);
    }
    static Stream<Arguments> provideArgumentsGetCitiesStartWithLetter() {
        return Stream.of(
                Arguments.of(new String[]{"London", "Paris", "Paris", "Milan", "Rome", "Portland"}, 'P',
                        List.of("Paris", "Paris", "Portland")),
                Arguments.of(new String[]{"Paris", "Paris", "New York"}, 'N',
                        List.of("New York"))
        );
    }

    @MethodSource("provideArgumentsGetCitiesStartWithLetter")
    @ParameterizedTest()
    void testGetCitiesStartWithLetter(String[] arrayOfCities, char firstLetterCity, List<String> expected) {
        CityHelper cityHelper = new CityHelper(arrayOfCities);

        List<String> actual = cityHelper.getCitiesStartWithLetter(arrayOfCities, firstLetterCity);

        assertEquals(expected, actual);
    }
    static Stream<Arguments> provideArgumentsGetNumberOccurrencesCity() {
        return Stream.of(
                Arguments.of(new String[]{"London", "Paris", "Paris", "Milan", "Rome", "Portland"}, "Paris", 2),
                Arguments.of(new String[]{"Paris", "Paris", "New York"}, "New York", 1)
        );
    }

    @MethodSource("provideArgumentsGetNumberOccurrencesCity")
    @ParameterizedTest()
    void testGetNumberOccurrencesCity(String[] arrayOfCities, String city, int expected) {
        CityHelper cityHelper = new CityHelper(arrayOfCities);

        int actual = cityHelper.getNumberOccurrencesCity(arrayOfCities, city);

        assertEquals(expected, actual);
    }
}
