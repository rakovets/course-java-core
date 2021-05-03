package com.rakovets.course.java.core.practice.lambda_expressions;

import java.util.ArrayList;
import java.util.List;

public class TvHelperDemo {
    public static void main(String[] args) {
        List<Tv> tvs = new ArrayList<>();
        tvs.add(new Tv("Samsung", "SM-123", 2019, 27.5, 1000.65));
        tvs.add(new Tv("Samsung", "SM-124", 2020, 30.5, 1200.65));
        tvs.add(new Tv("Samsung", "SM-125", 2021, 33.5, 1300.65));
        tvs.add(new Tv("Philips", "P-123", 2019, 27.5, 1000.65));
        tvs.add(new Tv("Philips", "P-124", 2020, 30.5, 1200.65));
        tvs.add(new Tv("Philips", "P-125", 2021, 33.5, 1300.65));
        tvs.add(new Tv("LG", "L-123", 2019, 27.5, 1000.65));
        tvs.add(new Tv("LG", "L-124", 2020, 30.5, 1200.65));
        tvs.add(new Tv("LG", "L-125", 2020, 30.5, 1300.65));
        tvs.add(new Tv("Horizont", "H-123", 2019, 27.5, 1200.65));
        tvs.add(new Tv("Horizont", "H-124", 2020, 33.5, 1300.65));
        System.out.println(TvHelper.getTvWithNeededScreenSize(tvs, 30.5).toString());
        System.out.println(TvHelper.getTvWithNeededBrand(tvs, "LG").toString());
        System.out.println(TvHelper.getTvAfterNeededYearOfProduction(tvs, 2020).toString());
        System.out.println(TvHelper.getTvWithPriceBetween(tvs, 1000, 1300).toString());
        System.out.println(TvHelper.getTvsSortedByAscendingPrice(tvs).toString());
        System.out.println(TvHelper.getTvsSortedByDescendingPrice(tvs).toString());
        System.out.println(TvHelper.getTvsSortedByAscendingScreenSize(tvs).toString());
        System.out.println(TvHelper.getTvsSortedByDescendingScreenSize(tvs).toString());
    }
}
