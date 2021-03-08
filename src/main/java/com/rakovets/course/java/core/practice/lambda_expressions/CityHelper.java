package com.rakovets.course.java.core.practice.lambda_expressions;

import java.util.List;
import java.util.stream.Collectors;

public class CityHelper {
    public List<String> nameTown;

    public CityHelper(List<String> nameTown) {
        this.nameTown = nameTown;
    }

    public static List<String> getUniqueCity(List<String> nameTown) {
        return nameTown.stream().distinct().collect(Collectors.toList());
    }

    public static List<String> getNameSizeSix(List<String> list) {
        return list.stream().filter(j -> j.length() > 6).collect(Collectors.toList());
    }

    public static List<String> getNameStartLetter(List<String> list, char ch) {
        return list.stream().filter(j -> j.charAt(0) == ch).collect(Collectors.toList());
    }

    public static int getReiterationName(List<String> list, String nameTown) {
        return (int) list.stream().filter(j -> j == nameTown).count();
    }
}
