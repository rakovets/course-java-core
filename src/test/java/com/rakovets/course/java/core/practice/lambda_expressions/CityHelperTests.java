package com.rakovets.course.java.core.practice.lambda_expressions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CityHelperTests {

    @Test
    void getUniqueCity() {
        List<String> list = new ArrayList<>();
        Collections.addAll(list, "Minsk", "Warsaw", "Warsaw", "Nicosia");

        String expectedString = "[Minsk, Warsaw, Nicosia]";

        Assertions.assertEquals(expectedString, CityHelper.getUniqueCity(list).toString());
    }

    @Test
    void getLongCityName() {
        List<String> list = new ArrayList<>();
        Collections.addAll(list, "Minsk", "Warsaw", "Warsaw", "Nicosia");

        String expectedString = "[Nicosia]";

        Assertions.assertEquals(expectedString, CityHelper.getLongCityName(list, 6).toString());
    }

    @Test
    void getSpecificChar() {
        List<String> list = new ArrayList<>();
        Collections.addAll(list, "Minsk", "Warsaw", "Warsaw", "Nicosia");

        String expectedString = "[Minsk]";

        Assertions.assertEquals(expectedString, CityHelper.getSpecificChar(list, 'M').toString());
    }

    @Test
    void getCityCount() {
        List<String> list = new ArrayList<>();
        Collections.addAll(list, "Minsk", "Warsaw", "Warsaw", "Nicosia");

        long expectedLong = 2;

        Assertions.assertEquals(expectedLong, CityHelper.getCityCount(list, "Warsaw"));
    }
}
