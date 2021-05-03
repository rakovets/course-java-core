package com.rakovets.course.java.core.practice.lambda_expressions;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TvHelper {

    public static List<Tv> getTvWithNeededScreenSize(List<Tv> tvs, double screenSize){
        return tvs.stream()
                .filter(tv -> tv.getScreenSize() == screenSize)
                .collect(Collectors.toList());
    }

    public static List<Tv> getTvWithNeededBrand(List<Tv> tvs, String brand){
       return tvs.stream()
                .filter(tv -> tv.getBrand().equals(brand))
                .collect(Collectors.toList());
    }

    public static List<Tv> getTvAfterNeededYearOfProduction(List<Tv> tvs, int year) {
        return tvs.stream()
                .filter(tv -> tv.getYearOfProduction() >= year)
                .collect(Collectors.toList());
    }

    public static List<Tv> getTvWithPriceBetween(List<Tv> tvs, double minimalPriceBound, double maximumPriceBound) {
        return tvs.stream()
                .filter(tv -> tv.getPrice() >= minimalPriceBound && tv.getPrice() <= maximumPriceBound)
                .collect(Collectors.toList());
    }

    public static List<Tv> getTvsSortedByAscendingPrice(List<Tv> tvs) {
        return tvs.stream()
                .sorted(Comparator.comparingDouble(Tv::getPrice))
                .collect(Collectors.toList());
    }

    public static List<Tv> getTvsSortedByDescendingPrice(List<Tv> tvs) {
        return tvs.stream()
                .sorted(Comparator.comparingDouble(Tv::getPrice).reversed())
                .collect(Collectors.toList());
    }

    public static List<Tv> getTvsSortedByAscendingScreenSize(List<Tv> tvs) {
        return tvs.stream()
                .sorted(Comparator.comparingDouble(Tv::getScreenSize))
                .collect(Collectors.toList());
    }

    public static List<Tv> getTvsSortedByDescendingScreenSize(List<Tv> tvs) {
        return tvs.stream()
                .sorted(Comparator.comparingDouble(Tv::getScreenSize).reversed())
                .collect(Collectors.toList());
    }







}
