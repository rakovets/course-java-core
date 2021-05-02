package com.rakovets.course.java.core.practice.lambda_expressions;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TVfilter {
    public static List<TV> specificDiagonal(List<TV> tvlist, int diagonal) {
        return tvlist.stream()
                .filter(tv -> tv.getDiagonal() == diagonal)
                .collect(Collectors.toList());
    }

    public static List<TV> specificManufacturer(List<TV> tvlist, String manufacturer) {
        return tvlist.stream()
                .filter(tv -> tv.getManufacturer() == manufacturer)
                .collect(Collectors.toList());
    }

    public static List<TV> underSpecialYear(List<TV> tvlist, int year) {
        return tvlist.stream()
                .filter(tv -> tv.getYear() < year)
                .collect(Collectors.toList());
    }

    public static List<TV> specificPrise(List<TV> tvlist, double minCost, double maxCost) {
        return tvlist.stream()
                .filter(tv -> tv.getPrice() < minCost && tv.getPrice() <= maxCost)
                .collect(Collectors.toList());
    }

    public static List<TV> sortedByPriceAscending(List<TV> tvlist) {
        return tvlist.stream().sorted(Comparator.comparingDouble(tv -> tv.getPrice()))
                .collect(Collectors.toList());
    }

    public List<TV> sortedByPriceDescending(List<TV> tvlist) {
        return tvlist.stream()
                .sorted(Comparator.comparingDouble(TV::getPrice).reversed())
                .collect(Collectors.toList());
    }
}
