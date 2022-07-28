package com.rakovets.course.java.core.practice.lambda_expressions;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TvSeller {

    public List<Tv> getTvsOfSpecificDiagonal(List<Tv> tvs, float diagonal) {
        return tvs.stream()
                .filter(c -> c.getDiagonal() == diagonal)
                .collect(Collectors.toList());
    }

    public List<Tv> getTvsOfSpecificManufacturer(List<Tv> tvs, String manufacturer) {
        return tvs.stream()
                .filter(c -> c.getManufacturer().equalsIgnoreCase(manufacturer))
                .collect(Collectors.toList());
    }

    public List<Tv> getTvsNotOlderThanSpecificYearOfProduction(List<Tv> tvs, int yearOfProduction) {
        return tvs.stream()
                .filter(c -> c.getYearOfProduction() >= yearOfProduction)
                .collect(Collectors.toList());
    }

    public List<Tv> getTvsOfPriceRange(List<Tv> tvs, float lowerBound, float higherBound) {
        return tvs.stream()
                .filter(c -> c.getPrice() > lowerBound && c.getPrice() < higherBound)
                .collect(Collectors.toList());
    }

    public List<Tv> getSortedByPrice(List<Tv> tvs, boolean isAscending) {
        return isAscending ? tvs.stream()
                .sorted(Comparator.comparing(Tv::getPrice))
                .collect(Collectors.toList()) :
                tvs.stream()
                        .sorted(Comparator.comparing(Tv::getPrice).reversed())
                        .collect(Collectors.toList());
    }

    public List<Tv> getSortedByDiagonal(List<Tv> tvs, boolean isAscending) {
        return isAscending ? tvs.stream()
                .sorted(Comparator.comparing(Tv::getDiagonal))
                .collect(Collectors.toList()) :
                tvs.stream()
                        .sorted(Comparator.comparing(Tv::getDiagonal).reversed())
                        .collect(Collectors.toList());
    }
}
