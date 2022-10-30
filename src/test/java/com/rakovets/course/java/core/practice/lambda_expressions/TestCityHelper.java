package com.rakovets.course.java.core.practice.lambda_expressions;

import com.rakovets.course.java.core.practice.lambda_expressions.city_helper.City;
import com.rakovets.course.java.core.practice.lambda_expressions.city_helper.CityHelper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class TestCityHelper {
    CityHelper cityHelper = new CityHelper();

    static Stream<Arguments> provideArgumentsForGetUniqueList() {
        return Stream.of(
                Arguments.of(new ArrayList<>(List.of(new City("London"), new City("Minsk"), new City("NY"), new City("Riga"), new City("Paris"), new City("Kair"))),
                        new ArrayList<>(List.of(new City("London"), new City("Minsk"), new City("NY"), new City("Riga"), new City("Paris"), new City("Kair")))),
                Arguments.of(new ArrayList<>(List.of(new City("Kiev"), new City("Minsk"), new City("NY"), new City("Riga"), new City("Kiev"), new City("Minsk"), new City("NY"), new City("Riga"))),
                        new ArrayList<>(List.of(new City("Kiev"), new City("Minsk"), new City("NY"), new City("Riga")))),
                Arguments.of(new ArrayList<>(List.of(new City("London"), new City("London"), new City("London"))),
                        new ArrayList<>(List.of(new City("London"))))
        );
    }

    @ParameterizedTest(name = "countGetUniqueList")
    @MethodSource("provideArgumentsForGetUniqueList")
    void testGetUniqueList(List<City> cityList, List<City> expected) {
        List<City> actual = cityHelper.getUniqueList(cityList);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForGetLongCityNames() {
        return Stream.of(
                Arguments.of(new ArrayList<>(List.of(new City("Kiev"), new City("Minsk"), new City("NY"), new City("Riga"), new City("Paris"), new City("Kair"))), new ArrayList<>()),
                Arguments.of(new ArrayList<>(List.of(new City("Kiev"), new City("Minsk"), new City("NY"), new City("Riga"), new City("Paris"), new City("Mogilev"))), new ArrayList<>(List.of(new City("Mogilev")))),
                Arguments.of(new ArrayList<>(List.of(new City("Mogilev"), new City("Mogilev"), new City("Mogilev"))), new ArrayList<>(List.of(new City("Mogilev"))))
        );
    }

    @ParameterizedTest(name = "countGetLongCityNames")
    @MethodSource("provideArgumentsForGetLongCityNames")
    void testGetLongCityNames(List<City> cityList, List<City> expected) {
        List<City> actual = cityHelper.getLongCityNames(cityList);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForGetSpecialLetterBeginCityNames() {
        return Stream.of(
                Arguments.of(new ArrayList<>(List.of(new City("Kiev"), new City("Minsk"), new City("NY"), new City("Riga"), new City("Paris"), new City("Kair"))), "k", new ArrayList<>(List.of(new City("Kiev"), new City("Kair")))),
                Arguments.of(new ArrayList<>(List.of(new City("Kiev"), new City("Minsk"), new City("NY"), new City("Riga"), new City("Paris"), new City("Mogilev"))), "M", new ArrayList<>(List.of(new City("Minsk"), new City("Mogilev")))),
                Arguments.of(new ArrayList<>(List.of(new City("Mogilev"), new City("Mogilev"), new City("Mogilev"))), "W", new ArrayList<>())
        );
    }

    @ParameterizedTest(name = "countGetSpecialLetterBeginCityNames")
    @MethodSource("provideArgumentsForGetSpecialLetterBeginCityNames")
    void testGetSpecialLetterBeginCityNames(List<City> cityList, String letter, List<City> expected) {
        List<City> actual = cityHelper.getSpecialLetterBeginCityNames(cityList, letter);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForGetCountSpecialCityInList() {
        return Stream.of(
                Arguments.of(new ArrayList<>(List.of(new City("Paris"), new City("Minsk"), new City("NY"), new City("Riga"), new City("Paris"), new City("Paris"))), "Paris", 3),
                Arguments.of(new ArrayList<>(List.of(new City("Kiev"), new City("Minsk"), new City("NY"), new City("Riga"), new City("Paris"))), "Mogilev", 0),
                Arguments.of(new ArrayList<>(List.of(new City("Mogilev"), new City("Mogilev"), new City("Mogilev"))), "Mogilev", 3)
        );
    }

    @ParameterizedTest(name = "countGetCountSpecialCityInList")
    @MethodSource("provideArgumentsForGetCountSpecialCityInList")
    void testGetCountSpecialCityInList(List<City> cityList, String city, long expected) {
        long actual = cityHelper.getCountSpecialCityInList(cityList, city);

        Assertions.assertEquals(expected, actual);
    }
}
