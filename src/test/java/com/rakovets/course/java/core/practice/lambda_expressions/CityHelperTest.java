package com.rakovets.course.java.core.practice.lambda_expressions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class CityHelperTest {
    private static List<String> cities;
    private static CityHelper cityHelper;

    @BeforeAll
    static void setUp() {
        cities = new ArrayList<>
                (Arrays.asList("Minsk", "Batumi", "Los Angeles", "Gdansk", "New York", "Los Angeles", "Miami"));
        cityHelper = new CityHelper();
    }

    @Test
    public void testGetUniqueCities() {
        Set<String> expected = Set.of("Minsk", "Batumi", "Los Angeles", "Gdansk", "New York", "Miami");

        Set<String> actual = cityHelper.getUniqueCities(cities);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testGetCitiesNamesMoreThanXLetters() {
        Set<String> expected = Set.of("New York", "Los Angeles");

        Set<String> actual = cityHelper.getCitiesNamesMoreThanXLetters(cities, 6);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testGetCitiesNamesWithFirstLetter() {
        Set<String> expected = Set.of("Minsk", "Miami");

        Set<String> actual = cityHelper.getCitiesWithFirstLetter(cities, 'm');

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void testGetFrequencyCityInList() {
        long expected = 2;

        long actual = cityHelper.getFrequencyCityInList(cities, "Los Angeles");

        Assertions.assertEquals(expected, actual);
    }
}
