package com.rakovets.course.java.core.practice.lambda_expressions.project_tv;

import java.util.List;
import java.util.stream.Collectors;

public class TV {
    public static List<TVitem> getTvWithDiagonal(List<TVitem> tvlist, int diagonal) {
        return tvlist
                .stream().filter(d -> d.getDiagonal() == diagonal)
                .collect(Collectors.toList());
    }

    public static List<TVitem> getTvWithBrand(List<TVitem> tvlist, String brand) {
        return tvlist
                .stream().filter(d -> d.getBrand().equals(brand))
                .collect(Collectors.toList());
    }

    public static List<TVitem> getTvWithNotOlderYear(List<TVitem> tvlist, int year) {
        return tvlist
                .stream().filter(d -> d.getYear() >= year)
                .collect(Collectors.toList());
    }

    public static List<TVitem> getTvWithPriceRange(List<TVitem> tvlist, int priceStart, int priceEnd) {
        return tvlist
                .stream().filter(d -> d.getPrice() > priceStart)
                .filter(d -> d.getPrice() < priceEnd)
                .collect(Collectors.toList());
    }

    public static List<TVitem> sortTvWithPrice(List<TVitem> tvlist, boolean ascending) {
        return tvlist
                .stream().sorted(ascending ? new TVPriceComparator() : new TVPriceComparator().reversed())
                .collect(Collectors.toList());
    }

    public static List<TVitem> sortTvWithDiagonal(List<TVitem> tvlist, boolean ascending) {
        return tvlist
                .stream().sorted(ascending ? new TVDiagonalComparator() : new TVDiagonalComparator().reversed())
                .collect(Collectors.toList());
    }
}
