package com.rakovets.course.java.core.practice.lambda_expressions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CityHelperTest {
    private CityHelper cityHelper;

    @BeforeEach
    void initEach() {
        cityHelper = new CityHelper();
    }

    @Test
    void testGetUniqueCities() {
        List<String> expected = List.of("Minsk", "Grodno", "Gomel", "Vitebsk", "Mogilev", "Brest");
        List<String> cities = List.of("Minsk", "Minsk", "Grodno", "Grodno", "Gomel", "Vitebsk", "Mogilev", "Brest");

        List<String> actual = cityHelper.getUniqueCities(cities);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testGetCitiesNameLongerThanX() {
        List<String> expected = List.of("Vitebsk", "Mogilev");
        List<String> cities = List.of("Minsk", "Minsk", "Grodno", "Grodno", "Gomel", "Vitebsk", "Mogilev", "Brest");

        List<String> actual = cityHelper.getCitiesNameLongerThan(cities, 6);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testGetCitiesNameLongerThanXLettersNotExist() {
        List<String> expected = Collections.emptyList();
        List<String> cities = List.of("Minsk", "Minsk", "Grodno", "Grodno", "Gomel", "Vitebsk", "Mogilev", "Brest");

        List<String> actual = cityHelper.getCitiesNameLongerThan(cities, 10);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testGetCitiesNameStartingWithLetter() {
        List<String> expected = List.of("Minsk", "Minsk", "Mogilev");
        List<String> cities = List.of("Minsk", "Minsk", "Grodno", "Grodno", "Gomel", "Vitebsk", "Mogilev", "Brest");

        List<String> actual = cityHelper.getCitiesNameStartingWithLetter(cities, 'M');

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testGetCitiesNameStartingWithLetterNotExist() {
        List<String> expected = Collections.emptyList();
        List<String> cities = List.of("Minsk", "Minsk", "Grodno", "Grodno", "Gomel", "Vitebsk", "Mogilev", "Brest");

        List<String> actual = cityHelper.getCitiesNameStartingWithLetter(cities, 'I');

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testCountCity() {
        List<String> cities = List.of("Minsk", "Minsk", "Grodno", "Grodno", "Gomel", "Vitebsk", "Mogilev", "Brest");
        int expected = 2;

        int actual = cityHelper.countCity(cities, "Minsk");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testCountCityNotExist() {
        List<String> cities = List.of("Minsk", "Minsk", "Grodno", "Grodno", "Gomel", "Vitebsk", "Mogilev", "Brest");
        int expected = 0;

        int actual = cityHelper.countCity(cities, "Pinsk");

        Assertions.assertEquals(expected, actual);
    }
}
