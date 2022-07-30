package com.rakovets.course.java.core.practice.lambda_expressions.city_helper;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

@DisplayName("City helper testing.")
class CityHelperTest {
    static CityHelper cityHelper;
    List<String> list;

    @BeforeAll
    static void initAll() {
        cityHelper = new CityHelper();
    }

    @BeforeEach
    void init() {
        list = new LinkedList<>(List.of("Minsk", "Warshaw", "Italy", "Minsk", "Brest", "Minsk", "Oslo", "Brest"));
    }

    @Test
    @DisplayName("Search for unique cities.")
    void searchUniqueCity() {
        List<String> expected = new LinkedList<>(List.of("Minsk", "Warshaw", "Italy", "Brest", "Oslo"));

        List<String> actual = cityHelper.searchUniqueCity(list);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Search for a city by length.")
    void searchByNameLength() {
        List<String> expected = new LinkedList<>(List.of("Minsk", "Italy", "Minsk", "Brest", "Minsk", "Brest"));

        List<String> actual = cityHelper.searchByNameLength(list, 5);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Search for a city by letter.")
    void searchByLetters() {
        List<String> expected = new LinkedList<>(List.of("Minsk", "Minsk", "Minsk"));

        List<String> actual = cityHelper.searchByLetters(list, "M");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Test the number of repetitions of the city.")
    void searchCityCount() {
        int expected = 3;

        int actual = cityHelper.searchCityCount(list, "Minsk");

        Assertions.assertEquals(expected, actual);
    }
}
