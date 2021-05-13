package com.rakovets.course.java.core.practice.lambda_expressions.project_tv;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TvUtility {
    public static List<Tv> getTvDiagonale(List<Tv> tv, double diagonale) {
        return tv.stream()
                .filter(tvs -> tvs.getDiagonal() == diagonale)
                .collect(Collectors.toList());
    }

    public static List<Tv> getTvCompany(List<Tv> tv, String company) {
        return tv.stream()
                .filter(tvs -> tvs.getCompany().equals(company))
                .collect(Collectors.toList());
    }

    public static List<Tv> getTvYears(List<Tv> tv, int years) {
        return tv.stream()
                .filter(tvs -> tvs.getYear() > years)
                .collect(Collectors.toList());
    }

    public static List<Tv> getTvCostDia(List<Tv> tv, int priceFrom, int priceTill) {
        return tv.stream()
                .filter(tvs -> tvs.getPrice() > priceFrom && tvs.getPrice() < priceTill)
                .collect(Collectors.toList());
    }

    public static List<Tv> getTvSortedByPriceAscending(List<Tv> tvSets) {
        return tvSets.stream().sorted(Comparator.comparingDouble(Tv::getPrice))
                .collect(Collectors.toList());
    }

    public static List<Tv> getTVSortedByPriceDescending(List<Tv> tvSets) {
        return tvSets.stream()
                .sorted(Comparator.comparingDouble(Tv::getPrice).reversed())
                .collect(Collectors.toList());
    }

    public static List<Tv> getTvSortedByDiagonalAscending(List<Tv> tvSets) {
        return tvSets.stream()
                .sorted(Comparator.comparingDouble(Tv::getDiagonal))
                .collect(Collectors.toList());
    }

    public static List<Tv> getTvSortedByDiagonalDescending(List<Tv> tvSets) {
        return tvSets.stream()
                .sorted(Comparator.comparingDouble(Tv::getDiagonal).reversed())
                .collect(Collectors.toList());
    }
}
