package com.rakovets.course.javabasics.practice.lambdaexpressions.streams;

import java.util.Arrays;
import java.util.List;

import static com.rakovets.course.javabasics.practice.lambdaexpressions.streams.CityHelper.*;

class CItyHelperDemo {

    public static void main(String[] args) {

        List<String> cities = Arrays.asList("Minsk", "Minsk", "Gomel", "Paris", "Amsterdam");

        System.out.println(cities);

        System.out.println(getDistinctCities(cities));

        System.out.println(getDistinctCitiesMoreSixSymblos(cities));

        System.out.println(getDistinctCitiesStartWith(cities, 'G'));

    }
}
