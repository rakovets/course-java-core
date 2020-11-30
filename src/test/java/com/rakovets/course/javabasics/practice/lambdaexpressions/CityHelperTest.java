package com.rakovets.course.javabasics.practice.lambdaexpressions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;

public class CityHelperTest {
    private static List<String> cities;
    private static List<String> uniqueCities;
    private static List<String> citiesWithLongName;
    private static List<String> citiesNamesStartedWithM;
    @BeforeAll
    static void init() {
        cities = List.of("London", "Minsk", "Berlin", "Moscow", "Oslo", "Boston", "Minsk", "London", "Moscow");
        uniqueCities = List.of("London", "Minsk", "Berlin", "Moscow", "Oslo", "Boston");
        citiesWithLongName = List.of();
        citiesNamesStartedWithM = List.of("Minsk", "Moscow");
    }
    @Test
    void getUniqueCitiesTest() {
        Assertions.assertEquals(uniqueCities, CityHelper.getUniqueCities(cities));
    }
    @Test
    void getCitiesWithLongNameTest() {
        Assertions.assertEquals(citiesWithLongName, CityHelper.getCitiesWithLongName(cities));
    }
    @Test
    void getCitiesNamesStartedWithLetterTest() {
        Assertions.assertEquals(citiesNamesStartedWithM, CityHelper.getCitiesNamesStartedWithLetter(cities, 'M'));
    }
    @Test
    void getCountCityInListTest() {
        Assertions.assertEquals(2, CityHelper.getCountCityInList(cities, "Minsk"));
    }
}
