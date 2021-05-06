package com.rakovets.course.java.core.practice.lambda_expressions.tv;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TV {
    public static List<Television> getTelevisionWithCertainDiagonal(List<Television> televisions, int diagonal) {
        List<Television> list = new ArrayList<>();
        televisions.stream().filter(x -> x.getDiagonal() == diagonal).forEach(x -> list.add(x));
        return list;
    }

    public static List<Television> getTelevisionOfCertainCompany(List<Television> televisions, String company) {
        List<Television> list = new ArrayList<>();
        televisions.stream().filter(x -> x.getCompany().equals(company)).forEach(x -> list.add(x));
        return list;
    }

    public static List<Television> getTelevisionOfCertainYear(List<Television> televisions, int year) {
        List<Television> list = new ArrayList<>();
        televisions.stream().filter(x -> x.getYear() >= year).forEach(x -> list.add(x));
        return list;
    }

    public static List<Television> getTelevisionOfCertainPrice(List<Television> televisions, int minPrice, int maxPrice) {
        List<Television> list = new ArrayList<>();
        televisions.stream().filter(x -> x.getPrice() >= minPrice && x.getPrice() <= maxPrice).forEach(x -> list.add(x));
        return list;
    }

    public static List<Television> sortedByPriceAscending(List<Television> televisions) {
        List<Television> list = new ArrayList<>();
        televisions.stream().sorted(Comparator.comparingInt(x -> x.getPrice())).forEach(x -> list.add(x));
        return list;
    }

    public static List<Television> sortedByPriceDescending(List<Television> televisions) {
        List<Television> list = new ArrayList<>();
        televisions.stream().sorted(Comparator.comparingInt(x -> x.getPrice() * -1)).forEach(x -> list.add(x));
        return list;
    }

    public static List<Television> sortedByDiagonalAscending(List<Television> televisions) {
        List<Television> list = new ArrayList<>();
        televisions.stream().sorted(Comparator.comparingInt(x -> x.getDiagonal())).forEach(x -> list.add(x));
        return list;
    }

    public static List<Television> sortedByDiagonalDescending(List<Television> televisions) {
        List<Television> list = new ArrayList<>();
        televisions.stream().sorted(Comparator.comparingInt(x -> x.getDiagonal() * -1)).forEach(x -> list.add(x));
        return list;
    }

}
