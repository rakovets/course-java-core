package com.rakovets.course.java.core.practice.lambda_expressions;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class CityHelperDemo {
    public static void main(String[] args) {
        List<String> cityList = new LinkedList<>();
        cityList.add("New York");
        cityList.add("Chicago");
        cityList.add("Phoenix");
        cityList.add("Chicago");
        cityList.add("Philadelphia");
        cityList.add("New York");
        cityList.add("New York");
        cityList.add("New York");

        System.out.println(CityHelper.distinctCity(cityList));
        System.out.println(CityHelper.lengthCity(cityList,7));
        System.out.println(CityHelper.startWithLetter(cityList,"N"));
        System.out.println(CityHelper.countCityReiteration(cityList,"New York"));
    }

}
