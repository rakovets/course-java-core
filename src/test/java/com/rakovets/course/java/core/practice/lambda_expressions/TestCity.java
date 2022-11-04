package com.rakovets.course.java.core.practice.lambda_expressions;

import com.rakovets.course.java.core.practice.lambda_expressions.city_helper.City;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

public class TestCity {
    City city = new City();
    List<String> cities = List.of("Minsk", "Gomel", "Svetlogorsk", "Barcelona", "Pinsk",
            "Mozyr", "Loev", "Loev", "Gomel", "Minsk", "Mozyr", "Pinsk");
    Integer amountLetters = 6;
    String letter = "B";
    String town = "Barcelona";

    @Test
    public void testGetUniqueCities() {
        List<String> expected = List
                .of("Minsk", "Gomel", "Svetlogorsk", "Barcelona", "Pinsk", "Mozyr", "Loev");

        List<String> actual = city.getUniqueCities(cities);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testGetCitiesGreaterThanGivenNumberOfCharacters() {
        List<String> expected = List.of("Svetlogorsk", "Barcelona");

        List<String> actual = city.getCitiesGreaterThanGivenNumberOfCharacters(cities, amountLetters);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testGetCitiesStartingWithTheLetter() {
        List<String> expected = List.of("Barcelona");

        List<String> actual = city.getCitiesStartingWithTheLetter(cities, letter);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testGetAmountCityIntoList() {
        long expected = 1;

        long actual = city.getAmountCityIntoList(cities, town);

        Assertions.assertEquals(expected, actual);
    }
}
