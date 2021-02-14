package com.rakovets.course.java.core.practice.lambda_expressions.TV;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TVUtilityClass {
    private final List<TV> tv;

    public TVUtilityClass(List<TV> tv) {
        this.tv = tv;
    }

    public List<TV> specificDiagonal(int diagonal) {
        return tv.stream()
                .filter(tv -> tv.getDiagonal() == diagonal)
                .collect(Collectors.toList());
    }

    public List<TV> specificManufacturer(String manufacturer) {
        return tv.stream()
                .filter(tv -> tv.getManufacturer().equals(manufacturer))
                .collect(Collectors.toList());
    }

    public List<TV> specificYear(int year) {
        return tv.stream()
                .filter(tv -> tv.getYear() >= year)
                .collect(Collectors.toList());
    }

    public List<TV> specificPrice(double minPrice, double maxPrice) {
        return tv.stream()
                .filter(tv -> tv.getPrice() >= minPrice && tv.getPrice() <= maxPrice)
                .collect(Collectors.toList());
    }

    public List<TV> sortedByPriceAscending() {
        return tv.stream()
                .sorted(Comparator.comparingDouble(TV::getPrice))
                .collect(Collectors.toList());
    }

    public List<TV> sortedByPriceDescending() {
        return tv.stream()
                .sorted(Comparator.comparingDouble(TV::getPrice).reversed())
                .collect(Collectors.toList());
    }

    public List<TV> sortedByDiagonalAscending() {
        return tv.stream()
                .sorted(Comparator.comparingInt(TV::getDiagonal))
                .collect(Collectors.toList());
    }

    public List<TV> sortedByDiagonalDescending() {
        return tv.stream()
                .sorted(Comparator.comparingInt(TV::getDiagonal).reversed())
                .collect(Collectors.toList());
    }
}
