package com.rakovets.course.java.core.practice.lambda_expressions.city_helper;

import java.util.List;
import java.util.stream.Collectors;

public class CityHelper {
    public List<City> getUniqueList(List<City> cityList) {
        List<City> uniqueList = cityList.stream()
                .distinct()
                .collect(Collectors.toList());
        return uniqueList;
    }

    public List<City> getLongCityNames(List<City> cityList) {
        int longOfCityName = 6;
        List<City> longCityNames = cityList.stream()
                .filter(s -> s.getName().length() > longOfCityName)
                .distinct()
                .collect(Collectors.toList());
        return longCityNames;
    }

    public List<City> getSpecialLetterBeginCityNames(List<City> cityList, String letter) {
        List<City> longCityNames = cityList.stream()
                .filter(s -> s.getName().toLowerCase().startsWith(letter.toLowerCase()))
                .distinct()
                .collect(Collectors.toList());
        return longCityNames;
    }

    public long getCountSpecialCityInList(List<City> cityList, String cityName) {
        long countSpecialCityInList = cityList.stream()
                .filter(s -> s.getName().equals(cityName))
                .count();
        return countSpecialCityInList;
    }
}
