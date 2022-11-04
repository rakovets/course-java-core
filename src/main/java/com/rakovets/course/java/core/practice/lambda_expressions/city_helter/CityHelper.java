package com.rakovets.course.java.core.practice.lambda_expressions.city_helter;

import java.util.List;
import java.util.stream.Collectors;

public class CityHelper {
    public List<String> getUniqueCityNames(List<String> listCities) {
        return listCities.stream()
                .distinct()
                .collect(Collectors.toList());
    }

    public List<String> getCityNamesGivenMinLengthCityNames(List<String> listCities, int minLengthCityNames) {
        return listCities.stream()
                .filter(x -> x.length() > minLengthCityNames)
                .collect(Collectors.toList());
    }

    public List<String> getCityNamesBeginningGivenLetter(List<String> listCities, char firstLetterCityNames) {
        return listCities.stream()
                .filter(x -> x.charAt(0) == firstLetterCityNames)
                .collect(Collectors.toList());
    }

    public long getCountRepetitionsGivenCityName(List<String> listCities, String city) {
        return listCities.stream()
                .filter(city::equals)
                .count();
    }
}
