package com.rakovets.course.java.core.practice.lambda_expressions;

import com.rakovets.course.java.core.practice.lambda_expressions.city_helper.City;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class TestCity {
    City city = new City();
    List<String> cities = List.of("Minsk", "Gomel", "Svetlogorsk", "Barcelona", "Pinsk",
            "Mozyr", "Loev", "Loev", "Gomel", "Minsk", "Mozyr", "Pinsk");
    @Test
    public void testGetUniqueCities(){
        List<String> expected = List
                .of("Minsk", "Gomel", "Svetlogorsk", "Barcelona", "Pinsk", "Mozyr", "Loev");

        List<String> actual = city.getUniqueCities(cities);

        Assertions.assertEquals(expected, actual);
    }
}
