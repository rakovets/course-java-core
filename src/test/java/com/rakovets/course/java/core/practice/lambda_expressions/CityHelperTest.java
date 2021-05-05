package com.rakovets.course.java.core.practice.lambda_expressions;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CityHelperTest {
    List<String> cities = Arrays.asList("Minsk", "New York", "Los Angeles", "Los Angeles", "New York", "Boston");

    @Test
    void getUniqueCitiesTest() {
        List<String> expected = Arrays.asList("Minsk", "New York", "Los Angeles", "Boston");
        List<String> actual = CityHelper.getUniqueCityNames(cities);
        assertEquals(expected, actual);
    }

    @Test
    void getCitiesNameLongThenTest() {
        List<String> expected = Arrays.asList("Los Angeles", "Los Angeles");
        List<String> actual = CityHelper.getCityNamesLongThen(cities, 8);
        assertEquals(expected, actual);
    }

    @Test
    void startLetter() {
        List<String> expected = Arrays.asList("Minsk");
        List<String> actual = CityHelper.getCityNamesStartWith(cities, 'M');
        assertEquals(expected, actual);
    }

    @Test
    void equalNames() {
        int expected = 2;
        int actual = CityHelper.countNumberCities(cities, "New York");
        assertEquals(expected, actual);
    }
}
