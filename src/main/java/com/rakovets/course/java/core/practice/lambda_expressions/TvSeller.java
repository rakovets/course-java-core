package com.rakovets.course.java.core.practice.lambda_expressions;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TvSeller {

    public List<Tv> getTvsOfSpecificDiagonal(List<Tv> tvs, double diagonal) {
        return tvs.stream()
                .filter(c -> c.getDiagonal() == diagonal)
                .collect(Collectors.toList());
    }

    public List<Tv> getTvsOfSpecificManufacturerIgnoreCase(List<Tv> tvs, String manufacturer) {
        return tvs.stream()
                .filter(c -> c.getManufacturer().equalsIgnoreCase(manufacturer))
                .collect(Collectors.toList());
    }

    public List<Tv> getTvsNotOlderThanSpecificYearOfProduction(List<Tv> tvs, int yearOfProduction) {
        return tvs.stream()
                .filter(c -> c.getYearOfProduction() >= yearOfProduction)
                .collect(Collectors.toList());
    }

    public List<Tv> getTvsOfPriceRange(List<Tv> tvs, double lowerBound, double higherBound) {
        return tvs.stream()
                .filter(c -> c.getPrice() >= lowerBound && c.getPrice() <= higherBound)
                .collect(Collectors.toList());
    }

    public List<Tv> getSortedByPrice(List<Tv> tvs, boolean isAscending) {
        Comparator<Tv> byPrice = Comparator.comparing(Tv::getPrice);
        if (!isAscending) {
            byPrice = Comparator.comparing(Tv::getPrice).reversed();
        }
        return tvs.stream()
                .sorted(byPrice)
                .collect(Collectors.toList());
    }

    public List<Tv> getSortedByDiagonal(List<Tv> tvs, boolean isAscending) {
        Comparator<Tv> byDiagonal = Comparator.comparing(Tv::getDiagonal);
        if (!isAscending) {
            byDiagonal = Comparator.comparing(Tv::getDiagonal).reversed();
        }
        return tvs.stream()
                .sorted(byDiagonal)
                .collect(Collectors.toList());
    }
}
