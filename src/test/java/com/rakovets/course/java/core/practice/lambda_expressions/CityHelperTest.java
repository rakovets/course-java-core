package com.rakovets.course.java.core.practice.lambda_expressions;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CityHelperTest {
    List<String> cities = Arrays.asList("Minsk","Minsk","Vitebsk","Mogilev","Grodno","Mazyr","Dzyarjinsk","Dzyarjinsk");
    CityHelper cityHelper = new CityHelper(cities);
    @Test
    void uniqueCities() {
        assertEquals(Arrays.asList("Minsk","Vitebsk","Mogilev","Grodno","Mazyr","Dzyarjinsk"), cityHelper.uniqueCities());
    }

    @Test
    void getLongNameCities() {
        assertEquals(Arrays.asList("Vitebsk","Mogilev","Dzyarjinsk","Dzyarjinsk"), cityHelper.getLongNameCities());
    }

    @Test
    void entryLettersCities() {
        assertEquals(Arrays.asList("Minsk","Minsk","Mogilev","Mazyr"), cityHelper.entryLettersCities());
    }

    @Test
    void getCountEntriesCities() {
        assertEquals(2, cityHelper.getCountEntriesCities("Minsk"));
    }
}
