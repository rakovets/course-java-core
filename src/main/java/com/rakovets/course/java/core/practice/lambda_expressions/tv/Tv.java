package com.rakovets.course.java.core.practice.lambda_expressions.tv;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Tv {
    public static List<TvModel> tvWithGivenDiagonal(Collection<TvModel> tvModels, double diagonal) {
        return tvModels.stream()
                .filter(d -> d.getDiagonal() == diagonal)
                .collect(Collectors.toList());
    }

    public static List<TvModel> tvWithGivenManufacture(Collection<TvModel> tvModels, String manufacture) {
        return tvModels.stream()
                .filter(m -> m.getManufacture().equals(manufacture))
                .collect(Collectors.toList());
    }

    public static List<TvModel> tvNotOlderThanGivenYear(Collection<TvModel> tvModels, int yearIssue) {
        return tvModels.stream()
                .filter(y -> y.getYearIssue() > yearIssue)
                .collect(Collectors.toList());
    }

    public static List<TvModel> tvWithGivenPrice(Collection<TvModel> tvModels, double startPrice, double endPrice) {
        return tvModels.stream()
                .filter(p -> p.getPrice() >= startPrice && p.getPrice() <= endPrice)
                .collect(Collectors.toList());
    }

    public static List<TvModel> tvSortedByPriceAscending(Collection<TvModel> tvModels) {
        Collections.addAll(tvModels);
        return tvModels.stream()
                .sorted(Comparator.comparing(TvModel::getPrice))
                .collect(Collectors.toList());
    }

    public static List<TvModel> tvSortedByPriceDescending(Collection<TvModel> tvModels) {
        Collections.addAll(tvModels);
        return tvModels.stream()
                .sorted(Comparator.comparing(TvModel::getPrice).reversed())
                .collect(Collectors.toList());
    }

    public static List<TvModel> tvSortedByDiagonalAscending(Collection<TvModel> tvModels) {
        Collections.addAll(tvModels);
        return tvModels.stream()
                .sorted(Comparator.comparing(TvModel::getDiagonal))
                .collect(Collectors.toList());
    }

    public static List<TvModel> tvSortedByDiagonalDescending(Collection<TvModel> tvModels) {
        Collections.addAll(tvModels);
        return tvModels.stream()
                .sorted(Comparator.comparing(TvModel::getDiagonal).reversed())
                .collect(Collectors.toList());
    }
}
