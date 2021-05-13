package com.rakovets.course.java.core.practice.lambda_expressions;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class TVHelperDemo {
    public static void main(String[] args) {

        List<TV> tvList = List.of(
                new TV("LG", "GFX123", 2016, 32, 250),
                new TV("Toshiba", "SX165", 2019, 40, 320),
                new TV("LG", "GFX321", 2020, 55, 1200),
                new TV("Samsung", "Sl55ESSD", 2020, 50, 1000),
                new TV("Horizont", "33102", 1999, 15, 60)
        );
        System.out.println("Get TV with diagonal : " + TVHelper.getTVByDiagonal(tvList,32).toString());
        System.out.println("Get TV with brand : " + TVHelper.getTVByBrand(tvList,"LG"));
        System.out.println("Get TV not older than N year: " + TVHelper.getTVYoungerYear(tvList,2018));
        System.out.println("Get TV in the price range: " + TVHelper.getTvInThePriceRange(tvList,800,1200));
        System.out.println("Get TV sorted by price ascending: " + TVHelper.getTVSortedByPriceAscending(tvList));
        System.out.println("Get tv sorted by price descending: " + TVHelper.getTVSortedByPriceDescending(tvList));
        System.out.println("Get tv sorted by diagonal ascending: " + TVHelper.getTVSortedByDiagonalAscending(tvList));
        System.out.println("Get tv sorted by diagonal descending: " + TVHelper.getTVSortedByDiagonalDescending(tvList));

    }
}
