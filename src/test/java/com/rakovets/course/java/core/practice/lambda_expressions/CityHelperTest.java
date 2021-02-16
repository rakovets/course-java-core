package com.rakovets.course.java.core.practice.lambda_expressions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CityHelperTest {
    @Test
    void getUnique() {
        // GIVEN
        List<String> cities = new ArrayList<>();
        Collections.addAll(cities, "Paris", "London", "Minsk", "Gdansk", "Lvov", "London", "Minsk");

        // WHEN
        String actualString = CityHelper.getUnique(cities).toString();

        // THEN
        Assertions.assertEquals("[Paris, London, Minsk, Gdansk, Lvov]", actualString);
    }

    @Test
    void getCitiesLongerSix() {
        // GIVEN
        List<String> cities = new ArrayList<>();
        Collections.addAll(cities, "Barcelona", "London", "Minsk", "Tegucigalpa", "Lvov", "Petersburg");

        // WHEN
        String actualString = CityHelper.getCitiesLongerSix(cities).toString();

        // THEN
        Assertions.assertEquals("[Barcelona, Tegucigalpa, Petersburg]", actualString);
    }

    @Test
    void getCitiesStartsWith() {
        // GIVEN
        List<String> cities = new ArrayList<>();
        Collections.addAll(cities, "Milan", "Moscow", "Barcelona", "Gdansk", "Lvov", "London", "Minsk");

        // WHEN
        String actualString = CityHelper.getCitiesStartsWith(cities, 'M').toString();

        // THEN
        Assertions.assertEquals("[Milan, Moscow, Minsk]", actualString);
    }

    @Test
    void getCountOfCity() {
        // GIVEN
        List<String> cities = new ArrayList<>();
        Collections.addAll(cities, "Milan", "Minsk", "Barcelona", "Minsk", "Lvov", "London", "Minsk");

        // WHEN
        int actualInt = CityHelper.getCountOfCity(cities, "minsk");

        // THEN
        Assertions.assertEquals(3, actualInt);
    }
}
