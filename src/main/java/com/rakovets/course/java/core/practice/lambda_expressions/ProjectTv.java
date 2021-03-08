package com.rakovets.course.java.core.practice.lambda_expressions;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ProjectTv {

    public static List<TV> getDiagonal(List<TV> list, double diagonal) {
        return list.stream().filter(j -> j.getDiagonal() == diagonal).collect(Collectors.toList());
    }

    public static List<TV> getManufacture(List<TV> list, String manufacture) {
        return list.stream().filter(j -> j.getManufacture().equals(manufacture)).collect(Collectors.toList());
    }

    public static List<TV> getAgeOld(List<TV> list, int ageOld) {
        return list.stream().filter(j -> j.getYearsOfIssue() > ageOld).collect(Collectors.toList());
    }

    public static List<TV> getPrice(List<TV> list, double firstPrice, double secondPrice) {
        return list.stream().filter(j -> j.getPrice() >= firstPrice && j.getPrice() <= secondPrice).collect(Collectors.toList());
    }

    public static List<TV> getSortPriceUp(List<TV> list) {
        return list.stream().sorted(Comparator.comparing(TV::getPrice)).collect(Collectors.toList());
    }

    public static List<TV> getSortPriceDown(List<TV> list) {
        return list.stream().sorted(Comparator.comparing(TV::getPrice).reversed()).collect(Collectors.toList());
    }

    public static List<TV> getSortDiagonalUp(List<TV> list) {
        return list.stream().sorted(Comparator.comparing(TV::getDiagonal)).collect(Collectors.toList());
    }

    public static List<TV> getSortDiagonalDown(List<TV> list) {
        return list.stream().sorted(Comparator.comparing(TV::getDiagonal).reversed()).collect(Collectors.toList());
    }
}
