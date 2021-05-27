package com.rakovets.course.java.core.practice.lambda_expressions.tv;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class TvDemo {
    public static void main(String[] args) {
        Collection<TvModel> tvModels = new ArrayList<>(Arrays.asList(
                new TvModel("Samsung", "UE32T5300AU", 2020, 32, 726.1),
                new TvModel("LG", "32LK519B", 2018, 32, 527.4),
                new TvModel("Sony", "KDL-50WF665", 2018, 49.5, 1375.0),
                new TvModel("Philips", "43PFS5505", 2020, 43, 686.0),
                new TvModel("Panasonic", "TX-32FR250K", 2018, 31.5, 565.0),
                new TvModel("Samsung", "UE43TU7090U", 2020, 43, 1015.0)));

        System.out.println(Tv.tvWithGivenDiagonal(tvModels, 43));
        System.out.println(Tv.tvWithGivenManufacture(tvModels, "LG"));
        System.out.println(Tv.tvNotOlderThanGivenYear(tvModels, 2019));
        System.out.println(Tv.tvWithGivenPrice(tvModels, 600.0, 1200.0));
        System.out.println(Tv.tvSortedByPriceAscending(tvModels));
        System.out.println(Tv.tvSortedByPriceDescending(tvModels));
        System.out.println(Tv.tvSortedByDiagonalAscending(tvModels));
        System.out.println(Tv.tvSortedByDiagonalDescending(tvModels));
    }
}
