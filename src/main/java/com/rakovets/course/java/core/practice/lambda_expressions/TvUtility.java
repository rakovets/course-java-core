package com.rakovets.course.java.core.practice.lambda_expressions;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TvUtility {
    public static List<TV> getTvDiagonal(List<TV> tvSets, double diagonal) {
        return tvSets.stream()
                .filter(tv -> tv.getDiagonal() == diagonal)
                .collect(Collectors.toList());
    }

    public static List<TV> getTvCompany(List<TV> tvSets, String company) {
        return tvSets.stream()
                .filter(tv -> tv.getCompany() == company)
                .collect(Collectors.toList());
    }

    public static List<TV> getTvYearRelease(List<TV> tvSets, int year) {
        return tvSets.stream()
                .filter(tv -> tv.getYear() <= year)
                .collect(Collectors.toList());
    }

    public static List<TV> getTvPrice(List<TV> tvSets, double minPrice, double maxPrice) {
        return tvSets.stream()
                .filter(tv -> tv.getPrice() > minPrice && tv.getPrice() <= maxPrice)
                .collect(Collectors.toList());
    }

    public static List<TV> getTvSortedByPriceAscending(List<TV> tvSets) {
        return tvSets.stream().sorted(Comparator.comparingDouble(tv -> tv.getPrice()))
                .collect(Collectors.toList());
    }

    public static List<TV> getTVSortedByPriceDescending(List<TV> tvSets) {
        return tvSets.stream()
                .sorted(Comparator.comparingDouble(TV::getPrice).reversed())
                .collect(Collectors.toList());
    }

    public static List<TV> getTvSortedByDiagonalAscending(List<TV> tvSets) {
        return tvSets.stream()
                .sorted(Comparator.comparingDouble(tv -> tv.getDiagonal()))
                .collect(Collectors.toList());
    }

    public static List<TV> getTvSortedByDiagonalDescending(List<TV> tvSets) {
        return tvSets.stream()
                .sorted(Comparator.comparingDouble(TV::getDiagonal).reversed())
                .collect(Collectors.toList());
    }
}
