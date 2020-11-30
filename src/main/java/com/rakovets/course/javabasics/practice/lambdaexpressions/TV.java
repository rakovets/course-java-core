package com.rakovets.course.javabasics.practice.lambdaexpressions;

import java.util.List;
import java.util.stream.Collectors;

public class TV {
    public static List<TVSet> getTVSetsWithDiagonal(List<TVSet> list, int diagonal) {
        return list.stream().
                filter(tv -> tv.getDiagonal() == diagonal).
                collect(Collectors.toList());
    }
    public static List<TVSet> getTVSetsManufacturedBy(List<TVSet> list, String nameOfManufacturer) {
        return list.stream().
                filter(tv -> tv.getManufacturer().equals(nameOfManufacturer)).
                collect(Collectors.toList());
    }
    public static List<TVSet> getTVSetsNotOlderThan(List<TVSet> list, String year) {
        return list.stream().
                filter(tv -> tv.getYearOfManufacture().compareTo(year) >= 0).
                collect(Collectors.toList());
    }
    public static List<TVSet> getTVSetsWithPriceFromTo(List<TVSet> list, int minPrice, int maxPrice) {
        return list.stream().
                filter(tv -> tv.getPrice() >= minPrice && tv.getPrice() <= maxPrice).
                collect(Collectors.toList());
    }
    public static List<TVSet> getSortedTVSetsByPrice(List<TVSet> list, boolean isAscendingOrder) {
            return list.stream().
                    sorted(new TVPriceComparator(isAscendingOrder)).
                    collect(Collectors.toList());
    }
    public static List<TVSet> getSortedTVSetsByDiagonal(List<TVSet> list, boolean isAscendingOrder) {
        return list.stream().
                sorted(new TVDiagonalComparator(isAscendingOrder)).
                collect(Collectors.toList());
    }
}
