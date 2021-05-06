package com.rakovets.course.java.core.practice.lambda_expressions.TV;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public abstract class SorterForTV {
    public static List<TV> getWithDiagonal(List<TV> list, double diagonal) {
        return list.stream()
                .filter(item -> item.getDiagonal() == diagonal)
                .collect(Collectors.toList());
    }

    public static List<TV> getOfProducer(List<TV> list, String brand) {
        return list.stream()
                .filter(item -> item.getProducer().equalsIgnoreCase(brand))
                .collect(Collectors.toList());
    }

    public static List<TV> getAfterProductionYear(List<TV> list, int year) {
        return list.stream()
                .filter(item -> item.getProductionYear() >= year)
                .collect(Collectors.toList());
    }

    public static List<TV> getPriceBetween(List<TV> list, double lowestPrice, double maxPrice) {
        return list.stream()
                .filter(item -> item.getPrice() >= lowestPrice && item.getPrice() <= maxPrice)
                .collect(Collectors.toList());
    }

    public static List<TV> getAscendingPrice(List<TV> list) {
        return list.stream()
                .sorted(Comparator.comparing(TV::getPrice))
                .collect(Collectors.toList());
    }

    public static List<TV> getDescendingPrice(List<TV> list) {
        return list.stream()
                .sorted(Comparator.comparing(TV::getPrice).reversed())
                .collect(Collectors.toList());
    }

    public static List<TV> getAscendingDiagonal(List<TV> list) {
        return list.stream()
                .sorted(Comparator.comparing(TV::getDiagonal))
                .collect(Collectors.toList());
    }

    public static List<TV> getDescendingDiagonal(List<TV> list) {
        return list.stream()
                .sorted(Comparator.comparing(TV::getDiagonal).reversed())
                .collect(Collectors.toList());
    }
}
