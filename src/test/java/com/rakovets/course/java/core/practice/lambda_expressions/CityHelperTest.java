package com.rakovets.course.java.core.practice.lambda_expressions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CityHelperTest {

    @Test
    void getUniqueCity() {
        List<String> list = new LinkedList<>();
        list.add("Minsk");
        list.add("Moscow");
        list.add("Minsk");
        CityHelper listOfCity = new CityHelper(list);
        List<String> expected = new LinkedList<>();
        expected.add("Minsk");
        expected.add("Moscow");

        List<String> actual = listOfCity.getUniqueCity();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void getCityLenghtMoreThan6() {
        List<String> list = new LinkedList<>();
        list.add("Minskij");
        list.add("Moscow");
        CityHelper listOfCity = new CityHelper(list);
        List<String> expected = new LinkedList<>();
        expected.add("Minskij");

        List<String> actual = listOfCity.getCityLenghtMoreThan6();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void getCityOfStartChar() {
        List<String> list = new LinkedList<>();
        list.add("Minsk");
        list.add("Soligorsk");
        CityHelper listOfCity = new CityHelper(list);
        List<String> expected = new LinkedList<>();
        expected.add("Minsk");

        List<String> actual = listOfCity.getCityOfStartChar('M');

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void getCounterOfCity() {
        List<String> list = new LinkedList<>();
        list.add("Minsk");
        list.add("Soligorsk");
        list.add("Minsk");
        CityHelper listOfCity = new CityHelper(list);
        int expected = 2;

        int actual = listOfCity.getCounterOfCity("Minsk");

        Assertions.assertEquals(expected, actual);
    }
}
