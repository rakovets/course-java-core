package com.rakovets.course.java.core.practice.lambda_expressions;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TVUtility {
    public static List<TV> getTvDiagonal(List<TV> tvSets, double diagonal) {
        return tvSets.stream()
                .filter(tv -> tv.getDiagonal() == diagonal)
                .collect(Collectors.toList());
    }

    public static List<TV> getTvBrand(List<TV> tvSets, String company) {
        return tvSets.stream()
                .filter(tv -> tv.getBrand().equals(company))
                .collect(Collectors.toList());
    }

    public static List<TV> getTvNotOlderYear(List<TV> tvSets, int year) {
        return tvSets.stream()
                .filter(tv -> tv.getYear() >= year)
                .collect(Collectors.toList());
    }

    public static List<TV> getTvPriceInCertainRange(List<TV> tvSets, double minPrice, double maxPrice) {
        return tvSets.stream()
                .filter(tv -> tv.getPrice() > minPrice && tv.getPrice() <= maxPrice)
                .collect(Collectors.toList());
    }

    public static List<TV> getTvSortedByPriceAscending(List<TV> tvSets) {
        return tvSets.stream().sorted(Comparator.comparingDouble(TV::getPrice))
                .collect(Collectors.toList());
    }

    public static List<TV> getTVSortedByPriceDescending(List<TV> tvSets) {
        return tvSets.stream()
                .sorted(Comparator.comparingDouble(TV::getPrice).reversed())
                .collect(Collectors.toList());
    }

    public static List<TV> getTvSortedDiagonallyAscending(List<TV> tvSets) {
        return tvSets.stream()
                .sorted(Comparator.comparingDouble(TV::getDiagonal))
                .collect(Collectors.toList());
    }

    public static List<TV> getTvSortedDiagonallyDescending(List<TV> tvSets) {
        return tvSets.stream()
                .sorted(Comparator.comparingDouble(TV::getDiagonal).reversed())
                .collect(Collectors.toList());
    }
}
