package com.rakovets.course.javabasics.practice.lambdaexpressions.streams;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ProjectTV {

    public static List<TV> getTVsByDiagonal(List<TV> tvList, int diagonal) {
        return tvList.stream().filter(i -> i.getDiagonal() == diagonal).collect(Collectors.toList());
    }

    public static List<TV> getTVsByProducer(List<TV> tvList, String producer) {
        return tvList.stream().filter(i -> i.getNameProducer().equals(producer)).collect(Collectors.toList());
    }

    public static List<TV> getTVsNewerThanSpecifiedYear(List<TV> tvList, int year) {
        return tvList.stream().filter(i -> i.getYear() > year).collect(Collectors.toList());
    }

    public static List<TV> getTVsBetweenPrices(List<TV> tvList, int lowBound, int highBound) {
        return tvList.stream().filter(i -> i.getCost() > lowBound && i.getCost() < highBound).collect(Collectors.toList());
    }

    public static List<TV> sortTVsByCostAsc(List<TV> tvList) {
        return tvList.stream().sorted(Comparator.comparingInt(TV::getCost)).collect(Collectors.toList());
    }

    public static List<TV> sortTVsByCostDesc(List<TV> tvList) {
        return tvList.stream().sorted(Comparator.comparingInt(TV::getCost).reversed()).collect(Collectors.toList());
    }

    public static List<TV> sortTVsByDiagonalAsc(List<TV> tvList) {
        return tvList.stream().sorted(Comparator.comparingInt(TV::getDiagonal)).collect(Collectors.toList());
    }

    public static List<TV> sortTVsByDiagonalDesc(List<TV> tvList) {
        return tvList.stream().sorted(Comparator.comparingInt(TV::getDiagonal).reversed()).collect(Collectors.toList());
    }
}

