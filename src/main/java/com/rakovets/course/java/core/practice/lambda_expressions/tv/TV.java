package com.rakovets.course.java.core.practice.lambda_expressions.tv;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TV {
    public static List<Television> getTelevisionWithCertainDiagonal(List<Television> televisions, int diagonal) {
        List<Television> list = televisions.stream()
                .filter(x -> x.getDiagonal() == diagonal)
                .collect(Collectors.toList());
        return list;
    }

    public static List<Television> getTelevisionOfCertainCompany(List<Television> televisions, String company) {
        List<Television> list = televisions.stream()
                .filter(x -> x.getCompany().equals(company))
                .collect(Collectors.toList());
        return list;
    }

    public static List<Television> getTelevisionOfCertainYear(List<Television> televisions, int year) {
        List<Television> list = televisions.stream()
                .filter(x -> x.getYear() >= year)
                .collect(Collectors.toList());
        return list;
    }

    public static List<Television> getTelevisionOfCertainPrice(List<Television> televisions, int minPrice, int maxPrice) {
        List<Television> list = televisions.stream()
                .filter(x -> x.getPrice() >= minPrice && x.getPrice() <= maxPrice)
                .collect(Collectors.toList());
        return list;
    }

    public static List<Television> sortedByPriceAscending(List<Television> televisions) {
        List<Television> list = televisions.stream()
                .sorted(Comparator.comparingInt(x -> x.getPrice()))
                .collect(Collectors.toList());
        return list;
    }

    public static List<Television> sortedByPriceDescending(List<Television> televisions) {
        List<Television> list = televisions.stream()
                .sorted(Comparator.comparingInt(x -> x.getPrice() * -1))
                .collect(Collectors.toList());
        return list;
    }

    public static List<Television> sortedByDiagonalAscending(List<Television> televisions) {
        List<Television> list = televisions.stream()
                .sorted(Comparator.comparingInt(x -> x.getDiagonal()))
                .collect(Collectors.toList());
        return list;
    }

    public static List<Television> sortedByDiagonalDescending(List<Television> televisions) {
        List<Television> list = televisions.stream()
                .sorted(Comparator.comparingInt(x -> x.getDiagonal() * -1))
                .collect(Collectors.toList());
        return list;
    }
}
