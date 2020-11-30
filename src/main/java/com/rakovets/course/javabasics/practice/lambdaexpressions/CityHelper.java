package com.rakovets.course.javabasics.practice.lambdaexpressions;

import java.util.List;
import java.util.stream.Collectors;

public class CityHelper {
    public static List<String> getUniqueCities(List<String> list) {
        return list.stream().
                distinct().collect(Collectors.toList());
    }
    public static List<String> getCitiesWithLongName(List<String> list) {
        return list.stream().
                filter(city -> city.length() > 6).
                collect(Collectors.toList());
    }
    public static List<String> getCitiesNamesStartedWithLetter (List<String> list, char letter) {
        return list.stream().
                distinct().
                filter(city -> city.charAt(0) == letter).
                collect(Collectors.toList());
    }
    public static long getCountCityInList(List<String> list, String city) {
        return list.stream().
                filter(cityInStream -> cityInStream.equals(city)).
                count();
    }
}
