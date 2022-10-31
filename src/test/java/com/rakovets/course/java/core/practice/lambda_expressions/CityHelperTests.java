package com.rakovets.course.java.core.practice.lambda_expressions;

import com.rakovets.course.java.core.practice.lambda_expressions.project_city_helper.CityHelper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class CityHelperTests {
    CityHelper cityHelper = new CityHelper();
    List<String> cities = new ArrayList<>(List.of(
            "Минск", "Киев", "Одесса", "Харьков", "Изюм", "Херсон", "Варшава",
            "Минск", "Херсон", "Мариуполь", "Гомель", "Мариуполь", "Варшава", "Киев", "Одесса", "Харьков", "Изюм", "Херсон", "Варшава",
            "Минск", "Херсон", "Мариуполь"
    ));

    @Test
    public void testGetUniqueCities() {
        ArrayList<String> uniqueCities = cityHelper.getUniqueCities(cities);
        String[] arrayActual = new String[uniqueCities.size()];
        uniqueCities.toArray(arrayActual);
        String stringActual = String.join(" ", arrayActual);
        String stringExpected = "Минск Киев Одесса Харьков Изюм Херсон Варшава Мариуполь Гомель";

        Assertions.assertEquals(stringExpected, stringActual);
    }

    @Test
    public void testGetCitiesWithSpecifiedLengthOfName() {
        ArrayList<String> uniqueCities = cityHelper.getCitiesWithSpecifiedLengthOfName(cities, 6);
        String[] arrayActual = new String[uniqueCities.size()];
        uniqueCities.toArray(arrayActual);
        String stringActual = String.join(" ", arrayActual);
        String stringExpected = "Харьков Варшава Мариуполь";

        Assertions.assertEquals(stringExpected, stringActual);
    }

    @Test
    public void testGetCitiesWithSpecifiedFirstLetterInName() {
        ArrayList<String> uniqueCities = cityHelper.getCitiesWithSpecifiedFirstLetterInName(cities, 'М');
        String[] arrayActual = new String[uniqueCities.size()];
        uniqueCities.toArray(arrayActual);
        String stringActual = String.join(" ", arrayActual);
        String stringExpected = "Минск Мариуполь";

        Assertions.assertEquals(stringExpected, stringActual);
    }

    @Test
    public void testGetCitiesWithSpecifiedName_RightName() {
        long count = cityHelper.getCitiesWithSpecifiedName(cities, "Минск");
        System.out.println(count);

        Assertions.assertEquals(3, count);
    }

    @Test
    public void testGetCitiesWithSpecifiedName_WrongName() {
        long count = cityHelper.getCitiesWithSpecifiedName(cities, "Менск");
        System.out.println(count);

        Assertions.assertEquals(-1, count);
    }
}
