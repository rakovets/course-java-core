package com.rakovets.course.java.core.practice.lambda_expressions.tv;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class InformationSystemTv {
    public List<Television> televisions;

    public InformationSystemTv(List<Television> televisions) {
        this.televisions = televisions;
    }

    public List<Television> getTelevisionGivenDiagonal(List<Television> televisions, double diagonal) {
        return televisions.stream()
                .filter(d -> d.getDiagonal() == diagonal)
                .collect(Collectors.toList());
    }

    public List<Television> getTelevisionGivenManufacturer(List<Television> televisions, String manufacturer) {
        return televisions.stream()
                .filter(m -> m.getManufacturer() == manufacturer)
                .collect(Collectors.toList());
    }

    public List<Television> getTelevisionGivenMinYearOfProduction(List<Television> televisions, int yearOfProduction) {
        return televisions.stream()
                .filter(y -> y.getYearOfProduction() < yearOfProduction)
                .collect(Collectors.toList());
    }

    public List<Television> getTelevisionGivenRangePrice(List<Television> televisions, double minPrice, double maxPrice) {
        return televisions.stream()
                .filter(p -> p.getPrice() > minPrice && p.getPrice() < maxPrice)
                .collect(Collectors.toList());
    }

    public List<Television> getTelevisionSortedMinMaxPrice(List<Television> televisions) {
        return televisions.stream()
                .sorted(Comparator.comparing(p -> p.getPrice()))
                .collect(Collectors.toList());
    }

    public List<Television> getTelevisionSortedMaxMinPrice(List<Television> televisions) {
        return televisions.stream()
                .sorted(Comparator.comparing(p -> - p.getPrice()))
                .collect(Collectors.toList());
    }

    public List<Television> getTelevisionSortedMinMaxDiagonal(List<Television> televisions) {
        return televisions.stream()
                .sorted(Comparator.comparing(d -> d.getDiagonal()))
                .collect(Collectors.toList());
    }

    public List<Television> getTelevisionSortedMaxMinDiagonal(List<Television> televisions) {
        return televisions.stream()
                .sorted(Comparator.comparing(d -> -d.getDiagonal()))
                .collect(Collectors.toList());
    }
}
