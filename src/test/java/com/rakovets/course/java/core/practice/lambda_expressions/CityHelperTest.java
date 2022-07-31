package com.rakovets.course.java.core.practice.lambda_expressions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class CityHelperTest {
    private static final List<String> CITIES = Arrays.asList
            ("Minsk", "Batumi", "Los Angeles", "Gdansk", "New York", "Los Angeles", "Miami");
    private final CityHelper cityHelper = new CityHelper();

    @Test
    public void testGetUniqueCities() {
        Set<String> expected = Set.of("Minsk", "Batumi", "Los Angeles", "Gdansk", "New York", "Miami");

        Set<String> actual = cityHelper.getUniqueCities(CITIES);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testGetCitiesNamesMoreThanXLetters() {
        List<String> expected = List.of("Los Angeles", "New York", "Los Angeles");

        List<String> actual = cityHelper.getCitiesNamesMoreThanXLetters(CITIES, 6);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testGetCitiesNamesMoreThanXLettersGetAllList() {
        List<String> expected = List.of("Minsk", "Batumi", "Los Angeles", "Gdansk", "New York", "Los Angeles", "Miami");

        List<String> actual = cityHelper.getCitiesNamesMoreThanXLetters(CITIES, -1);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testGetCitiesNamesMoreThanXLettersNotExist() {
        List<String> expected = Collections.emptyList();

        List<String> actual = cityHelper.getCitiesNamesMoreThanXLetters(CITIES, 15);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testGetCitiesNamesWithFirstLetterIgnoreCase() {
        List<String> expected = List.of("Minsk", "Miami");

        List<String> actual = cityHelper.getCitiesWithFirstLetterIgnoreCase(CITIES, 'm');

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testGetCitiesNamesWithFirstLetterIgnoreCaseCapitalLetter() {
        List<String> expected = List.of("Minsk", "Miami");

        List<String> actual = cityHelper.getCitiesWithFirstLetterIgnoreCase(CITIES, 'M');

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testGetCitiesNamesWithFirstLetterIgnoreCaseLetterNotExist() {
        List<String> expected = Collections.emptyList();

        List<String> actual = cityHelper.getCitiesWithFirstLetterIgnoreCase(CITIES, 'r');

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testGetFrequencyCityInList() {
        long expected = 2;

        long actual = cityHelper.getFrequencyCityInList(CITIES, "Los Angeles");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testGetFrequencyCityInListNotExist() {
        long expected = 0;

        long actual = cityHelper.getFrequencyCityInList(CITIES, "Rome");

        Assertions.assertEquals(expected, actual);
    }
}
