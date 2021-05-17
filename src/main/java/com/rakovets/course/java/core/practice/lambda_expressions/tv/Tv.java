package com.rakovets.course.java.core.practice.lambda_expressions.tv;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Tv {
    public static void tvWithGivenDiagonal(Collection<TvModel> tvModels, double diagonal) {
        tvModels.stream()
                .filter(d -> d.getDiagonal() == diagonal)
                .forEach(System.out::println);
    }

    public static void tvWithGivenManufacture(Collection<TvModel> tvModels, String manufacture) {
        tvModels.stream()
                .filter(m -> m.getManufacture().equals(manufacture))
                .forEach(System.out::println);
    }

    public static void tvNotOlderThanGivenYear(Collection<TvModel> tvModels, int yearIssue) {
        tvModels.stream()
                .filter(y -> y.getYearIssue() > yearIssue)
                .forEach(System.out::println);
    }

    public static void tvWithGivenPrice(Collection<TvModel> tvModels, double startPrice, double endPrice) {
        tvModels.stream()
                .filter(p -> p.getPrice() >= startPrice && p.getPrice() <= endPrice)
                .forEach(System.out::println);
    }

    public static void tvSortedByPriceAscending(Collection<TvModel> tvModels) {
        Collections.addAll(tvModels);
        tvModels.stream()
                .sorted(Comparator.comparing(TvModel::getPrice))
                .forEach(System.out::println);
    }

    public static void tvSortedByPriceDescending(Collection<TvModel> tvModels) {
        Collections.addAll(tvModels);
        tvModels.stream()
                .sorted(Comparator.comparing(TvModel::getPrice).reversed())
                .forEach(System.out::println);
    }

    public static void tvSortedByDiagonalAscending(Collection<TvModel> tvModels) {
        Collections.addAll(tvModels);
        tvModels.stream()
                .sorted(Comparator.comparing(TvModel::getDiagonal))
                .forEach(System.out::println);
    }

    public static void tvSortedByDiagonalDescending(Collection<TvModel> tvModels) {
        Collections.addAll(tvModels);
        tvModels.stream()
                .sorted(Comparator.comparing(TvModel::getDiagonal).reversed())
                .forEach(System.out::println);
    }
}
