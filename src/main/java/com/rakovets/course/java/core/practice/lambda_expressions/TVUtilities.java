package com.rakovets.course.java.core.practice.lambda_expressions;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public abstract class TVUtilities {

    public static List<TV> getDiagonal(List<TV> list, double diagonal) {
        return list.stream()
                .filter(s -> s.getDiagonal() == diagonal)
                .collect(Collectors.toList());
    }

    public static List<TV> getManufacturer(List<TV> list, String manufacturer) {
        return list.stream()
                .filter(m -> m.getManufacturer().equals(manufacturer))
                .collect(Collectors.toList());
    }

    public static List<TV> getProductionYear(List<TV> list, int productionYear) {
        return list.stream()
                .filter(p -> p.getProductionYear() == productionYear)
                .collect(Collectors.toList());
    }

    public static List<TV> getCostRange(List<TV> list, double start, double end) {
        return list.stream()
                .filter(c -> c.getCost() > start && c.getCost() < end)
                .collect(Collectors.toList());
    }

    public static List<TV> getCostAsc(List<TV> list) {
        return list.stream()
                .sorted(Comparator.comparing(TV::getCost))
                .collect(Collectors.toList());
    }

    public static List<TV> getCostDesc(List<TV> list) {
        return list.stream()
                .sorted(Comparator.comparing(TV::getCost).reversed())
                .collect(Collectors.toList());
    }

    public static List<TV> getDiagonalAsc(List<TV> list) {
        return list.stream()
                .sorted(Comparator.comparing(TV::getDiagonal))
                .collect(Collectors.toList());
    }

    public static List<TV> getDiagonalDesc(List<TV> list) {
        return list.stream()
                .sorted(Comparator.comparing(TV::getDiagonal).reversed())
                .collect(Collectors.toList());
    }
}
