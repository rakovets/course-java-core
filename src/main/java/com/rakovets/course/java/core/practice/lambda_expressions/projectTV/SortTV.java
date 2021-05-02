package com.rakovets.course.java.core.practice.lambda_expressions.projectTV;

import com.rakovets.course.java.core.practice.lambda_expressions.projectTV.comparators.DiagonalComparatorAscending;
import com.rakovets.course.java.core.practice.lambda_expressions.projectTV.comparators.DiagonalComparatorDescending;
import com.rakovets.course.java.core.practice.lambda_expressions.projectTV.comparators.PriceComparatorAscending;
import com.rakovets.course.java.core.practice.lambda_expressions.projectTV.comparators.PriceComparatorDescending;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class SortTV {
    public static List<TV> getTVDiagonally(Collection<TV> tvList, int diagonal) {
        return tvList.stream()
                .filter(n -> n.getDiagonal() == diagonal)
                .collect(Collectors.toList());
    }

    public static List<TV> getSpecifiedTV(Collection<TV> tvList, String name) {
        return tvList.stream()
                .filter(n -> n.getManufacturer().equalsIgnoreCase(name))
                .collect(Collectors.toList());
    }

    public static List<TV> getTVNoMoreThanSpecifiedYearsOld(Collection<TV> tvList, int year) {
        return tvList.stream()
                .filter(n -> n.getYear() <= year)
                .collect(Collectors.toList());
    }

    public static List<TV> getTVFromPriceDiapason(Collection<TV> tvList, int minPrice, int maxPrice) {
        return tvList.stream()
                .filter(n -> n.getPrice() >= minPrice && n.getPrice() <= maxPrice)
                .collect(Collectors.toList());
    }

    public static List<TV> getAscendingSortedTVByPrice(Collection<TV> tvList) {
        return tvList.stream()
                .sorted(new PriceComparatorAscending())
                .collect(Collectors.toList());
    }

    public static List<TV> getDescendingSortedTVByPrice(Collection<TV> tvList) {
        return tvList.stream()
                .sorted(new PriceComparatorDescending())
                .collect(Collectors.toList());
    }

    public static List<TV> getAscendingSortedTVByDiagonal(Collection<TV> tvList) {
        return tvList.stream()
                .sorted(new DiagonalComparatorAscending())
                .collect(Collectors.toList());
    }

    public static List<TV> getDescendingSortedTVByDiagonal(Collection<TV> tvList) {
        return tvList.stream()
                .sorted(new DiagonalComparatorDescending())
                .collect(Collectors.toList());
    }
}
