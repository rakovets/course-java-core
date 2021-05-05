package com.rakovets.course.java.core.practice.lambda_expressions;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TvFilter {
    public static List<TV> specificDiagonal(List<TV> tvList, int diagonal) {
        return tvList.stream()
                .filter(tv -> tv.getDiagonal() == diagonal)
                .collect(Collectors.toList());
    }

    public static List<TV> specificManufacturer(List<TV> tvList, String manufacturer) {
        return tvList.stream()
                .filter(tv -> tv.getManufacturer() == manufacturer)
                .collect(Collectors.toList());
    }

    public static List<TV> underSpecialYear(List<TV> tvList, int year) {
        return tvList.stream()
                .filter(tv -> tv.getYear() <= year)
                .collect(Collectors.toList());
    }

    public static List<TV> specificPrise(List<TV> tvList, double minCost, double maxCost) {
        return tvList.stream()
                .filter(tv -> tv.getPrice() > minCost && tv.getPrice() <= maxCost)
                .collect(Collectors.toList());
    }

    public static List<TV> sortedByPriceAscending(List<TV> tvList) {
        return tvList.stream().sorted(Comparator.comparingDouble(tv -> tv.getPrice()))
                .collect(Collectors.toList());
    }

    public static List<TV> sortedByPriceDescending(List<TV> tvList) {
        return tvList.stream()
                .sorted(Comparator.comparingDouble(TV::getPrice).reversed())
                .collect(Collectors.toList());
    }
}
