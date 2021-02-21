package com.rakovets.course.java.core.practice.lambda_expressions.project_city_helper;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class CityHelperTest {

    @Test
    void getUniqueCity() {
        //Given
        List<String> cities = new ArrayList<>();
        cities.add("Minsk");
        cities.add("Moscow");
        cities.add("Moscow");
        cities.add("Geneve");
        cities.add("Zurich");
        cities.add("Vienna");
        cities.add("Vienna");

        List<String> expectedResult = new ArrayList<>();
        expectedResult.add("Minsk");
        expectedResult.add("Moscow");
        expectedResult.add("Geneve");
        expectedResult.add("Zurich");
        expectedResult.add("Vienna");
        
        //When
        List<String> actualResult = CityHelper.getUniqueCity(cities);

        //Than
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void getSixCharCity() {
        //Given
        List<String> cities = new ArrayList<>();
        cities.add("Minsk");
        cities.add("Moscow");
        cities.add("Geneve");
        cities.add("Zurich");
        cities.add("Vienna");
        cities.add("Vienna");
        cities.add("Melbourn");
        cities.add("Melbourn");
        cities.add("Berlin");
        cities.add("Berlin");
        cities.add("Washington");

        List<String> expectedResult = new ArrayList<>();
        expectedResult.add("Melbourn");
        expectedResult.add("Washington");
        //When
        List<String> actualResult = CityHelper.getMoreSixCharCity(cities);
        //Than
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void getBeginCharCity() {
        //Given
        List<String> cities = new ArrayList<>();
        cities.add("Minsk");
        cities.add("Moscow");
        cities.add("Geneve");
        cities.add("Zurich");
        cities.add("Vienna");
        cities.add("Vienna");
        cities.add("Melbourn");
        cities.add("Melbourn");
        cities.add("Berlin");
        cities.add("Berlin");
        cities.add("Washington");

        List<String> expectedResult = new ArrayList<>();
        expectedResult.add("Minsk");
        expectedResult.add("Moscow");
        expectedResult.add("Melbourn");

        //When
        List<String> actualResult = CityHelper.getBeginCharCity(cities, 'M');

        //Than
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void getCountCity() {
        //Given
        List<String> cities = new ArrayList<>();
        cities.add("Minsk");
        cities.add("Moscow");
        cities.add("Geneve");
        cities.add("Zurich");
        cities.add("Vienna");
        cities.add("Vienna");
        cities.add("Vienna");
        cities.add("Melbourn");
        cities.add("Melbourn");
        cities.add("Berlin");
        cities.add("Berlin");
        cities.add("Washington");
        long expectedResult = 3;

        //When
        long actualResult = CityHelper.getCountCity(cities, "Vienna");

        //Than
        Assertions.assertEquals(expectedResult, actualResult);
    }
}
