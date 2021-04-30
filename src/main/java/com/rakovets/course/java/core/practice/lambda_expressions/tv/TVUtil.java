package com.rakovets.course.java.core.practice.lambda_expressions.tv;

import java.util.*;
import java.util.stream.Collectors;

public class TVUtil {

    public static Collection<TV> getDiagonal(Collection<TV> listTV, double diagonal) {
        return listTV.stream()
                .filter(l -> l.getDiagonal() == diagonal)
                .collect(Collectors.toList());
    }

    public static Collection<TV> getManufacturer(Collection<TV> list, String manufacturer) {
        return list.stream()
                .filter(l -> l.getManufacturer().equals(manufacturer))
                .collect(Collectors.toList());
    }

    public static Collection<TV> getNotOlderYear(Collection<TV> list, int year) {
        return list.stream()
                .filter(l -> l.getYear() <= year)
                .collect(Collectors.toList());
    }

    public static Collection<TV> getIntervalPrice(Collection<TV> list, double floorPrice, double ceilPrice) {
        return list.stream()
                .filter(l -> l.getPrice() >= floorPrice && l.getPrice() <= ceilPrice)
                .collect(Collectors.toList());
    }

    public static void sortPriceUp(List<TV> list) {
        list.sort(Comparator.comparingInt(TV::getPrice));
    }

    public static void sortPriceDown(List<TV> list) {
        list.sort((o1, o2) -> o2.getPrice() - o1.getPrice());
    }

    public static void sortDiagonalUp(List<TV> list) {
        list.sort((Comparator.comparingDouble(TV::getDiagonal)));
    }

    public static void sortDiagonalDown(List<TV> list) {
        list.sort((o1, o2) -> Double.compare(o2.getDiagonal(), o1.getDiagonal()));
    }
}
