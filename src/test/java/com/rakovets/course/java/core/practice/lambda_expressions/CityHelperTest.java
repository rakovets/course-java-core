package com.rakovets.course.java.core.practice.lambda_expressions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CityHelperTest {
    @Test
    void getCitiesTest() {
        List<String> cities = new ArrayList<>(Arrays.asList("Brest", "Vitebsk", "Gomel", "Grodno", "Mogilev", "Minsk", "Minsk", "Vitebsk", "Gomel", "Grodno", "Mogilev", "Minsk"));

        String actualString = CityHelper.getCities(cities).toString();

        Assertions.assertEquals("[Brest, Vitebsk, Gomel, Grodno, Mogilev, Minsk, Minsk, Vitebsk, Gomel, Grodno, Mogilev, Minsk]", actualString);
    }

    @Test
    void getUniqueCitiesTest() {
        List<String> cities = new ArrayList<>(Arrays.asList("Brest", "Vitebsk", "Gomel", "Grodno", "Mogilev", "Minsk", "Minsk", "Vitebsk", "Gomel", "Grodno", "Mogilev", "Minsk"));

        String actualString = CityHelper.getUniqueCities(cities).toString();

        Assertions.assertEquals("[Brest, Vitebsk, Gomel, Grodno, Mogilev, Minsk]", actualString);
    }

    @Test
    void getCitiesLogerThenSixTest() {
        List<String> cities = new ArrayList<>(Arrays.asList("Brest", "Vitebsk", "Gomel", "Grodno", "Mogilev", "Minsk", "Minsk", "Vitebsk", "Gomel", "Grodno", "Mogilev", "Minsk"));

        String actualString = CityHelper.getCitiesLogerThenSix(cities).toString();

        Assertions.assertEquals("[Vitebsk, Mogilev]", actualString);
    }

    @Test
    void getCitiesStartLetterTest() {
        List<String> cities = new ArrayList<>(Arrays.asList("Brest", "Vitebsk", "Gomel", "Grodno", "Mogilev", "Minsk", "Minsk", "Vitebsk", "Gomel", "Grodno", "Mogilev", "Minsk"));

        String actualString = CityHelper.getCitiesStartLetter(cities, 'M').toString();

        Assertions.assertEquals("[Mogilev, Minsk]", actualString);
    }

    @Test
    void getCountCityTest() {
        List<String> cities = new ArrayList<>(Arrays.asList("Brest", "Vitebsk", "Gomel", "Grodno", "Mogilev", "Minsk", "Minsk", "Vitebsk", "Gomel", "Grodno", "Mogilev", "Minsk"));

        long actualLong = CityHelper.getCountCity(cities, "Minsk");

        Assertions.assertEquals(3, actualLong);
    }
}
